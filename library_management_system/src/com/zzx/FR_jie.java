package com.zzx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FR_jie {
    Scanner cin = new Scanner(System.in);
    public void jie(ConcurrentHashMap<String, book> t) {
        System.out.print("请输入你要借阅的书籍名字:");
        String name = cin.next();
        if (t.containsKey(name)) {
            book b = (book)t.get(name);
            if (b.isStatus() == false) {
                System.out.println("该书已被借出!");
            } else {
                b.setStatus(false);
                t.put(name,b);
                System.out.println("借阅成功!");
            }
        } else {
            System.out.println("您要借阅的书籍不存在!");
        }
    }
}
