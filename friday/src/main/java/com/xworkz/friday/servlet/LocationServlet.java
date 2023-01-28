package com.xworkz.friday.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method...");
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String start = req.getParameter("start");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(start);
		System.out.println(destination);
		System.out.println(gender);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		if(name.length() > 3) {
			writer.print("<h1>");
			writer.print("Sign in successfull by " + name);
			writer.print("</h1>");
			System.out.println("The data is valid..");
		}
		else {
			writer.print("<h1 style = 'color:red'>");
			writer.print("The length should be more than 3 " + name);
			writer.print("</h1>");
			System.out.println("The data is invalid");
		}
		writer.print("<a href = 'location.html'>");
		writer.print("Click here for back");
		writer.print("</a>");
		writer.print("<br/>");
		writer.print("<a href = 'index.html'>");
		writer.print("Click here for home");
		writer.print("</a>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
		
	}
}
