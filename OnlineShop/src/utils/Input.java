package utils;


import java.util.Scanner; // Импорт класса Scanner для чтения ввода пользователя

public class Input {
    private static Scanner scanner = new Scanner(System.in); //Статический экземпляр класса сканер для чтения с консоли

    public static String inputLine() { // Статический метод для чтения строки введенные пользователем
        while (true) {
            String line = scanner.nextLine(); //Читает строку
            if (line.isEmpty()) {
                //Если строка пустая:
                System.out.println("Не может быть пустым!");
                System.out.print("Попробуйте ещё раз");
                continue; //Переходит к следующей итеррации цикла(запрашивает ввод ещё раз)
            }

            return line; //возвращает введенную непустую строку
        }
    }

    public static Long inputLong() throws ArithmeticException { //публичный статический метод для чтения Long от пользавателя с проверками
        while (true) {
            Long longNum = scanner.nextLong(); //читает Long

            if (!scanner.hasNextLong()) { //Если следующий ввод не Long то выводит ошибку
                throw new ArithmeticException("Неправильные параметры введены");
            }
            else if (longNum <= 0) { //Если введеный Long меньше или равен 0:
                throw new ArithmeticException("Нельзе ставить значение 0 или меньше");
            }
                return longNum; //Возвращает корректно введеный Long, больше 0
        }
    }
}