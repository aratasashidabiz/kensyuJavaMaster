<%--
  Created by IntelliJ IDEA.
  User: jaehyeong.ha
  Date: 2019-05-21
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>circle input</title>
</head>
<body>
<form action="/CircleServlet" method="get">
    <h1>円の半径を入力してください。</h1>
    半径: <input type="text" name="hankei">
    <select>
        <option value="menseki">面積</option>
        <option value="ensyuu">円周</option>
    </select>

    <br>
    <button type="submit">計算</button>
</form>
</body>
</html>
