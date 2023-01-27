package com.xworkz.institute.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/mywish")
public class InstituteServlet extends HttpServlet {

	public InstituteServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget method in InstituteServlet......");
		
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String principle = req.getParameter("principle");
		String hod = req.getParameter("hod");
		String physicsTeacher = req.getParameter("teacher1");
		String mathematicsTeacher = req.getParameter("teacher2");
		String chemestryTeatcher = req.getParameter("teacher3");
		String biologyTeacher = req.getParameter("teacher4");
		String socialScienceTeacher = req.getParameter("teacher5");
		String class1 = req.getParameter("class1");
		String class2 = req.getParameter("class2");
		String class3 = req.getParameter("class3");
		String class4 = req.getParameter("class4");
		String class5 = req.getParameter("class5");
		String class6 = req.getParameter("class6");
		String class7 = req.getParameter("class7");
		String class8 = req.getParameter("class8");
		String class9 = req.getParameter("class9");
		String class10 = req.getParameter("class10");
		String canteen = req.getParameter("canteen");
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(principle);
		System.out.println(hod);
		System.out.println(physicsTeacher);
		System.out.println(chemestryTeatcher);
		System.out.println(biologyTeacher);
		System.out.println(mathematicsTeacher);
		System.out.println(socialScienceTeacher);
		System.out.println(class1);
		System.out.println(class2);
		System.out.println(class3);
		System.out.println(class4);
		System.out.println(class5);
		System.out.println(class6);
		System.out.println(class7);
		System.out.println(class8);
		System.out.println(class9);
		System.out.println(class10);
		System.out.println(canteen);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 style= 'color:blue;'>");
		writer.print("The institute name " + name + " is  succesfully completed its first anniversary....");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
		
	}
	
	
}
