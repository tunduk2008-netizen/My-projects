package commands.Command;
import commands.CommandOrder;

import java.util.Collection;

//класс реализирующий интерфейс CommandOrder
public class Help implements CommandOrder {
    //создается коллекция CommandOrder
    private Collection<CommandOrder> commandsOrders;

    // Конструктор принимает и сохраняет коллекцию CommandOrder
    public Help(Collection<CommandOrder> commandsOrders) {
        this.commandsOrders = commandsOrders;
    }

    //переопрделяем метод execute
    @Override
    public void execute() {
        commandsOrders.forEach(command -> {
            if (!command.toString().equals("")) System.out.println(command); //проверяем не является ли стрковое представление пустым, если не пустое то выводим в консоль
        });
    }

    //переопрделяем метод execute
    @Override
    // возвращаем String значение
    public String toString() { return "help - список команд"; }
}
