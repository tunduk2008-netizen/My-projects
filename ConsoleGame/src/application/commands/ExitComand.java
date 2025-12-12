package application.commands;

import application.GameApplication;

public class ExitComand {
    public ExitComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }

    GameApplication gameApplication;
    public void exit() {
        gameApplication.check();
        System.out.println("Завершение");
        return;
    }
}
