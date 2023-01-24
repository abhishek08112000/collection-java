package com.xworkz.serverapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/itsme")
public class ServerServlet extends HttpServlet {

	public ServerServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running serverServlet in server");
		String data = "Displaying doPost in web server....";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method");
		String str = "Displaying doGet in web server....";
		PrintWriter writer = resp.getWriter();
		writer.print(str);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPut method");
		String str = "Displaying doPut in web server......";
		PrintWriter writer = resp.getWriter();
		writer.print(str);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doDelete methos in server");
		String s = "Displaying the doDelete method in web server using eclipse";
		PrintWriter write = resp.getWriter();
		write.print(s);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running doHead method in server");
		String s = "Displaying the doHead method in web server using eclipse";
		PrintWriter write = arg1.getWriter();
		write.print(s);
		arg1.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running doOptions method in server");
		String st = "Displaying the doOptions method in web server using eclipse";
		PrintWriter write = arg1.getWriter();
		write.print(st);
		arg1.setContentType("text/plain");
	}
	
	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running doTrace method in server");
		String str = "Displaying the doTrace method in web server....";
		PrintWriter type = arg1.getWriter();
		type.print(str);
		arg1.setContentType("text/plain");
	}
}
