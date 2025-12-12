package application.commands;

import application.GameApplication;
import application.model.UserModel;

public class RegisterComand {
    GameApplication gameApplication;

    public RegisterComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }

    public void register() {
        if (gameApplication.auth == null) {
            System.out.println("Введите логин и пароль для регистррации");
            UserModel userModel = new UserModel();
            System.out.print("Логин: ");
            userModel.setUsername(gameApplication.input.nextLine());
            if (userModel.getUsername().isEmpty()) {
                System.out.println("Логин не может быть пустым");
                System.out.println("Вам придется ввести логин заново");
                return;
            } else if(userModel.getUsername().contains(" ")){
                System.out.println("Логин не может содержать пробелы");
                return;
            }
            System.out.print("Пароль: ");
            userModel.setPassword(gameApplication.input.nextLine());
            if (userModel.getPassword().isEmpty()) {
                System.out.println("Пароль не может быть пустым");
                return;
            } else if (userModel.getPassword().contains(" ")){
                System.out.println("Пароль не может содежать пробелы");
            }
            UserModel[] temp = new UserModel[gameApplication.users.length + 1];
            for (int i = 0; i < gameApplication.users.length; i++) {
                temp[i] = gameApplication.users[i];
            }
            gameApplication.users = temp;
            gameApplication.users[gameApplication.users.length - 1] = userModel;
            gameApplication.auth = userModel;
            System.out.println("Вы зарегистрировались");
        } else {
            System.out.println("Вы уже зарегистрированы");
        }
    }
}
