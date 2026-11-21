package com.hashing;
import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("login system");
        System.out.print("username: ");
        String username = sc.next();
        System.out.print("password: ");
        String password = sc.next();
        LoginService service = new LoginService();
       boolean result = service.validate(username, password);
        if(result){
            System.out.println("welcome"+username);
            System.out.println("now you can access the system");
        }else{
            System.out.println("invalid credentials");
            System.out.println("System exit");
        }
        System.out.println("**************");
            sc.close();
    }
}