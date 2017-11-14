<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home_08</title>
</head>
<body>
        Home_08 JSP
        a: <%= request.getAttribute("a1")%><br />
        b: <%= request.getAttribute("b1")%><br />
        str: <%= request.getAttribute("str")%> <br />
        <br />
        <br>
        firstName: ${user.firstName}<br>
        lastName: ${user.lastName}<br>
        age: ${user.age}<br>

        <br>
        res: ${res}<br>
</body>
</html>
