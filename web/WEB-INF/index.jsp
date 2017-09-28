<%-- 
    Document   : index
    Created on : Sep 26, 2017, 2:39:23 PM
    Author     : 725899
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 3 Lab 2</title>
    </head>
    <body>
        <h1>Simple JSP Calculator</h1>
        
        <form action="Calculations" method="POST">
            First: <input type="text" name="first"><br/>
            Second: <input type="text" name="second"><br/>
            <input type="submit" name="operation" value="+"> 
            <input type="submit" name="operation" value="-"> 
            <input type="submit" name="operation" value="*"> 
            <input type="submit" name="operation" value="%">
        </form>
        <br/>
        ${result}
    </body>
</html>

