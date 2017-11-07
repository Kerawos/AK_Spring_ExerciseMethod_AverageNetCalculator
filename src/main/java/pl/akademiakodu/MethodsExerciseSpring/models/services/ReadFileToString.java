package pl.akademiakodu.MethodsExerciseSpring.models.services;

import java.io.*;

public class ReadFileToString {

    //method to read .txt (*description)
    public static String readFile(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;

        while((line =bufferedReader.readLine())!=null){

            stringBuffer.append(line).append("\n");
            //todo break lines in html page
            //stringBuffer.append(line).append("<br />");
        }
        return stringBuffer.toString();
    }

}
