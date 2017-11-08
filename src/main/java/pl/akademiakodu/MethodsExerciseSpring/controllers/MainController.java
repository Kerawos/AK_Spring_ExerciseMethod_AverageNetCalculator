package pl.akademiakodu.MethodsExerciseSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String indexCalc(Model model) throws IOException {
        return "salaryCalculator";
    }





}


