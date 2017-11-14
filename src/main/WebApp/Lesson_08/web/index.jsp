<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Title</title>
</head>
<body>
    Hello World
    <a href="http://localhost:8080/lesson_08/home.html?name=wswc&a2=10&b2=15">Limk_01  </a>
    <br />

    <form action="/lesson_08/home.html" method="post">
        <input type="text" name="a" value=""/>
        <input type="text" name="b" value=""/>
        <input type="submit" name="submit" value="Go"/>
    </form>
</body>
</html>
