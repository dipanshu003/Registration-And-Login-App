package com.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.helper.ConnectionProvider;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myName = req.getParameter("name");
		String myEmail = req.getParameter("email");
		String myPass = req.getParameter("pass");
		String myGender = req.getParameter("gender");
		String myCity = req.getParameter("city");

		PrintWriter out = resp.getWriter();

		Connection con = ConnectionProvider.makeConnection();

		try {

			String query ="insert into registration (name,email,pass,gender,city) values (?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, myName);
			ps.setString(2, myEmail);
			ps.setString(3, myPass);
			ps.setString(4, myGender);
			ps.setString(5, myCity);
			
			int count=ps.executeUpdate();
			
			if(count > 0)
			{
				resp.setContentType("text/html");
				out.print("<h3 style = 'color:green;'>Update Successful...</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/registration.jsp");
				rd.include(req, resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3 style = 'color:red;'>Update Unsuccessful...</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/registration.jsp");
				rd.include(req, resp);
			}
			
			
			
		} catch (SQLException e) {
			
			resp.setContentType("text/html");
			out.print("<h3 style = 'color:red;'>"+e.getMessage()+"</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/registration.jsp");
			rd.include(req, resp);
			
		}

	}
}
