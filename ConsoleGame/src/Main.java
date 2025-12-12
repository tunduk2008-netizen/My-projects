import application.GameApplication;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tДобро пожаловать в игру");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tЕсли хотите узнать список команд то введите help");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tПосле регистрации вам будут доступны новые команды, используйте команду register");
        GameApplication app = new GameApplication(sc);
        app.run();

    }
}
