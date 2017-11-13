<%@ page import="lesson_07.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home_07</title>
</head>
<body>
        Home_07 JSP
        <br />
        a: <%= request.getAttribute("a")%><br />
        b: <%= request.getAttribute("b")%><br />
        str: <%= request.getAttribute("str")%> <br />
        <br />

        <%User user =(User)request.getAttribute("user");%>
                <%=user.getFirstName()%><br>
                <%=user.getLastName()%><br>
                <%=user.getAge()%><br>

        <br>
        firstName: ${user.firstName}<br>
        lastName: ${user.lastName}<br>
        age: ${user.age}<br>

</body>
</html>
