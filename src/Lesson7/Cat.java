package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull=false;
    }
    public void eat(Plate p) {
        int foodBefore=p.getFood();
        p.decreaseFood(appetite);
        int foodAfter=p.getFood();//проверяем поел ли кот
        if(foodBefore>foodAfter){
            isFull=true;
        }else {
            p.fillThePlate(p.getCapacity()-p.getFood()); //если нет поплняем миску до предела
        }

    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
    public boolean getIsFull(){
        return isFull;
    }
}
