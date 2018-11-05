<%--
  Created by IntelliJ IDEA.
  User: 晚
  Date: 2018/11/5
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update" method="post">
    <table>
        <tr>
            <td>category: <input name="category" type="text" value="${pet.category.getName()}"></td>
            <td>name: <input name="name" type="text" value="${pet.name}"></td>
            <td>photo_urls: <input type="text" name="photo_urls" value="${pet.photo_urls}"></td>
            <td>tags_id: <input type="text" name="tags_id" value="${pet.tags_id}"></td>
            <td>status: <input type="text" name="status" value="${pet.status}"></td>
        </tr>
        <tr><input type="submit">修改</tr>
    </table>
</form>
</body>
</html>
