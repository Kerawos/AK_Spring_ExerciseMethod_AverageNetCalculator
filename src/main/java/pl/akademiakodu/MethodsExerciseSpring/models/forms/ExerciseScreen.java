package pl.akademiakodu.MethodsExerciseSpring.models.forms;

import java.io.*;

public class ExerciseScreen {

    private String filePath = "description.txt";
    //private String exercise = FileToString.readFile(filePath);
    private String exercise;

    public ExerciseScreen() {
    }

    public ExerciseScreen(String exercise) {
        this.exercise = "hello";
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }
}
