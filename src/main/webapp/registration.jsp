<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
  <body style="text-align: center;">
    <form action="registration" method="post">
        <h1 style="text-decoration: underline;font-variant: small-caps;">User Registration</h1>
        <center>
            <fieldset style="width: 300px; text-align: center;">
                <legend style="font-size: small;">Fill User Registration Details</legend>
                <label for="name">Name : </label>
                <br>
                <input type="text" name="name" required="required">
                <br>
                <br>
                <label for="email">Email : </label>
                <br>
                <input type="email" name="email" required="required">
                <br>
                <br>
                <label for="pass">Password : </label>
                <br>
                <input type="password" name="pass" required="required">
                <br>
                <br>
                <label for="gender">Gender : </label>
                <input type="radio" name="gender" value="Male">Male
                <input type="radio" name="gender" value = "Female">Female
                <br>
                <br>
                <label for="city">City : </label>
                <select name="city" required>
                    <option>Select City</option>
                    <option value="Pune">Pune</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Bhopal">Bhopal</option>
                    <option value="Nagpur">Nagpur</option>
                    <option value="Chhindwara">Chhindwara</option>
                </select>
                <br>
                <br>
                <button type="submit">Regiter</button>
                <br>
                <br>
                <a href="index.jsp" style="font-size: small;">Login</a>
                
            </fieldset>    
        </center>
       
    </form>   
    </body>
</html>