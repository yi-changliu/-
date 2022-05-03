package com.zzx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class user {
    public void userer(ConcurrentHashMap<String, book> bookmap) {
        System.out.println("Hello,Welcome to use booksyetem");
        int flag=1;
        while(true) {
            String op = menu();
            switch (op) {
                case "1":
                    FR_cha cha = new FR_cha();
                    cha.menu(bookmap);
                    break;
                case "2":
                    FR_jie jie = new FR_jie();
                    jie.jie(bookmap);
                    break;
                case "3":
                    FR_huan huan = new FR_huan();
                    huan.huan(bookmap);
                    break;
                case "4":
                    System.out.println("thanks for using");
                    flag=0;
                    break;
                default:
                    System.out.println("你TM故意找茬是吧!");    //可能会影响文件存储
            }
            if (flag == 0) {
                //DuoXianCheng.T = false;
                break;
            }
        }
    }
    public static String menu(){
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("1.查看书籍信息");
        System.out.println("2.借书");
        System.out.println("3.还书");
        System.out.println("4.退出登录");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("请输入您的选择：");
        Scanner cin=new Scanner(System.in);
        String choice=cin.next();
        return choice;
    }
}
