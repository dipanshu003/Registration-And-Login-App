package com.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.helper.ConnectionProvider;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/index")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String r_Email=req.getParameter("email");
		String r_Pass=req.getParameter("pass");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd ;
		
		Connection con = ConnectionProvider.makeConnection();
	
		try
		{
			
			String q = "select * from registration";
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(q);
			
			while(set.next())
			{
				int id  = set.getInt("id");
				String name = set.getString("name");
				String email = set.getString("email");
				String pass= set.getString("pass");
				String gender= set.getString("gender");
				String city = set.getString("city");
				
				
				if(email.equals(r_Email) && pass.equals(r_Pass))
				{

					HttpSession session=req.getSession();
					session.setAttribute("nameKey",name);
					session.setAttribute("emailKey",email);
					session.setAttribute("passKey",pass);
					session.setAttribute("genderKey",gender);
					session.setAttribute("cityKey",city);
					
//					out.println(id+" "+name+" "+email+" "+pass+" "+gender+" "+city);
//					break;
					rd = req.getRequestDispatcher("/profile.jsp");
					rd.forward(req, resp);
				}
			}
			resp.setContentType("text/html");
			out.print("<h3 style = 'color:red'>Wrong Email or Password ...Try Again</h3>");
			rd = req.getRequestDispatcher("/index.jsp");
			rd.include(req, resp);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
