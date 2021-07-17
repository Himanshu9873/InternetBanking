package com.InternetBanking.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CardApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String accountNumber=request.getParameter("accountNumber");
			String card=request.getParameter("card");
			if(accountNumber!="" && card!="") {
				PrintWriter writer = response.getWriter();
				writer.println("hello Himanshu your Account Number is"+accountNumber+"Your card type is"+card);
				
			}
			else {
				session.setAttribute("message", "OOPS!! Plese Fill All Fields");
				response.sendRedirect("cardApply.jsp");
				return;
			}
		}catch(Exception e) {
			e.printStackTrace();
			session.setAttribute("message", e);
			response.sendRedirect("cardApply.jsp");
			return;
		}
	}

}
