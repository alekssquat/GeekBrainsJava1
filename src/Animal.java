public abstract class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;
    private static int animalCounter;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name=name;
        this.runLimit=runLimit;
        this.swimLimit=swimLimit;
        animalCounter++;
    }
    Animal(){
        animalCounter++;
    }


    abstract void run(int distance);
    abstract void swim(int distance);


    public String getName(){
        return name;
    }


    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}
