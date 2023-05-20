import java.util.*;
class Camera{
	ArrayList<Integer> id = new ArrayList<Integer>();
	ArrayList<String> brand = new ArrayList<String>();
	ArrayList<String> model = new ArrayList<String>();
	ArrayList<Double> price = new ArrayList<Double>();
	ArrayList<String> status = new ArrayList<String>();
	Camera()
	{
		id.add(0);brand.add("Nikon");model.add("D850");price.add(23900.0);status.add("Available");
		id.add(1);brand.add("Canon");model.add("MarkII");price.add(12319.0);status.add("Available");
		id.add(2);brand.add("Sony");model.add("A7 III");price.add(16999.00);status.add("Available");
	}
	void viewAllCam()
	{
		System.out.println("S.No\tCAMERA ID  BRAND\tMODEL \tPRICE\t\tSTATUS");
		for(int i=0;i<id.size();i++)
		{
			System.out.println((i+1)+"\t"+(id.get(i)+1)+"\t    "+brand.get(i)+"\t"+model.get(i)+" \t"+price.get(i)+"\t\t"+status.get(i));
		}
	}
	void addCam(String brand,String model,double price)
	{
		id.add(id.size());
		this.brand.add(brand);
		this.model.add(model);
		this.price.add(price);
		status.add("Available");
		System.out.println("Camera Added Successfully");
	}
	void remCam(int i)
	{
		id.remove(i);
		brand.remove(i);
		model.remove(i);
		price.remove(i);
		status.remove(i);
		System.out.println("Camera Removed Successfully");
	}
	double rentCam(int id)
	{
		if((status.get(id-1)).equals("Available")) 
		{
			status.set(id-1, "Rented");
			return price.get(id-1);
		}
		else
			return -1.0;
	}
	void myCam()
	{
		System.out.println("CAMERA ID\tBRAND\tMODEL\tPRICE\t\tSTATUS");
		for(int i=0;i<id.size();i++)
			if(status.get(i).equals("Rented"))
				System.out.println((id.get(i)+1)+"\t\t"+brand.get(i)+"\t"+
						model.get(i)+"\t"+price.get(i)+"\t\t"+status.get(i));
	}
}
class Wallet{
	double balance;
	Wallet()
	{
		balance=0.0;
	}
	double balance()
	{
		return balance;
	}
	double deposit(double val)
	{
		balance+=val;
		return balance;
	}
}
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Camera cam=new Camera();
		Wallet wal=new Wallet();
		System.out.println("Welcome to Camera Rental App");
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter a password:");
		String password=sc.next();
		int c=0;
		while(true)
		{
			System.out.println("\n1. My Camera\n2. Rent a Camera\n3. View All Cameras\n"
					+ "4. My Wallet\n5. Exit");
			System.out.println("Enter your choice:");
			c=sc.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("1. Add\n2. Remove\n3. View My Cameras\n4. Go to Previous Menu");
				c=sc.nextInt();
				switch(c)
				{
				case 1: 
					System.out.println("Enter the Camera Brand:");
					String brand=sc.next();
					System.out.println("Enter the Model:");
					String model=sc.next();
					System.out.println("Enter the per day price(INR):");
					double price=sc.nextFloat();
					cam.addCam(brand,model,price);
					break;
				case 2: 
					cam.viewAllCam();
					System.out.println("Enter the S.No of Camera to be removed:");
					int i=sc.nextInt();
					cam.remCam(i-1);
					break;
				case 3: cam.myCam();
				break;
				case 4: 
					break;
				default: System.out.println("Invalid Input!!");
				}
				break;
			case 2:
				cam.viewAllCam();
				System.out.println("Enter the S.No you want to rent:");
				int no=sc.nextInt();
				if(wal.balance>=cam.price.get(no-1))
				{
					double d=cam.rentCam(no);
					if(d!=-1.0)
					{
						System.out.println("The Camera is successfully rented");
						wal.balance=wal.balance-d;
					}
					else
						System.out.println("Error. Camera Not Available");
				}
				else
					System.out.println("Error. Insufficient Balance");
				break;
			case 3: cam.viewAllCam();
				break;
			case 4:
				System.out.println("Your current wallet balance is Rs. "+wal.balance());
				System.out.println("Do you want to deposit?(1.Yes 2.No)");
				c=sc.nextInt();
				if(c==1)
				{
					System.out.println("Enter the amount(INR):");
					double amt=sc.nextDouble();
					System.out.println("Success. Current balance is Rs. "+wal.deposit(amt));
				}
				break;
			case 5: 
				System.out.print("Thank You");
				System.exit(0);
			break;
			default: System.out.println("Invalid Input!!");
			}
		}
	}
}