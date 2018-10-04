<%-- 
    Document   : login
    Created on : 04/10/2018, 5:25:13 PM
    Author     : yasminzaidi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
      <form action="loginAction.jsp" method="POST">
          <table>
       <tr><td>Username (Email)</td><td><input type="text" name="email"></td></tr>
       <tr><td>Password</td><td><input type="password" name="password"></td></tr>
       <tr><td></td><td><input class="button" type="submit" value="Login"></td></tr>
          </table>
      </form>
        
    </body>
</html>
