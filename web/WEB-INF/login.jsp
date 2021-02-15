<%-- 
    Document   : login
    Created on : 14-Feb-2021, 6:05:38 PM
    Author     : 814545
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action = "LoginServlet" method = "post">
            Username: <input type="text" name="username" value = "${username}"><br>
            Password: <input type="password" name="password" value = "${password}"><br>
            <input type="submit" value="Login in">
        </form>
        <p>${error}</p>
    </body>
</html>
