package com.xworkz.friday.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/class")
public class ContentServlet extends HttpServlet {

	public ContentServlet() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method......");
		
		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");
		String userMobile = req.getParameter("userMobile");
		String userComments = req.getParameter("userComments");
		
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userMobile);
		System.out.println(userComments);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(userName.length() > 3) {
			writer.print("Sign in successfull by " + userName);
			System.out.println("The data is valid..");
		}
		else {
			writer.print("The length should be more than 3 " + userName);
			System.out.println("The data is invalid");
		}
		writer.print("</h1>");
		writer.print("<a href = 'Content.html'>");
		writer.print("Click here for back");
		writer.print("</a>");
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
		
	}
	
}
