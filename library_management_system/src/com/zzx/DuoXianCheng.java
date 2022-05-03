package com.zzx;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class DuoXianCheng extends Thread{

    static ConcurrentHashMap<String, book> bookmap = new ConcurrentHashMap<>();

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

    public static void main(String[] args) throws IOException, InterruptedException {
        IO io = new IO();
        io.duqv(bookmap);
        int flag=1;
        DuoXianCheng a = new DuoXianCheng();
        DuoXianCheng b = new DuoXianCheng();
        DuoXianCheng c = new DuoXianCheng();
        a.start();
        a.join();
        b.start();
        b.join();
        c.start();
        c.join();
        io.xieru(bookmap);
    }

    public static boolean T = false;
    @Override
    public void run() {
        int flag = 1;
           while (true) {
               synchronized (this) {
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
        }
    }
}
//if (T){
//                Thread temp = Thread.currentThread();
//                while (T){
//                    try {
//                        temp.join(1);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//            T = true;