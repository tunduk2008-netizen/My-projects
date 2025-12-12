package application;
import application.commands.*;
import application.model.MonsterModel;
import application.model.UserModel;
import java.util.Scanner;

public class GameApplication {
    HelpComand helpComand = new HelpComand(this);
    AllUsersComand allUsersComand = new AllUsersComand(this);
    BitComand bitComand = new BitComand(this);
//    ExitComand exitComand = new ExitComand(this);
    LogoutComand logoutComand = new LogoutComand(this);
    LvlComand lvlComand = new LvlComand(this);
    PlayComand playComand = new PlayComand(this);
    RegisterComand registerComand = new RegisterComand(this);
    public Scanner input;
    public UserModel[] users;
    public MonsterModel monsterModel = new MonsterModel(1, 100, 20);


    public UserModel auth = null;

    public GameApplication(Scanner input) {
        this.input = input;
        users = new UserModel[0];
        this.auth = auth;

    }
    public void run() {
        while (true) {
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tВведите команду: ");
            String userCommand = input.nextLine();

            if (userCommand.equals("help")) helpComand.help();
            else if (userCommand.equals("register")) registerComand.register();
            else if (userCommand.equals("allUsers")) allUsersComand.allUsers();
            else if (userCommand.equals("play")) playComand.play();
//            else if (userCommand.equals("exit")) exitComand.exit();
            else if (userCommand.equals("lvl")) lvlComand.level(1);
            else if (userCommand.equals("bit")) bitComand.bit();
            else if (userCommand.equals("logout")) logoutComand.logout();
            else {
                System.out.println("Command not found");
            }
        }
    }

}