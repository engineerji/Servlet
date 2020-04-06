package assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddNumbers extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter the first Number:");
		int a= scn.nextInt();
		System.out.println("Enter the second number:");
		int b = scn.nextInt();
		int result=a+b;
		PrintWriter out = resp.getWriter();
		out.print("Sum is : "+result);
	}
	
}
