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
        p.decreaseFood(appetite);
        isFull=true;
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
