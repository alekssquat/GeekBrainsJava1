public class Cat extends Animal{

    private static int catCounter;
    public Cat (String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        catCounter++;
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
        if(distance>=getSwimLimit()){
            System.out.println("not a seal, human");
        }else if(distance<0){
            System.out.println("Not this time Marty");
        }else{
            System.out.println(getName()+" swam "+distance+" m!");
        }

    }

    public static int getCatCounter() {
        return catCounter;
    }
}
