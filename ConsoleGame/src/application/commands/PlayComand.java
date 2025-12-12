package application.commands;

import application.GameApplication;
import application.model.UserModel;

public class PlayComand {

    public PlayComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }

    GameApplication gameApplication;


    public void play() {

        if (gameApplication.auth == null) {
            return;
        } else {
            System.out.println("bit - для того чтобы ударить");
        }
    }
}
