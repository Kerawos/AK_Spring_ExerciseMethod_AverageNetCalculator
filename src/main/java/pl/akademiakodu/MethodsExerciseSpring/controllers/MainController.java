package pl.akademiakodu.MethodsExerciseSpring.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.akademiakodu.MethodsExerciseSpring.models.forms.ExerciseScreen;
import pl.akademiakodu.MethodsExerciseSpring.models.forms.FileToString;

import java.io.IOException;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexGet(Model model) throws IOException {
        model.addAttribute("message", FileToString.readFile("description.txt"));
        return "displayExercise";
    }

//    @PostMapping("/")
//    public String index(@ModelAttribute("displayExercise") ExerciseScreen form, Model model) {
//        model.addAttribute("message", "asdfasdfasdfsaf");
//        return "displayExercise";
//    }



}


