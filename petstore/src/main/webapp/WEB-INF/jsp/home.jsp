<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>
<body>



    <table>
        <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>学历</th>
            <th>月薪</th>
            <th>增加</th>
            <th>移除</th>
        </tr>
        <tbody id="tbody">
            <tr>
                <td><input type="text" name="name"/> </td>
                <td>
                    <select name="sex">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                </td>
                <td>
                    <select name="xueli">
                        <option value=" 科研">科研</option>
                        <option value="本科">本科</option>
                        <option value="专科">专科</option>
                    </select>
                </td>
                <td><input type="text" name="money" /></td>
                <td><input type="button" class="add" value="+" /> </td>
                <td><input type="button" class="del" value="-" /></td>
            </tr>
        </tbody>
    </table>
<br /><br />
<input type="button" id="btn_add" value="批量添加" />

    <table>
        <tr>
            <th>员工编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>学历</th>
            <th>月薪</th>
            <th>移除</th>
        </tr>
        <c:forEach items="${employees}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.sex}</td>
                <td>${emp.xueli}</td>
                <td>${emp.money}</td>
                <td><a href="/em/del/${emp.id}" >删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <script src="../js/jquery.js"></script>
    <script>
        $(function () {
            var tb = $("#tbody");
            trNode = tb.find("tr").clone();

            tb.on("click",".add",function () {
                $("#tbody").append(trNode.clone());
            });

            tb.on("click",".del",function () {
                var del = $("tr",tb).length;
                if (del === 1){
                    alert("不能删除了");
                    return false;
                }
                $(this).parent().parent().remove();
            });
        });

        $("#btn_add").click(function () {
            var data = [];
            $("#tbody tr").each(function (index, obj) {
                data.push({
                    name: $("input[name='name']", obj).val(),
                    sex: $("select[name='sex']", obj).val(),
                    xueli: $("select[name='xueli']", obj).val(),
                    money: $("input[name='money']", obj).val()
                })
            });

            $.post({
                url: "/emp",
                contentType: "application/json;charset=utf-8",
                data: JSON.stringify(data)
            }).done(function (data) {
                if (data.msg === "ok") {
                    alert("添加成功");
                    window.location.href = "/emp";
                }
                else {
                    alert("添加失败");
                }
            }).fail(function (xhr, code, ex) {
                console.error(ex);
            });
        })

    </script>

</body>
</html>
