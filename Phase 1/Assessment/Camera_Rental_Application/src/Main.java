import java.util.*;
class Camera{
	ArrayList<Integer> id = new ArrayList<Integer>();
	ArrayList<String> brand = new ArrayList<String>();
	ArrayList<String> model = new ArrayList<String>();
	ArrayList<Float> price = new ArrayList<Float>();
	ArrayList<String> status = new ArrayList<String>();
	Camera()
	{
		id.add(0);brand.add("Nikon");model.add("D850");price.add(239000.0F);status.add("Available");
		id.add(1);brand.add("Canon");model.add("MarkII");price.add(123190.0f);status.add("Available");
		id.add(2);brand.add("Sony");model.add("A7 III");price.add(169990.00f);status.add("Available");
	}
	void viewAllCam()
	{
		System.out.println("S.No\tCAMERA ID\tBRAND\tMODEL\tPRICE\t\tSTATUS");
		for(int i=0;i<id.size();i++)
		{
			System.out.println((i+1)+"\t"+(id.get(i)+1)+"\t\t"+brand.get(i)+"\t"+
					model.get(i)+"\t"+price.get(i)+"\t"+status.get(i));
		}
	}
	void addCam(String brand,String model,float price)
	{
		id.add(id.size());
		this.brand.add(brand);
		this.model.add(model);
		this.price.add(price);
		status.add("Available");
		System.out.println("Added");
	}
	void remCam(int i)
	{
		id.remove(i);
		brand.remove(i);
		model.remove(i);
		price.remove(i);
		status.remove(i);
		System.out.println("Removed");
	}
	boolean rentCam(int id)
	{
		if(status.get(id-1).equals("Available")) {
			status.set(id-1, "Rented");
			return true;
		}
		return false;	
	}
	void myCam()
	{
		System.out.println("CAMERA ID\tBRAND\tMODEL\tPRICE\t\tSTATUS");
		for(int i=0;i<id.size();i++)
			if(status.get(i).equals("Rented"))
				System.out.println((id.get(i)+1)+"\t\t"+brand.get(i)+"\t"+
						model.get(i)+"\t"+price.get(i)+"\t"+status.get(i));
	}

}
class Wallet{
	
}
public class Main {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Camera cam=new Camera();
	System.out.println("Welcome to Camera Rental App");
	System.out.println("Enter name");
	String name=sc.nextLine();
	System.out.println("Enter a password");
	String password=sc.next();
	int c=0;
	while(true)
	{
		System.out.println("\n1. My Camera\n2. Rent a Camera\n3. View All Cameras\n"
				+ "4. My Wallet\n5. Exit");
		System.out.println("Enter your choice");
		c=sc.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("1. Add\n2. Remove\n3. View My Cameras\n"
					+ "4. Go to Previous Menu");
			c=sc.nextInt();
			switch(c)
			{
			case 1: 
				System.out.println("Enter the Camera Brand");
				String brand=sc.next();
				System.out.println("Enter the Model");
				String model=sc.next();
				System.out.println("Enter the per day price");
				float price=sc.nextFloat();
				cam.addCam(brand,model,price);
				break;
			case 2: 
				cam.viewAllCam();
				System.out.println("Enter the S.No of Camera to be removed");
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
			System.out.println("Enter the S.No you want to rent");
			int no=sc.nextInt();
			if(cam.rentCam(no))
				System.out.println("Success");
			else
				System.out.println("Error");
			
			
			break;
		case 3: cam.viewAllCam();
			break;
		case 4:
			break;
		case 5: System.exit(0);
			break;
		default: System.out.println("Invalid Input!!");
		}
	}
	}
}