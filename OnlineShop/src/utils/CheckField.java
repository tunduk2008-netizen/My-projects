package utils;

import exceptions.InvalidFieldException;

public class CheckField {
    public static String checkLoginPassword(String login, String password) {
        if (password.length() < 3) {
            throw new InvalidFieldException("Пароль не может быть меньше 3-х букв!");
        } else if (password.length() > 12) {
            throw new InvalidFieldException("Пароль не может быть больше 12-ти букв!");
        } else if (password.contains(" ")) {
            throw new InvalidFieldException("Пароль не может содержать пробелы!");
        } else if (login.length() < 3) throw new InvalidFieldException("Логин не может быть меньше 3-х букв!");
        else if (login.length() > 8) throw new InvalidFieldException("Логин не может быть больше 8-х букв!");
        else if (login.contains(" ")) throw new InvalidFieldException("Логин не может содержать пробелы!");
        return password;
    }
}

