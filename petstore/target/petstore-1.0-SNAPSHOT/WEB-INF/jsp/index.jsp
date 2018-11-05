<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>信息:${msg}</h3>

<form action="/pet/findByStatus">
    <div class="input-group mb-3">
        <input id="status" type="text" class="form-control" placeholder="可以根据宠物的转态来查询" aria-label="Recipient's username" aria-describedby="basic-addon2">
        <div class="input-group-append">
            <button class="btn btn-outline-secondary" type="submit">搜索</button>
        </div>
    </div>
</form>

<br><br><br>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">category_name</th>
        <th scope="col">name</th>
        <th scope="col">photo_urls</th>
        <th scope="col">tags_id</th>
        <th scope="col">status</th>
        <th scope="col">操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${psPets}" var="p" >
        <tr>
            <td scope="row">${p.id}</td>
            <td>${p.category.getName()}</td>
            <td>${p.name}</td>
            <td>${p.photo_urls}</td>
            <td>${p.tags_id}</td>
            <td>${p.status}</td>
            <td>
                <a href="/del/${p.id}">删除</a>
                <a href="/update/${p.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<br><br><br>


<form action="/pet" method="post">
    <table class="table table-hover">
        <tr>
            <th>category_id</th>
            <th>name</th>
            <th>photo_urls</th>
            <th>tags_id</th>
            <th>status</th>
        </tr>
        <tbody>
            <tr>
                <td>
                   <select name="category_id">
                    <option value="1">犬科</option>
                    <option value="2">猫科</option>
                   </select>
                </td>
                <td> <input type="text" name="name"></td>
                <td> <input type="text" name="photo_urls"></td>
                <td>
                   <select name="tags_id">
                    <option value="1">可爱</option>
                    <option value="2">高冷</option>
                   </select>
                </td>
                <td><input type="text" name="status"></td>
            </tr>
        </tbody>
    </table>
    <input type="submit" value="添加">
</form>
</body>
</html>

<script>

</script>