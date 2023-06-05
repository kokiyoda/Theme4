package org.example;

public class Pokemon {
    public  int lv;
    private int no;
    private String name;


    public Pokemon(int lv , int no, String name) {
        this.lv = lv;
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLv() {
        return lv;
    }
    public void setLv(int lv) {
        this.lv = lv;
    }

    public String toString(){
        return "Lv." + this.lv + ": " + this.no + "-" + this.name;
    }
}
