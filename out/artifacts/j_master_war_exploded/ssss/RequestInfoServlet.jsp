<%--
  Created by IntelliJ IDEA.
  User: jaehyeong.ha
  Date: 2019-05-21
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

%>
<html>
<head>
    <title>RequestInformation</title>
</head>
<body>
リモートIPアドレス：<%=request.getRemoteAddr()%><br>
リクエストURI：<%=request.getRequestURI()%><br>
HTTPメソッド：<%=request.getMethod()%><br>
プラウザの種類：<%=request.getHeader("User-Agent")%><br>
利用可能ファイル種別：<%=request.getHeader("Accept")%><br>
利用可能言語：<%=request.getHeader("Accept-Language")%><br>

</body>
</html>
