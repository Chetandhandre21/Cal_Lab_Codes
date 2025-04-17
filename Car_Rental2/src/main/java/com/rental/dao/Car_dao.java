package com.rental.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Car_Rentaljsp.Car;

public class Car_dao {
	private Connection conn;

    public void Car_dao(Connection conn) { this.conn = conn; }

    public List<Car> getAvailableCars() throws SQLException {
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT * FROM cars WHERE available = TRUE";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Car car = new Car();
            car.setId1(rs.getInt("id"));
            car.setName(rs.getString("name"));
            car.setModel(rs.getString("model"));
            car.setPricePerDay(rs.getDouble("price_per_day"));
            car.setAvailable(rs.getBoolean("available"));
            cars.add(car);
        }
        return cars;

}
