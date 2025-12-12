package application.commands;

import application.GameApplication;
import application.model.UserModel;

public class LvlComand {
    public LvlComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }

    GameApplication gameApplication;
    public int level(int lvl) {
        gameApplication.check();
        if (gameApplication.auth == null) {
            gameApplication.text();
            return 0;
        }
        UserModel lvlPlay = new UserModel();
        System.out.println("Ваш уровень: " + lvlPlay.getLevel());
        return lvl;
    }
}
