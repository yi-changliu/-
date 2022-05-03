package com.zzx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FR_xiu {
    Scanner cin = new Scanner(System.in);

    public void xiu(ConcurrentHashMap<String, book> t) {
        System.out.print("请输入您要修改的书籍名字:");
        String name = cin.next();
        if (t.containsKey(name)) {
            t.remove(name);
            book temp = new book();
            System.out.print("书名:");
            String name1= cin.next();
            temp.setName(name1);
            System.out.print("作者:");
            String author = cin.next();
            temp.setAuthor(author);
            System.out.print("价格:");
            String price = cin.next();
            temp.setPrice(price);
            System.out.print("类型:");
            String type= cin.next();
            temp.setType(type);
            System.out.println("请输入借阅状态,1代表未被借阅,0代表已被借阅");
            System.out.println("状态:");
            int status = cin.nextInt();
            if (status == 1) {
                temp.setStatus(true);
            } else {
                temp.setStatus(false);
            }
            t.put(name1, temp);
        } else {
            System.out.println("您要修改的书籍不存在!");
        }
    }
}
