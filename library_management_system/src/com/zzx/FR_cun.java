package com.zzx;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FR_cun {
    Scanner cin =new Scanner(System.in);
    public book tishi() {
        System.out.println("请输入书籍信息:");
        book temp = new book();
        System.out.print("书名:");
        String name= cin.next();
        temp.setName(name);
        System.out.print("作者:");
        String author = cin.next();
        temp.setAuthor(author);
        System.out.print("价格:");
        String price = cin.next();
        temp.setPrice(price);
        System.out.print("类型:");
        String type= cin.next();
        temp.setType(type);
        return temp;
    }
    public void cunru(ConcurrentHashMap<String, book> t){
        book temp=tishi();
        t.put(temp.getName(),temp);
        System.out.println("存入成功!");
    }
}
