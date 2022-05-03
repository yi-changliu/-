package com.zzx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class admin {
    Scanner cin = new Scanner(System.in);

    public void yanzheng(ConcurrentHashMap<String, book> bookmap) {
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print("请输入用户名:");
        String username = cin.next();
        System.out.print("请输入密码:");
        String password = cin.next();
        if (username.equals("admin") && password.equals("root")) {
            adminter(bookmap);
        } else {
            System.out.println("您输入的用户名或密码有错误!");
        }
    }

    public void adminter(ConcurrentHashMap<String, book> bookmap) {
        System.out.println("Hello,Welcome to use booksyetem");
        int flag=1;
        while (true) {
            String op = menu();
            switch (op) {
                case "1":
                    FR_cha cha = new FR_cha();
                    cha.menu(bookmap);
                    break;
                case "2":
                    FR_cun fr = new FR_cun();
                    fr.cunru(bookmap);
                    break;
                case "3":
                    FR_xiu xiu = new FR_xiu();
                    xiu.xiu(bookmap);
                    break;
                case "4":
                    FR_shan shan = new FR_shan();
                    shan.shan(bookmap);
                    break;
                case "5":
                    FR_jie jie = new FR_jie();
                    jie.jie(bookmap);
                    break;
                case "6":
                    FR_huan huan = new FR_huan();
                    huan.huan(bookmap);
                    break;
                case "7":
                    System.out.println("thanks for using!!!");
                    flag = 0;
                    break;
                default:
                    System.out.println("你TM故意找茬是吧!");
            }
            if (flag == 0) {
                //DuoXianCheng.T = false;
                break;
            }
        }
    }

    public static String menu() {
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("1.查看书籍信息");
        System.out.println("2.存入书籍信息");
        System.out.println("3.修改书籍信息");
        System.out.println("4.删除书籍信息");
        System.out.println("5.借书");
        System.out.println("6.还书");
        System.out.println("7.退出登录");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("请输入您的选择：");
        Scanner cin = new Scanner(System.in);
        String choice=cin.next();
        return choice;
    }
}
