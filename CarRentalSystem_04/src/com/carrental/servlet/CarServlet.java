package com.carrental.servlet;

import com.carrental.dao.CarDAO;
import com.carrental.model.Car;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/addCar")
public class CarServlet extends HttpServlet {
    private CarDAO carDAO = new CarDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        double price = Double.parseDouble(request.getParameter("price"));

        Car car = new Car();
        car.setBrand(brand);
        car.setModel(model);
        car.setPricePerDay(price);
        carDAO.saveCar(car);

        response.sendRedirect("jsp/viewCars.jsp");
    }
}
