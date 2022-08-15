package pro.sky;


import pro.sky.exception.WrongLoginException;
import pro.sky.exception.WrongPasswordException;

public class Check {
    public static boolean checkCorrect(String login, String password, String confirmPassword) {
        try {checkLogin(login);
checkPassword(password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }



    private static void checkLogin(String login) {
        if (!login.matches("\\w{1,20}")) {
            throw new WrongPasswordException("неверный логин");
        }
    }

    private static void checkPassword(String password, String confirmPassword) {
        if (!password.matches("\\w{1,19}") || !confirmPassword.matches("\\w{1,19}")||!password.equals(confirmPassword)) {
            throw new WrongPasswordException("неправельный пароль!");
        }
    }
}