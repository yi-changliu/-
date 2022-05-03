package com.zzx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FR_cha {
    Scanner cin = new Scanner(System.in);

    public void menu(ConcurrentHashMap<String, book> t) {
        String op = qianzhi();
        switch (op) {
            case "1":
                all(t);
                break;
            case "2":
                chakan(t);
                break;
            default:
                System.out.println("你TM故意找茬是吧!!!");
        }
    }

    public String qianzhi() {
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("1.查看所有书籍");
        System.out.println("2.查看特定书籍");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("请输入你的选择:");
        return cin.next();
    }
    public void chakan(ConcurrentHashMap<String, book> t) {

        System.out.print("请输入你要查看的书籍名字:");
        String name = cin.next();
        if (t.containsKey(name)) {
            System.out.println(t.get(name));
        } else {
            System.out.println("您查找的书籍不存在!");
        }
    }
    public void all(ConcurrentHashMap<String, book> t) {
        if (!t.isEmpty()) {
            for (String s : t.keySet()) {
                System.out.println(t.get(s));
            }
        } else {
            System.out.println("馆中无书!!!");
        }
    }
}
