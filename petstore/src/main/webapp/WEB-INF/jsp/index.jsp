<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/emp2" method="post" id="myform">
    <table>
        <thead>
        <tr>
            <th>员工编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>学历</th>
            <th>月薪</th>
            <th>增加</th>
            <th>移除</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="text" name="id" /></td>
            <td><input type="text" name="name"/></td>
            <td>
                <select name="sex">
                    <option value="男">男</option>
                    <option value="女">女</option>
                </select>
            </td>
            <td>
                <select name="xueli">
                    <option value="大专">大专</option>
                    <option value="中专">中专</option>
                    <option value="博士">博士</option>
                </select>
            </td>
            <td><input type="text" name="money"/></td>
            <td><input type="button" class="add" value=" + "/></td>
            <td><input type="button" class="del" value=" - "></td>
        </tr>
        </tbody>
    </table>
</form>

<input type="button" id="btn_add" onclick="doSubmit()" value="批量操作">

<table>
    <tr>
        <th>员工编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>学历</th>
        <th>月薪</th>
        <th>操作</th>
    </tr>
    <c:forEach var="e" items="${empList}">
        <tr>
            <td> ${e.id} </td>
            <td> ${e.name} </td>
            <td> ${e.sex} </td>
            <td> ${e.xueli} </td>
            <td> ${e.money} </td>
            <td><a href="/em/del/${e.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>


<script src="../js/jquery.js"></script>
<script>

    function doSubmit() {
      var rows = $("#tbody tr");
      rows.each(function (i,e) {
          $("input:text, select",e).each(function (ii,ee) {
              $(ee).attr("name","emps["+ i +"]." + $(ee).attr("name"));
          })
      });
      myform.submit();
    }
    $(function () {
        var tbody = $("#tbody");
        trNode = tbody.find("tr").clone();

        tbody.on("click",".add",function () {
            alert("ok");
            $("#tbody").append(trNode.clone());
        });
        tbody.on("click",".del",function () {
            var del = $("tr",tbody).length;
            if (del === 1){
                alert("no can del");
                return false;
            }
            $(this).parent().parent().remove();
        })
    })

</script>

</body>
</html>
