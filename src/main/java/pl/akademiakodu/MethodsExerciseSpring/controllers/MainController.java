package pl.akademiakodu.MethodsExerciseSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.MethodsExerciseSpring.models.SalaryCalculator;
import pl.akademiakodu.MethodsExerciseSpring.models.employees.Employee;
import pl.akademiakodu.MethodsExerciseSpring.models.services.ReadFileToString;


import java.io.IOException;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexWelcome(Model model) throws IOException {
        return "welcomeScreen";
    }

    @GetMapping("/desc")
    public String indexDesc(Model model) throws IOException {
        //display to user *dexcription
        model.addAttribute("message", ReadFileToString.readFileToArray("description.txt"));
        return "textDescription";
    }

    @GetMapping("/graph")
    public String indexGraph(Model model) throws IOException {
        return "graphDescription";
    }

    @GetMapping("/calc")
    public String index(Model model) throws IOException {
        model.addAttribute("employeeModel", new Employee());
        return "salaryCalculator";
    }

    @PostMapping("/calc")
    public String index(@ModelAttribute("employeeModel") Employee employee, Model model){
        SalaryCalculator calculator = new SalaryCalculator();
        model.addAttribute("message1", "DATA:");
        model.addAttribute("message2", "gross: " + employee.getGross());
        model.addAttribute("message3", "bonus: " + employee.getBonus());
        model.addAttribute("message4", "distance from work: " + employee.getDistanceFromWork());
        model.addAttribute("message5", "RESULT:");
        model.addAttribute("message6", "net: "
                + calculator.salaryNetCalculator(employee.getGross(), employee.getBonus(), employee.getDistanceFromWork()));
        return "salaryCalculator";
    }






}


