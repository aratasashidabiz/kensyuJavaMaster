<%--
  Created by IntelliJ IDEA.
  User: jaehyeong.ha
  Date: 2019-05-21
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show All Items</title>
</head>
<body>
<table border="1">
    <tr><td>NO</td><td>商品名</td><td>値段</td></tr>

    <c:forEach items="${items}" var="item">
        <tr><td>${item.code}</td><td>${item.name}</td><td>${item.price}</td></tr>
    </c:forEach>
</table>
</body>
</html>
