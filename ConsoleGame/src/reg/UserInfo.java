package reg;

public class UserInfo {
    private String login;
    private String password;


    public String getPassword(String p) {
        System.out.print(password);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin(String l) {
        System.out.println(login);
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}
