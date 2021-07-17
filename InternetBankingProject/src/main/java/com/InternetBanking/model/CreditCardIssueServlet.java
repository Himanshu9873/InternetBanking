package com.InternetBanking.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CreditCardIssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			Integer accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
			String cardHolderName = request.getParameter("cardHolderName");
			String issueDate = request.getParameter("issueDate");
			String expiryDate = request.getParameter("expiryDate");
			Integer balance = Integer.parseInt(request.getParameter("balance"));
			Integer pinNumber = Integer.parseInt(request.getParameter("pinNumber"));
			Float rateOfIntrest=Float.parseFloat("rateOfIntrest");
			if(accountNumber!=null && cardHolderName!="" && issueDate!="" && expiryDate!="" && balance!=null && pinNumber!=null && rateOfIntrest!=null) {
				PrintWriter writer = response.getWriter();
				writer.println("Welcome dear");
			}
			else {
				session.setAttribute("message", "OOPS!! Plese Fill all fields");
				response.sendRedirect("issueCreditCard.jsp");
				return ;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			session.setAttribute("message", e);
			response.sendRedirect("issueCreditCard.jsp");
			return ;
		}
	
	}

}
