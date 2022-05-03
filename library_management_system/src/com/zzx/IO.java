package com.zzx;

import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

public class IO {
    File file = new File("\\图书信息.txt");
    public void duqv(ConcurrentHashMap<String, book> t) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String temp;
        while ((temp = br.readLine()) != null) {
            int a;
            int c=0;
            int d=0;
            int flag;
            book h = new book();
            a=temp.indexOf("书名:");
            flag=0;
            for (int b = a; b < temp.length(); b++) {
                if (temp.charAt(b) == ':'&&flag==0) {
                    c=b;
                    flag = 1;
                }
                if (temp.charAt(b) == ' ') {
                    d=b;
                    break;
                }
            }
            h.setName(temp.substring(c+1,d));
            a=temp.indexOf("作者:");
            flag=0;
            for (int b = a; b < temp.length(); b++) {
                if (temp.charAt(b) == ':'&&flag==0) {
                    c=b;
                    flag = 1;
                }
                if (temp.charAt(b) == ' ') {
                    d=b;
                    break;
                }
            }
            h.setAuthor(temp.substring(c+1,d));
            a=temp.indexOf("价格:");
            flag=0;
            for (int b = a; b < temp.length(); b++) {
                if (temp.charAt(b) == ':'&&flag==0) {
                    c=b;
                    flag = 1;
                }
                if (temp.charAt(b) == ' ') {
                    d=b;
                    break;
                }
            }
            h.setPrice(temp.substring(c+1,d));
            a=temp.indexOf("类型:");
            flag=0;
            for (int b = a; b < temp.length(); b++) {
                if (temp.charAt(b) == ':'&&flag==0) {
                    c=b;
                    flag = 1;
                }
                if (temp.charAt(b) == ' ') {
                    d=b;
                    break;
                }
            }
            h.setType(temp.substring(c+1,d));
            a=temp.indexOf("借阅状态:");
            flag=0;
            for (int b = a; b < temp.length(); b++) {
                if (temp.charAt(b) == ':'&&flag==0) {
                    c=b;
                    flag = 1;
                }
            }
            String status = temp.substring(c + 1);
            if (status.equals("未借出")) {
                h.setStatus(true);
            } else {
                h.setStatus(false);
            }
            t.put(h.getName(), h);
        }
        br.close();
        fr.close();
    }

    public void xieru(ConcurrentHashMap<String, book> t) throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Object s : t.keySet()) {
            String temp = t.get(s).toString();
            bw.write(temp);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
