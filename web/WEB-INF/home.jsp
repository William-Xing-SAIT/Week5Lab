<%-- 
    Document   : home
    Created on : 14-Feb-2021, 6:07:35 PM
    Author     : 814545
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>Hello ${users.getUsername()}.</p>
        <a href="LoginServlet">Logout</a>
        
    </body>
</html>
