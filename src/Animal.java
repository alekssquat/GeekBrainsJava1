public abstract class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;
    private static int counter;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name=name;
        this.runLimit=runLimit;
        this.swimLimit=swimLimit;
        counter++;
    }
    Animal(){
       counter++;
    }


    protected void run(int distance){
        if(distance>getRunLimit()){
            System.out.println("too far");
        }else {
            System.out.println(getName()+" ran "+distance+" m!");
        }
    }

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

    public static int getCounter(){ return counter;}

}
