<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: jaehyeong.ha
  Date: 2019-05-21
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! String str = "";
    String test() {
        Random rand = new Random();
        int dice = rand.nextInt(6)+1;
        switch (dice) {
            case 1:
                str = "大吉です";
                break;
            case 2:
                str = "中吉です";
                break;
            case 3:
                str = "凶です";
                break;
            default :
                str = "吉です";
                break;
        }
        return str;
    }
%>
<html>
<head>
    <title>a lucky test</title>
</head>
<body>
<%=test()%>c
</body>
</html>
