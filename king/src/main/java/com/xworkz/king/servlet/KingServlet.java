package com.xworkz.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/kings")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in KingServlet....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in kingServlet......");

		String name = req.getParameter("nameOfking");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("number");
		String dob = req.getParameter("dob");
		String dod = req.getParameter("dod");

		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dob);
		System.out.println(dod);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 style= 'color:red;'>");
		writer.print("The King name " + name + " is saved succesfully....");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
		

	}

	@Override
	public void destroy() {
		System.out.println("Running destroy method...."); 
	}
}
