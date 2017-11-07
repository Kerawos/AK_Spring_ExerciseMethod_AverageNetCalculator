package pl.akademiakodu.MethodsExerciseSpring.models.services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileToString {

    //method to read .txt (*description)
    public static String readFileToString(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;

        while((line =bufferedReader.readLine())!=null){

            stringBuffer.append(line).append("\n");
            //todo break lines in html page
            //stringBuffer.append(line).append("<br>");
            //stringBuffer.append(line).append("<br>");
        }
        return stringBuffer.toString();
    }

    //method to read .txt to Array
    public static List<String> readFileToArray(String filePath) throws IOException {
        List<String> text = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;

        while((line = bufferedReader.readLine())!=null){
            text.add(line);
        }
        return text;
    }

}
