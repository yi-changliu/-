package com.zzx;

public class book {
    private String name;
    private String author;
    private String price;
    private String type;

    private boolean status;

    @Override
    public String toString() {
        if (this.status) {
            return "书名:" + name + " " + "作者:" + author + " " + "价格:" + price + " " + "类型:" + type + " " + "借阅状态:未借出";
        } else {
            return "书名:" + name + " " + "作者:" + author + " " + "价格:" + price + " " + "类型:" + type + " " + "借阅状态:已借出";
        }
    }

    public book() {
        this.status = true;
    }

    public book(String name, String author, String price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
