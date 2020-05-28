package com.company;

public class Main {

    public static void main(String[] args) {
        Object[] Uchastniki = new Object[3];
        Object[] Prepyatstviya = new Object[5];
        Uchastniki[0] = new Cat("Barsik", 10, 1);
        Uchastniki[1] = new Man("Ivan", 100, 2);
        Uchastniki[2] = new Man("Issi", 200, 1);

        Prepyatstviya[0] = new Road(5);
        Prepyatstviya[1] = new Wall(1);
        Prepyatstviya[2] = new Road(50);
        Prepyatstviya[3] = new Wall(2);
        Prepyatstviya[4] = new Road(150);



    }

}
