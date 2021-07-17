package com.InternetBanking.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.InternetBanking.dao.LoginDao;
import com.InternetBanking.entity.User;
import com.InternetBanking.helper.FactoryProvider;


public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email=request.getParameter("userEmail");
			String pass=request.getParameter("userPassword");
			HttpSession httpSession = request.getSession();
			if(email!=null && pass!=null)
			{
				LoginDao dao=new LoginDao(FactoryProvider.getFactory());
				User user=dao.getUserByEmailAndPassword(email, pass);
				if(user!=null) {
					if(user.getUserType().equals("admin user")) {
						
						httpSession.setAttribute("message", "Login Successfull");
						response.sendRedirect("register.jsp");
						return;
					}
					else {
						
						response.sendRedirect("index.jsp");
						return ;
					}
						
				}
				else {
					httpSession.setAttribute("message", "User email and password are not match");
					response.sendRedirect("Login.jsp");
					return;
				}
			}
			else {
				httpSession.setAttribute("message", "Plese Fill the values in the field");
				response.sendRedirect("Login.jsp");
				return ;
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		  
	}

}
