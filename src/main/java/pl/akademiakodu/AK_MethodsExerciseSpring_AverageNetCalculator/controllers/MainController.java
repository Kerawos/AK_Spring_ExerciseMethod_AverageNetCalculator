package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.controllers;

/**
 * Imports section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services.SalaryCalculator;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.Employee;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services.ReadFileToString;

import java.io.IOException;

/**
 * Control net calculator exercise page also index page and description page
 */
@Controller
public class MainController {

    /**
     * Declaration services and variables
     */
    @Autowired SalaryCalculator salaryCalculator;

    /**
     * Method responsible for loading requested index template
     * @return index template
     */
    @GetMapping("/")
    public String indexWelcome() throws IOException {
        return "welcomeScreen";
    }

    /**
     * Method responsible for loading requested description template
     * @return desc template
     */
    @GetMapping("/desc")
    public String indexDesc(Model model) throws IOException {
        model.addAttribute("message", ReadFileToString.readFileToArray("Redame.md"));
        return "textDescription";
    }

    /**
     * Method responsible for loading requested graphical exercise description template
     * @return graph template
     */
    @GetMapping("/graph")
    public String indexGraph() throws IOException {
        return "graphDescription";
    }

    /**
     * Method responsible for loading requested net calculator template also get user inputs and stored it into given model
     * @param model stored user inputs as order request
     * @return ready net calculator template
     */
    @GetMapping("/calc")
    public String index(Model model) throws IOException {
        model.addAttribute("employeeModel", new Employee());
        return "salaryCalculator";
    }

    /**
     * Method responsible for operating user inputs and manage it to net salary calculations
     * @param employee stored user inputs as order request
     * @param model holding calculations
     * @return potential net salary
     */
    @PostMapping("/calc")
    public String index(@ModelAttribute("employeeModel") Employee employee, Model model){
        model.addAttribute("message1", "DATA:");
        model.addAttribute("message2", "gross: " + employee.getGross());
        model.addAttribute("message3", "bonus: " + employee.getBonus());
        model.addAttribute("message4", "distance from work: " + employee.getDistanceFromWork());
        model.addAttribute("message5", "RESULT:");
        model.addAttribute("message6", "net: "
                + salaryCalculator.salaryNetCalculator(employee.getGross(), employee.getBonus(), employee.getDistanceFromWork()));
        return "salaryCalculator";
    }






}


