package com.carrental.controller;

import com.carrental.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cars", cars);
        return "viewCars";
    }

    @GetMapping("/addCar")
    public String addCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "addCar";
    }

    @PostMapping("/addCar")
    public String addCar(@ModelAttribute Car car) {
        car.setId(cars.size() + 1);
        cars.add(car);
        return "redirect:/";
    }
}
