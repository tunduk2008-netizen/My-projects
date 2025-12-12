package reg;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tДобро пожаловать в игру!");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tВведите команду help для вовода списка команд");
        while (true){
            String command = sc.next();
            if (command.equals("help")){
                System.out.println("help - список команд\nplay - начать игру\nexit - завершить игру");
            } else if (command.equals("play")) {
                System.out.println("Чтобы начать играть в должны зарегистрироваться для этого используйте команду reg");
                command = sc.next();
                if (command.equals("reg")){
                    Register reg = new Register();
                    reg.regis();
                } else {
                    System.out.println("Ошибка");
                    break;
                }
            } else if (command.equals("exit")) {
                System.out.println("Вы завершили игру");
                break;
            } else if (command.equals("inf")) {
                Register info = new Register();
                info.inf();
            }
            }
        }

    }