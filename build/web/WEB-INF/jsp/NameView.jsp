
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" media="screen">
        <title>Name</title>
    </head>
    <body>
        <h1>Enter Your Name</h1>
        <button type="button" class="btn btn-lg btn-default">Default</button>
        <button type="button" class="btn btn-lg btn-primary">Primary</button>
        <spring:nestedPath path="ooo">
            <form action="" method="post">
                Name:
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <spring:bind path="surname">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>    
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
