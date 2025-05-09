<%@ page import="com.carrental.dao.CarDAO" %>
<%@ page import="com.carrental.model.Car" %>
<%@ page import="java.util.List" %>
<%
    CarDAO carDAO = new CarDAO();
    List<Car> cars = carDAO.getAllCars();
%>
<html>
<head><title>All Cars</title></head>
<body>
<h2>Available Cars</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Brand</th>
        <th>Model</th>
        <th>Price Per Day</th>
    </tr>
    <%
        for (Car car : cars) {
    %>
    <tr>
        <td><%= car.getId() %></td>
        <td><%= car.getBrand() %></td>
        <td><%= car.getModel() %></td>
        <td><%= car.getPricePerDay() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
