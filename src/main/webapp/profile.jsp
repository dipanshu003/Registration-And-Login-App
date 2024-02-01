<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Page</title>
</head>
<body style="text-align: center;">
    <h1 style="text-decoration: underline; font-variant: small-caps;">Profile</h1>
    <%
    String name=(String)session.getAttribute("nameKey");
    String email=(String)session.getAttribute("emailKey");
    String pass=(String)session.getAttribute("passKey");
    String gender=(String)session.getAttribute("genderKey");
    String city=(String)session.getAttribute("cityKey");
    %>
    
    <h2>Wel-Come <%=name%> to Profile Page</h2>

    <h3>Name : <%=name %> </h3>
    <h3>Email : <%=email %></h3>
    <h3>Password : <%=pass%></h3>
    <h3>Gender : <%=gender %></h3>
    <h3>City : <%=city %></h3>
    
    
    <abbr title="Back to Login">
 		<a href="index.jsp">
 			<button>Back</button>
 		</a>   
    </abbr>
    
</body>
</html>