/*package com.zzx;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class operate {
    public static void main(String[] args) throws IOException {
        ConcurrentHashMap<String, book> bookmap = new ConcurrentHashMap<>();
        IO io = new IO();
        io.duqv(bookmap);
        int flag=1;
        while (true) {
            String op = shenfen();
            switch (op) {
                case "1"://用户名:admin 密码:root
                    admin ad = new admin();
                    ad.yanzheng(bookmap);
                    break;
                case "2":
                    user us = new user();
                    us.userer(bookmap);
                    break;
                case "3":
                    flag = 0;
                    System.out.println("thanks for using!!!");
                    break;
                default:
                    System.out.println("你TM故意找茬是吧!");
            }
            if (flag == 0) {
                break;
            }
        }
        io.xieru(bookmap);
    }
    public static String shenfen() {
        Scanner cin = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("1:管理员");
        System.out.println("2:普通用户");
        System.out.println("3:退出系统");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("请输入您的选择：");
        String choice=cin.next();
        return choice;
    }

}
*/
