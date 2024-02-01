<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body style="text-align: center;">
    <form action="index" method="post">
        <h1 style="text-decoration: underline; font-variant: small-caps;">Login Form</h1>
        <center>
            <fieldset style="width: 300px;">
                <legend style="text-align: center; font-size: small;">Fill Login Details</legend>
                <label for="email">Email : </label>
                <br>
                <input type="email" name="email" required="required">
                <br><br>
    
                <label for="pass">Password : </label>
                <br>
                <input type="password" name="pass" required="required">
                <br><br>
    
                <input type="submit" value="Login">
                <br>
                <br>
                <a href="registration.jsp" style="font-size: small;">Register New User</a>
            </fieldset>
        </center>
          
    </form>
        
</body>

</html>