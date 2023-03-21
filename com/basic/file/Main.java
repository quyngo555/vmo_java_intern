package com.basic.file;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("you are created file");
            Writer.close();
            System.out.println("Successfully written.");

            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();

        } catch (FileNotFoundException e){
            System.out.println("cannot found file " + e.getMessage());

        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        // bufferedReader
        try
        {
            //Sample 01: Open the FileWriter, Buffered Writer
            FileWriter fw = new FileWriter("TestFile.Txt");
            BufferedWriter WriteFileBuffer = new BufferedWriter(fw);

            //Sample 02: Write Some Text to File
            // Using Buffered Writer)
            WriteFileBuffer.write("First Line");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("Second Line");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("Third Line");
            WriteFileBuffer.newLine();

            //Sample 03: Close both the Writers
            WriteFileBuffer.close();

            //Sample 04: Open the Readers Now
            FileReader fr = new FileReader("TestFile.txt");
            BufferedReader ReadFileBuffer = new BufferedReader(fr);

            //Sample 05: Read the text Written
            // using BufferedWriter
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());

            //Sample 06: Close the Readers
            ReadFileBuffer.close();

        } catch (IOException Ex)
        {
            System.out.println(Ex.getMessage());
        }
    }
}
