package lesson3.Out;
import java.io.*;
/*
   Напишите программу которая бы считывала Имена который пользователь забивал в консоль,
 * принимать данные до тех пор пока пользователь не напишет слова exit, quit или close
 * Все данные которые ввёл пользователь необходимо записать в файл в алфавитном порядке
 */
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("OutExample.txt"); // создаем файл для записи
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        while (true) {

            String inputLine = reader.readLine();

            if (inputLine.equalsIgnoreCase("exit") || inputLine.equalsIgnoreCase("quit") || inputLine.equalsIgnoreCase("close")){
                writer.flush();
                writer.close();
                break;
            } else {
                writer.write(inputLine + "\n");
            }
        }
        // доделать - FileReader для сортировки содержимого файла
    }

}
