package pl.akademiakodu.MethodsExerciseSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.akademiakodu.MethodsExerciseSpring.models.forms.ExerciseScreen;

import java.io.IOException;

@Controller
public class MainController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String indexGet(Model model) {
        model.addAttribute("displayExercise", new ExerciseScreen());
        return "displayExercise";
    }

}
