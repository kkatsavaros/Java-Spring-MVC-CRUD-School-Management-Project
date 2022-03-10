<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainers</title>
    </head>
    <body>
        <h1>This is my List of Trainers</h1>
        <div>
            <h3>Trainers</h3>
            <p>
                ${message}
            </p>
            <a href="${pageContext.request.contextPath}/trainer/create">Add Trainer</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Subject</th>
                        <th>Course Title</th>
                        
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <c:forEach items="${listOfTrainers}" var = "trainer">
                    <tr>
                        <td>${trainer.trainerID}</td>
                        <td>${trainer.tFirstName}</td>
                        <td>${trainer.tLastName}</td>
                        <td>${trainer.tSubject}</td>
                        <td>${trainer.tCourseTitle}</td>
                                      
                        <td>      
                            <a href="${pageContext.request.contextPath}/trainer/update/${trainer.trainerID}">Update</a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/trainer/delete?id=${trainer.trainerID}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
