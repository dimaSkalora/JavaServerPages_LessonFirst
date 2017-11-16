<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Title</title>
</head>
<body>
    Hello World
    <a href="http://localhost:8080/lesson_14/home.html">Limk_01  </a>
    <br />
    <a href="http://localhost:8080/lesson_14/fileDowload"> FileDowland  </a>
    <br />
    fileDowload
    <br />
    <form action="fileDowload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" value=""/>
        <input type="submit" name="submit" value="upload"/>
    </form>
    <br />
    Post
    <form action="/lesson_14/home.html" method="post">
        <input type="text" name="a" value=""/>
        <input type="text" name="b" value=""/>
        <input type="submit" name="submit" value="Go"/>
    </form>
</body>
</html>
