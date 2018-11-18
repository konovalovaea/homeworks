package lesson3.In;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу которая бы считывала данные из консоли до тех пор пока пользователь не
 * напишет слова exit, quit или close
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String inputLine = reader.readLine();
            if (inputLine.equalsIgnoreCase("exit") || inputLine.equalsIgnoreCase("quit") || inputLine.equalsIgnoreCase("close")){
                break;
            } else {
                System.out.println(inputLine);
            }
        }
    }
}

