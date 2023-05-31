package com.simpli;

import java.io.*;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.hibernate.*;

import com.ecommerce.EProduct;
import com.ecommerce.ProductParts;

@WebServlet("/component_mapping-demo")
public class ComponentMappingDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

	
		// STEP 3 Query the DB and get the data
		List<EProduct> eproducts = session.createQuery("from EProduct").list();
out.println("<table border=1>");
		
		for (EProduct prod : eproducts) {
			out.println("<tr>" + "<td>" + prod.getID() + "<td>" + prod.getName() + "<td>" + prod.getPrice() + "<td>"
					+ prod.getDateAdded());
			
			ProductParts parts = prod.getParts();
			out.println("<td> Parts =" + parts.getCpu() + ", " + parts.getHdd() + ", " + parts.getRam());
			
		}
		
		out.println("</table>");

		session.close();

		out.println("</body></html>");
	}

}