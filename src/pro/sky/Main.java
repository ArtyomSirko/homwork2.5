package pro.sky;


import pro.sky.exception.WrongLoginException;
import pro.sky.exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean check1 = Check.checkCorrect("fffffkgit", "Sirko", "Sirko1");
        System.out.println(check1);
    }
}