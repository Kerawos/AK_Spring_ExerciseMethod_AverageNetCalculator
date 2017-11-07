package pl.akademiakodu.MethodsExerciseSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.MethodsExerciseSpring.models.services.ReadFileToString;

import java.io.IOException;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexGet(Model model) throws IOException {
        //display to user *dexcription
        model.addAttribute("message", ReadFileToString.readFile("description.txt"));
        return "displayExercise";
    }
}


