<%-- 
    Document   : HelloView
    Created on : 23.06.2015, 11:21:57
    Author     : LuneLink
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*,java.lang.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" media="screen">
        
        <title>Hello</title>
    </head>
    <body>
        <h1>${HelloMessage}</h1>
        
        <!--<c:forEach var="value" items="${HelloMessage}">  
            <c:out value="${value}"/>
        </c:forEach> -->
        <%  
            String data = (String)request.getAttribute("HelloMessage");
            out.print(data);
        %>
        
        <table class="table">
            <thead>
              <tr>
                <th>#</th> 
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
              </tr>
            </tbody>
        </table
    </body>
</html>
