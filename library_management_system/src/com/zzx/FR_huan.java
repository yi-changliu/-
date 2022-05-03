package com.zzx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FR_huan {
    public void huan(ConcurrentHashMap<String, book> t){
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入你要归还的书籍名字:");
        String name = cin.next();
        if (t.containsKey(name)) {
            book b = (book)t.get(name);
            if (b.isStatus() == true) {
                System.out.println("谢谢您为图书馆做出的贡献!");
            } else {
                b.setStatus(true);
                t.put(name,b);
                System.out.println("还书成功!");
            }
        } else {
            System.out.println("谢谢您为图书馆做出的贡献!");
        }
    }
}
