<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home_09</title>
</head>
<body>
    Home_09 JSP
    <br>
    <%
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        for(Cookie cookie1Request: cookies){
            if(cookie1Request.getName().equals("aaa")){
                cookie=cookie1Request;
                break;
            }
        }
    %>
    <br>
    value: <%=cookie.getValue()%>

</body>
</html>
