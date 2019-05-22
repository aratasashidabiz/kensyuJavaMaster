<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: jaehyeong.ha
  Date: 2019-05-21
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Connection connection;
    PreparedStatement st;
    ResultSet rs;

    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/sample";
    String user = "student";
    String password = "1234";

    try {
        Class.forName(driverName);
        connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from emp;";
        st = connection.prepareStatement(sql);
        // insert
        rs = st.executeQuery();

        while (rs.next()) {
            out.println(rs.getString("name"));
        }

        st.close();
        connection.close();
        // 연결해제
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
</body>
</html>
