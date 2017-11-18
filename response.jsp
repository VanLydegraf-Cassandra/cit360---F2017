<%-- 
    Document   : response
    Created on : Nov 18, 2017, 9:57:56 AM
    Author     : Cassandra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="ServletHandler" />
        <jsp:setProperty name="mybean" property="item" />
        <h1>Item is: <jsp:getProperty name="mybean" property="item" />!</h1>   
    </body>
</html>
