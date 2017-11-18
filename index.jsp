<%-- 
    Document   : index.jsp
    Created on : Nov 18, 2017, 9:46:44 AM
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
        <h1>Entry Form</h1>
        <form name="Item Input Form" action="response.jsp">
            Enter an item:
            <input type="text" name="item" />
            <input type="submit" value="OK" />
        </form>
    </body>
</html>
