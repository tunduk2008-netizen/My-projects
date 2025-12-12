package entity;

import java.util.ArrayList; //Импорт класса ArrayList для создания списка сообщений
import java.util.List; //Импорт интерфейс List для работы со спиками
import enums.UserTypes; //Импорт перечисления UserTypes

public abstract class User { // Абстрактный класс User - базовый класс для различных типов пользоваателей
    protected Long id; // Уникальный идентификатор пользователя
    protected String login; // Логин пользователя
    protected String password; // Пароль пользователя
    protected UserTypes userType; // Тип пользователя (из перечисления UserTypes)
    protected List<Message> messages; // Список сообщений пользователя
    protected Long messageCount; // Количество сообщений пользователя
    protected Long balance; // Баланс пользователя

    public User(String login, String password) { //публичный конструктор класса User принимающий логин и пароль
        this.login = login; // Инициализация поля login переданным значением
        this.password = password; // Инициализация поля password переданным значением
        this.messages = new ArrayList<>(); // Инициализация списка messages новым пустым экземпляром ArrayList
        balance = 0l; // Инициализация поля balance значением 0l (Long 0)
        messageCount = 0l; //Инициализация поля messageCount значением 0l
    }

    public Long getId() { //Публичный метод getId для получения значения поля id
        return id; // Возвращает текущее значение поля id
    }

    public User setId(Long id) { //публичный метод setId для установки значения поля id. Возвращает текущей обьект User для цепочки вызовов (fluent API)
        this.id = id; //устанавливает значение поля id переданным значением
        return this; //Возвращает ссылку на текущий обьект User
    }

    public String getLogin() {return login;} //публичный метод getLogin для получения значения поля login. Возвращает текущее значение поля login

    public User setLogin(String login) {this.login = login; return this;} //публичный метод setlogin для установки значения поля login возвращает текущей обьект User, устанавливает значение поля login переданным значением, возвращает ссылку на текущий обьект User

    public String getPassword() {return password;}//публичный метод getPassword для получения значения поля password. Возвращает текущее значение поля password
    public User setPassword(String password) {this.password = password; return this;}// публичный метод setpassword для установки значения поля password. Возвращает текуший обьект User

    public Long getBalance() {return balance;}//публичный метод для получения значения поля balance и возвращает текущее значение поля balance
    public UserTypes getUserType() {return userType;}//публичные метод для получения значения поля userType, возвращает текущее значение поля userType
    public void setUserType(UserTypes userType) {this.userType = userType;}//публичный метод для установки значения поля userType, устанавливает значение поля userType переданным значением
    public User setBalance(Long balance) {this.balance = balance;return this;}//публичный метод для установки значения поля balance. возвращает текущий обьект User
    public List<Message> getMessages() {return messages;}//публичный метод для получения списка сообщений пользователя
    public Long getMessagesCount() {return messageCount;}//публичный метод для получения количества сообщений пользователя
    public void setMessagesCount(Long messageCount) {this.messageCount = messageCount;}//публичный метод для установки значения поля messageCount

    @Override//переопределение стандартного метода toString() для представления обьекта User в виде строки
    public String toString() {
        return "User{ " +//начало строкового представления
                "id = " + id +//добавления идентификатора пользователя
                ", login = '" + login + '\'' +//добавления логина пользователя а кавычках
                ", userType = " + userType +//добавление типа пользователя
                '}';//конец строкового представления
    }
}
