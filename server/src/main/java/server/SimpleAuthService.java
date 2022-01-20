package server;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleAuthService implements AuthService{
    private class UserData {
        String login;
        String password;
        String nickname;

        public UserData(String login, String password, String nickname) {
            this.login = login;
            this.password = password;
            this.nickname = nickname;
        }
    }

    private List<UserData> users;

    public SimpleAuthService() {
        this.users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new UserData("user" + i, "password" + 0, "nickname" +i));
        }
        users.add(new UserData("qwe", "qwe", "nick1"));
        users.add(new UserData("asd", "asd", "nick2"));
        users.add(new UserData("zxc", "zxc", "nick3"));
    }

    @Override
    public String getNicknameByLoginAndPassword(String login, String password) {
        for (UserData user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user.nickname;
            }
        }
        return null;
    }
}
