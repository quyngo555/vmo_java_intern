package FileProcessingAndExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            System.setIn(new FileInputStream("input.txt"));
        }catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }

    }
}
