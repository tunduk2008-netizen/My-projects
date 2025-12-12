package application.commands;

import application.GameApplication;

public class HelpComand {
    GameApplication gameApplication;


    public HelpComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }

    public void help() {
        if (gameApplication.auth != null){
            System.out.println("help - список всех команд, \nlogout - выйти из учетной записи, \nplay - начать игру, \nexit - завершить игру, \nallUsers - список всех игроков, \nregister - регистрация нового игрока(Вы уже зарегистрировались), \nlvl - узнать свой уровень");
        }else {
            System.out.println("help - список всех команд, \nregister - регистрация нового игрока");
        }
    }
}
