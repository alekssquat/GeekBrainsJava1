package Lesson7;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(50,40);
        Cat[]pack=new Cat[5];
        Random r=new Random();

        for (int i = 0; i < pack.length; i++) {
            pack[i]=new Cat("Barsik"+i,r.nextInt(10)); //создали котика
            pack[i].eat(plate);  //покормили котика
            System.out.print("Total food - ");
            plate.info();//проверили остаток еды
            if(!(pack[i].getIsFull())){
                plate.fillThePlate(r.nextInt(20));
                pack[i].eat(plate);
            }   //если котик не поел, пополняем случайным количеством еды (небольше вместимости тарелки) и кормим повторно
        }
        for (Cat c:pack) {
            System.out.println(c.getName()+" naelsya?\n"+(c.getIsFull()?"Aga":"Nea"));
        } //выводим статус котика

    }
}
