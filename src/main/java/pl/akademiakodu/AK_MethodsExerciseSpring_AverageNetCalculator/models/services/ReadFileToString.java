package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Service responsible for convert text in templates. To better view to user.
 */
@Service
public class ReadFileToString {

    /**
     * Method read text description from text file and store it into string
     * @param filePath given file path
     * @return description of file
     * @throws IOException in case of file not existing
     */
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

    /**
     * Method read text description from text file and store it into array string
     * @param filePath given file path
     * @return description of file
     * @throws IOException in case of file not existing
     */
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
