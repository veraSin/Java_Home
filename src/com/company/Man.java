package com.company;

public class Man {
    private String name;
    private int len; // сколько может пробежать
    private int h; // на какую высоту может прыгнуть

    public Man(String name, int len, int h) {
        this.name = name;
        this.len = len;
        this.h = h;
    }

    public void jump() {
        System.out.println("Человек прыгнул");
    }

    public void run() {
        System.out.println("Человек пробежал");
    }

    public void Go(Object[] prep)  {
        int tlen = len;
    }
}
