<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="main-design.css">
    <title>Title</title>
</head>
<body>
<h1>Prototype Pattern Demo</h1>
<div class="wrapperTwo">
    <form action="PrototypeServlet" method="post" style="margin-right: 10px">
        <input type="submit" value="Create Prototype">
    </form>
    <form action="index.jsp" method="get" style="margin-left: 10px">
        <button type="submit" class="btn btn-warning">Again</button>
    </form>
</div>
</body>
</html>
