package com.xworkz.webseriese.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/web")
public class WebSerieseServlet extends HttpServlet {

	public WebSerieseServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method.....");
		
		String name = req.getParameter("webName");
		String language = req.getParameter("lang");
		String episode = req.getParameter("episode");
		String ottPlatform = req.getParameter("ott");
		String budget = req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episode);
		System.out.println(ottPlatform);
		System.out.println(budget);
		
		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("The name " + name + " is released on " + ottPlatform + " succesfully....");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		
		resp.setContentType("text/html");
		
	}
	
}
