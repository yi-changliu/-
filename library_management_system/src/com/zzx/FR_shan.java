package com.zzx;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FR_shan {
    Scanner cin = new Scanner(System.in);
    public void shan(ConcurrentHashMap<String, book> t) {
        System.out.print("请输入您要删除的书籍:");
        String name = cin.next();
        if (t.containsKey(name)) {
            t.remove(name);
            System.out.println("删除成功!");
        } else {
            System.out.println("您删除的书籍不存在!");
        }
    }
}
