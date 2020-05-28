package com.company;

public class Dog {
    private String name;
    private int len; // сколько может пробежать
    private int h; // на какую высоту может прыгнуть

    public Dog(String name, int len, int h) {
        this.name = name;
        this.len = len;
        this.h = h;

    }

    public void jump() {
        System.out.println("Собака прыгнула");
    }

    public void run() {
        System.out.println("Собака пробежала");
    }

}
