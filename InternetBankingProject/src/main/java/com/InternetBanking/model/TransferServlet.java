package com.InternetBanking.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TransferServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
				Integer accountNumber=Integer.parseInt(request.getParameter("accountNumber"));
				Integer conAccountNumber=Integer.parseInt(request.getParameter("conAccountNumber"));
				String ifscNumber=request.getParameter("ifscNumber");
				Integer amount=Integer.parseInt(request.getParameter("amount"));
				
				
				if(accountNumber!=null && conAccountNumber!=null && ifscNumber!="" && amount!=null) {
					if(accountNumber!=conAccountNumber ) {
						session.setAttribute("message", "OOPS!! Account Number and Confirm Number not Match");
						response.sendRedirect("transfer.jsp");
						return;
					}
					else {
						PrintWriter writer = response.getWriter();
						writer.println("Account Number is"+accountNumber);
						writer.println("Re-Enter Account number"+conAccountNumber);
						writer.println("ifsc"+ifscNumber);
						writer.println("Amount"+amount);
						writer.println("Welcome");
					}
				}
				else {
					session.setAttribute("message", "OOPS!! Plese Fill all fields");
					response.sendRedirect("transfer.jsp");
					return;
				}
		}catch(Exception e) {
			e.printStackTrace();
			session.setAttribute("message", "OOPS!! Plese Fill all fields");
			response.sendRedirect("transfer.jsp");
			return;
		}
	}

}
