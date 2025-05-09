<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>All Cars</title></head>
<body>
<h2>Available Cars</h2>
<a href="addCar">Add Car</a>
<table border="1">
    <tr><th>ID</th><th>Brand</th><th>Model</th><th>Price Per Day</th></tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.id}</td>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.pricePerDay}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
