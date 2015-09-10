<%-- 
    Document   : MainView
    Created on : Aug 28, 2015, 7:45:17 PM
    Author     : wookie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
         <spring:nestedPath path="search">
            <form action="" method="post">
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.table_name}">
                </spring:bind>   
                <input type="submit" value="Search">
            </form>
        </spring:nestedPath>
    </body>
</html>




