<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <p>${myMessage}</p>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/trainer">Trainers</a>
        
    </body>
</html>
