<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 13362
  Date: 2021/2/18
  Time: 10:41
  To change this template use File | Settings | File Templates.
	1. 概念：Expression Language 表达式语言
	2. 作用：替换和简化jsp页面中java代码的编写
	3. 语法：${表达式}
	4. 注意：
		* jsp默认支持el表达式的。如果要忽略el表达式
			1. 设置jsp中page指令中：isELIgnored="true" 忽略当前jsp页面中所有的el表达式
			2. \${表达式} ：忽略当前这个el表达式
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${3>4}
<%--如果不需要可以加个/--%>
\${3>4}
<hr>
<h3>算术运算符</h3>
${3+4}<br>
${3/4}<br>
${3 div 4}<br>
${3%4}<br>
<h3>比较运算符</h3>
${3==5 }<br>

<h3>逻辑运算符</h3>
${3>4 && 3<4}<br>
${3>4 and 3<4}<br>
<h4>empty运算符</h4>

<%

    String str = "";
    request.setAttribute("str",str);

    List list = new ArrayList();
    request.setAttribute("list",list);

%>
    ${not empty str}
    ${not empty list}
</body>
</html>
