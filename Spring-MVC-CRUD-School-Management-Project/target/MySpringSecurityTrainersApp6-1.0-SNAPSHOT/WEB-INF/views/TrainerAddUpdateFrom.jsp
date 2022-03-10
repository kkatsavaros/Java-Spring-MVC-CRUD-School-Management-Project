<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Update Form</title>
    </head>
    <body>
        <h1>Create your fantastic Trainer</h1>
        
    <c:if test="${trainerToEdit==null}">
        <c:url value="/trainer/create" var="link"/>
    </c:if>
        
    <c:if test="${trainerToEdit!=null}">
        <c:url  value="/trainer/update" var="link"/>
    </c:if>
        
    <form action="${link}" method="POST">
        <label for="ccode">Code:</label>
        <input id="ccode" type="number" name="trainerID" value="${trainerToEdit.trainerID}" readonly/>
        <br/>
        
        <label for="cname">First Name:</label>
        <input id="cname" type="text" name="tFirstName" value="${trainerToEdit.tFirstName}"/>
        <br/>     
        
        <label for="cname">Last Name:</label>
        <input id="cname" type="text" name="tLastName" value="${trainerToEdit.tLastName}"/>
        <br/>    
        
        <label for="cname">Subject:</label>
        <input id="cname" type="text" name="tSubject" value="${trainerToEdit.tSubject}"/>
        <br/>    
        
        <label for="cname">Course Title:</label>
        <input id="cname" type="text" name="tCourseTitle" value="${trainerToEdit.tCourseTitle}"/>
        <br/>    
        
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>
