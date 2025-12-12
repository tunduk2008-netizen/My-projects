package application.model;

public class UserModel {
    private int level;
    private int hp;
    private int damage;
    private String username;
    private String password;
    private String answer;

//    public void showUsers(){
//        if (username.isEmpty()){
//            System.out.println("Нету пользоватлей");
//            return;
//        }
//        System.out.println("Игроки { " +
//                "username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", hp='" + hp + '\'' +
//                ", level='" + level + '\'' +
//                ", damage='" + damage + '\'' +
//                " }");
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel() {
        this.level = 1;
        this.hp = 100;
        this.damage = 50;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Игроки { " +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hp='" + hp + '\'' +
                ", level='" + level + '\'' +
                ", damage='" + damage + '\'' +
                " }";
    }
}
