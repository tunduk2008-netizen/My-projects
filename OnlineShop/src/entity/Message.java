package entity;

public class Message {
    private User sender; //создаю приватное поле sender класса User
    private String message;//создаю приватное поле message класса String

    public Message(User sender, String message) {//создаю конструктор с принимаемыми параметрами
        this.sender = sender;//ссылаемся на самого себя
        this.message = message;//ссылаемся на самого себя
    }

    public User getSender() {//Создаем метод класса User для получения зачения sender
        return sender;//возвращаем значение sender
    }
    public void setSender(User sender) {//
        this.sender = sender;//
    }
    public String getMessage() {//
        return message;//
    }
    public void setMessage(String message) {//
        this.message = message;//
    }
    @Override//
    public String toString() {//
        return "Message{" +//
                "Отправитель = " +//
                sender +//
                ", message =' " + message + '\'' +//
                '}';//
    }
}
