package reg;

import java.util.Scanner;
public class Register {
    String[] logBase = new String[1];
    String[] passBase = new String[1];
    public void regis() {
        Scanner regsc = new Scanner(System.in);
        UserInfo user = new UserInfo();
        System.out.print("Логин: ");
        regsc.nextLine();
        user.setLogin(regsc.next());
        user.getLogin(logBase[0]);
        System.out.print("Пароль: ");
        user.setPassword(regsc.next());
        regsc.nextLine();
        user.getLogin(passBase[0]);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tВы зарегистрированы! \n \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tПриятной игры");

    }

    public void inf(){
            UserInfo info = new UserInfo();
            System.out.println(info.getLogin(logBase[0]));
            System.out.println(info.getPassword(passBase[0]));
    }
}
