package Lesson7;

public class Plate {
    private int food;
    private int capacity;
    public Plate(int capacity, int food) {
        this.food = food;
        this.capacity = capacity;
    }
    public void decreaseFood(int n) {
        if(food-n>=0){
            food-=n;
        }else System.out.println("not enough");
    }

    public void fillThePlate(int n){
        if((food+n)<=capacity){
            food+=n;
        }else System.out.println("too much");
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
}
