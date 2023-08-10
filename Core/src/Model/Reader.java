package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел:");
        System.out.println("Фамилия Имя Отчество(формат строки)");
        System.out.println("Дата рождения(формат дд.мм.гггг)");
        System.out.println("Номер телефона(только цифры,без знаков и разделителей)");
        System.out.println("Пол(мужской-m, женский-f)");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public void readFileUserData(String s) {
        String filePath = s + ".txt";
        try (FileReader readFile = new FileReader(filePath)) {
            int c;
            while ((c = readFile.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
