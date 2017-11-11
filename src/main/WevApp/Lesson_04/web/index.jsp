<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hello World
    <a href="http://localhost:8080/lesson_03/home.html">Limk_01  </a>

    <!--kpionoin -->
    <%--lmm;m;, --%>

    <%!
        String s1 ="fefes";
        String s2 = "swacd";
        int c =0;
    %>


    <%
        int a = 7;
        int b = 8;
        if(a==b){
            c=a+b;
        %>
        <br />
    1111111111111
    <br />
    <%
        }else {
            c=a-b;
    %>
    <br />
    22222222222222
    <br />
    <%
        }
    %>
    <%= c%>
</body>
</html>
