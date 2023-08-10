package View;

import Controller.CChecker;
import Controller.CParser;
import Controller.CReader;
import Controller.CSaver;
import Model.Reader;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserView {
    public void run() {
        CReader read = new CReader();
        CParser parse = new CParser();
        CChecker check = new CChecker();
        CSaver save = new CSaver();
        Scanner scanner = new Scanner(System.in);
        String doing = "Y";
        while (!doing.equals("N")) {
            System.out.println("Введите номер действия:");
            System.out.println("1: Записать нового пользователя в файл");
            System.out.println("2: Прочитать файл");
            switch (scanner.nextInt()) {
                case (1):
                    try {
                        save.saveCheckUserData(check.checkUserData(parse.parseUserInput(read.ReadUserInput())));
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                    break;
                case (2):
                    System.out.println("Введите имя файла для чтения: ");
                    Scanner sc = new Scanner(System.in);
                    try {
                        String name = sc.nextLine();
                        read.readCheckedUserData(name);
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
            }
            Scanner scFinal = new Scanner(System.in);
            System.out.println("Хотите продолжить работу?(Y/N)");
            doing = scFinal.next();
        }
    }
}



