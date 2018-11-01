<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 晚
  Date: 2018/10/30
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>

<form:form action="/book" method="post" modelAttribute="book">
    <div>
        <form:input path="name" placeholder="name"></form:input>
        <form:errors path="name"></form:errors>
    </div>
    <div>
        <form:input path="price" placeholder="price" />
        <form:errors path="price"></form:errors>
    </div>
    <br>
    <input type="submit">
</form:form>


</body>
</html>
