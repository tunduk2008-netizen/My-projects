package commands;

import commands.Command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    private Map<String, CommandOrder> commands; //обьявляю переменную чтобы хранить, находить и быстро выполнять команду

    private void commandInitialization() {
    commands = new HashMap<String, CommandOrder>(); //присваеваем  переменной commands новый экземпляр HashMap

        //ниже добавляем новые команды после созданиях их класса и его реализации, например если создали класс Help
        //добавляем так
        commands.put("help", new Help(commands.values()));

}
}

