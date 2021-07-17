package Lesson7;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(50,10);
        Cat[]pack=new Cat[5];
        Random r=new Random();

        for (int i = 0; i < pack.length; i++) {
            pack[i]=new Cat("Barsik"+i,r.nextInt(10)); //массив котов
            }

        for (Cat c:pack) {
            System.out.println(c.getName()+" idet k miske");
            c.eat(plate); // кормим
        }

        for (Cat c:pack) {
            System.out.println(c.getName()+" naelsya?\n"+(c.getIsFull()?"Aga":"Nea"));
            if(!(c.getIsFull())){c.eat(plate);}
        } //выводим статус котик, если он голоден кормим

        for (Cat c:pack) {
            System.out.println(c.getName()+" teper' naelsya?\n"+(c.getIsFull()?"Aga":"Nea"));
        }

    }
}
