package com.company;

import java.util.Scanner;

public class User
{
    private final static String user = "Admin";
    private final static String senha = "Admin";

    static void logue(){

        loginSystem();
    }
        private static void loginSystem()
        {   LOL:
            while(true)
            {
            System.out.println("digite seu User ");
            Scanner userName = new Scanner(System.in);
            String user = userName.nextLine();
            System.out.println("Digite sua Senha!");
            Scanner userSenha = new Scanner(System.in);
            String psw = userSenha.nextLine();

            User log = new User();
            String resp = log.verificacao(user,psw);
            System.out.println(resp);
                if(user.equals(senha)){
                break LOL;
            }else
                continue LOL;
            }
        }
         private String verificacao(String n , String p) {


            if(((n.equals(user) && p.equals(senha))))
            {
            System.out.println("Voce Logou Com Sucesso!");
             return "acesso liberado";
            }
                else
                    return "tente de novo";
    }

}
