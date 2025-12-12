package application.commands;

import application.GameApplication;

public class LogoutComand {

    public LogoutComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }
    GameApplication gameApplication;

    public void logout() {
        gameApplication.check();
        if (gameApplication.auth != null) {
            System.out.println("Вы уверены, что хотите выйти из учетной записи? \n Выберите Да или Нет!");
            if (gameApplication.input.next().equals("Да")){
                gameApplication.auth = null;
                System.out.println("Вы вышли из учетной записи");
            } else if (gameApplication.input.next().equals("Нет")){
                System.out.println("Команда отменена");
            }
        }else {
            System.out.println("Вы не зарегистрированы");
        }
    }
}
