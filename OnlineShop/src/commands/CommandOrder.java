package commands;
// Определяем интерфейс в функциональный интерфейс с помощью аннотации @FunctionalInterface
@FunctionalInterface
public interface CommandOrder {
    // Обьявляю абстрактный метод, не возвращающий значения(void)
    void execute();
}
