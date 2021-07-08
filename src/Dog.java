public class Dog extends Animal{

    private static int dogCounter;
    public Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        dogCounter++;
    }

    @Override
    void run(int distance) {
        if(distance>getRunLimit()){
            System.out.println("too far");
        }else {
            System.out.println(getName()+" ran "+distance+" m!");
        }
    }

    @Override
    void swim(int distance) {
        if(distance>getSwimLimit()){
            System.out.println("too far");
        }else if(distance<0){
            System.out.println("Not this time Marty");
        }else{
            System.out.println(getName()+" swam "+distance+" m!");
        }

    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
