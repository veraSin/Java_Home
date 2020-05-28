package com.company;

public class Cat {
    private String name;
    private int len; // сколько может пробежать
    private int h; // на какую высоту может прыгнуть


    public Cat(String name, int len, int h) {
        this.name = name;
        this.len = len;
        this.h = h;

    }

    public void jump() {
        System.out.println("Кот прыгнул");
    }

    public void run() {
        System.out.println("Кот пробежал");
    }
}