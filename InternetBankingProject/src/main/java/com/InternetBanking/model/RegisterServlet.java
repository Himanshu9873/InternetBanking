package com.InternetBanking.model;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.InternetBanking.dao.RegisterDao;
import com.InternetBanking.entity.User;
import com.InternetBanking.helper.FactoryProvider;


public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String userName=request.getParameter("userName");
			String userEmail=request.getParameter("userEmail");
			String userPassword=request.getParameter("userPassword");
			String userPhone=request.getParameter("userPhone");
			String userAddress=request.getParameter("userAddress");
			if(userName!=null && userEmail!=null && userPassword!=null && userPhone!=null && userAddress!=null) {
				User user=new User(userName,userEmail,userPassword,userPhone,"default.jpg",userAddress,"normal user");
				RegisterDao dao=new RegisterDao();
				int id = dao.getUserDetailsForRegister(user);
				HttpSession session = request.getSession();
				session.setAttribute("message", "User Registration Successfull . we will provide services to you soon");
				response.sendRedirect("register.jsp");
				return;
			}
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
