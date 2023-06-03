package com.simpli;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.hibernate.*;
import com.ecommerce.Station;

@WebServlet("/station")
public class InsertStation extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// STEP 1: Get a Session (connection) from the Session Factory class
		SessionFactory factory = HibernateUtil.getSessionFactory();

		// STE2 Create the session object
		Session session = factory.openSession();

		String sname = request.getParameter("sname");
		String status = request.getParameter("status");
		String pic = request.getParameter("person_incharge");
		String schedule = request.getParameter("schedule");
		String landmark = request.getParameter("landmark");
		String address = request.getParameter("address");

		// STEP 3 Query the DB and get the data
		Transaction tx = null;
		try
		{
			tx = session.beginTransaction();
			Station st = new Station();
			st.setID(1);
			st.setSname(sname);
			st.setStatus(status);
			st.setPerson_incharge(pic);
			st.setSchedule(schedule);
			st.setLandmark(landmark);
			st.setAddress(address);
			
			session.save(st);
			tx.commit();
		} 
		catch (HibernateException ex)
		{
			if(tx != null)
				tx.rollback();
		}
		out.println("New Crossing Added Successfully");
		out.println("<br><a href='adminhome.jsp'>Home</a>");
		session.close();
		out.println("</body></html>");
	}
}