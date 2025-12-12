package application.commands;

import application.GameApplication;

public class CheckerComand {
    GameApplication gameApplication;
    public CheckerComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }
    public void check(){
        if (gameApplication.auth != null){
            gameApplication.input.nextLine();
        } else {
            System.out.println("Command error(Возможно вы не зарегистрированы)");
        }
    }
}
