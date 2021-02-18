<%--
  Created by IntelliJ IDEA.
  User: 13362
  Date: 2021/2/18
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式获取域中的数据</title>
</head>
<body>

<%
    //在域中存取数据
    session.setAttribute("name","李四");
    request.setAttribute("name","张三");
    session.setAttribute("age","23");
    request.setAttribute("str","");

%>

<h3>el获取值</h3>
${ requestScope.name}
${sessionScope.age}
${name}
${sessionScope.name}



</body>
</html>
