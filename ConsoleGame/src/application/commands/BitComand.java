package application.commands;

import application.GameApplication;
import application.model.MonsterModel;
import application.model.UserModel;

public class BitComand {
    public BitComand(GameApplication gameApplication) {
        this.gameApplication = gameApplication;
    }

    GameApplication gameApplication;

    public void bit() {
        gameApplication.check();
        System.out.println();
        if (gameApplication.auth == null) {
            System.out.println("Для выполнения команды нужно авторизироваться");
            return;
        }
        if (gameApplication.input.nextLine() == "bits") {
            System.out.println("Вы неправильно ввели команду.Игра закончилась");
        }else {
            System.out.println("Перед вами монстр");
            UserModel player = new UserModel();
            int f = gameApplication.monsterModel.getLevel();
            System.out.println("Уровень: " + f);
            f = gameApplication.monsterModel.getHp();
            System.out.println("ХП: " + (f / 2));
            gameApplication.monsterModel.setHp(f);
            f = gameApplication.monsterModel.getDamage();
            System.out.println("Урон: " + f);
            System.out.println("Монстр нанес вам урон: ");
            player.setHp(player.getHp() - gameApplication.monsterModel.getDamage());
            System.out.println("У вас осталось: " + player.getHp() + " ХП");

            if (player.getHp() == 0){
                System.out.println("Вы проиграли");
                return;
            }else { int x = gameApplication.monsterModel.getHp() - player.getDamage();
                System.out.println("Вы нанесли удар монстру");
                System.out.print("Оставшиеся хп монстра: ");
                gameApplication.monsterModel.setHp(x);
                System.out.println(gameApplication.monsterModel.getHp());
                if (gameApplication.monsterModel.getHp() == 0) {
                    System.out.println("Монстр повержен");
                    System.out.println("Новый монстр");
                    MonsterModel monsterModel1 = new MonsterModel((gameApplication.monsterModel.getLevel() + 1), 100, 10);
                    int s = monsterModel1.getLevel();
                    System.out.println("Уровень: " + s);
                    s = monsterModel1.getHp() * monsterModel1.getLevel() / 2;
                    monsterModel1.setHp(s);
                    System.out.println("ХП: " + s);
                    s = monsterModel1.getDamage() * 10 / 2;
                    System.out.println("Урон: " + s);
                    gameApplication.monsterModel = monsterModel1;
                    return;
                }
            }
        }
    }

}
