package com.rental.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.rental.dao.Car_dao;

import Car_Rentaljsp.Car;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class carServelet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarRentalDB", "root", "password");
            Car_dao carDAO = new Car_dao();
            List<Car> cars = carDAO.getAvailableCars();
            request.setAttribute("cars", cars);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cars.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	

}
