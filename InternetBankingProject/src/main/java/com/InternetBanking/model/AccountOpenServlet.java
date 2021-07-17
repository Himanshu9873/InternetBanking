package com.InternetBanking.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.InternetBanking.entity.UserAccount;

public class AccountOpenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String phone=request.getParameter("phone");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			String password=request.getParameter("password");
			String conPassword=request.getParameter("conPassword");
			HttpSession session = request.getSession();
			if(firstName!="" && lastName!="" && phone!="" && email!="" && address!="" && password!="" && conPassword!="") {
				if(password.equals(conPassword)) {
					//UserAccount user=new UserAccount(firstName,lastName,phone,email,address,password);
					//System.out.println(user);
				}
				else {
					session.setAttribute("message", "OOPS!! password or confirm password doesnot match");
					response.sendRedirect("accountOpen.jsp");
					return;
				}
			}
			else {
				session.setAttribute("message", "OOPS!! Plese fill all fields");
				response.sendRedirect("accountOpen.jsp");
				return;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

}
