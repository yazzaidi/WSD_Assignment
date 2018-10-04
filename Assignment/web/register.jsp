<%-- 
    Document   : register
    Created on : 04/10/2018, 5:40:46 PM
    Author     : yasminzaidi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register</h1>
        <form action="index.jsp" method="POST">
            <table>
                <tr><td>Name</td><td><input type="text" name="name"></td></tr>
                <tr><td>Email</td><td><input type="text" name="email"></td></tr>
                <tr><td>Password</td><td><input type="password" name="password"></td></tr>
                <tr><td>Phone Number</td><td><input type="integer" name="phoneNumber"></td></tr>
                <tr><td>Address</td><td><input type="text" name="address"></td></tr>
                <tr><td></td><td><input class="button" type="submit" value="Register"></td></tr>
            </table>
        </form>
    </body>
</html>
