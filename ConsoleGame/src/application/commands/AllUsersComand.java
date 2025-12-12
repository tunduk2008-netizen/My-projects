package application.commands;

import application.GameApplication;

public class AllUsersComand {
    public AllUsersComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }
    GameApplication gameApplication;

    public void allUsers() {
        gameApplication.check();
        if (gameApplication.auth == null) {
            return;
        } else {
            System.out.println("Список всех игроков: ");
            for (int i = 0; i < gameApplication.users.length; i++) {
                System.out.println(gameApplication.users[i]);
            }
        }
    }
}
