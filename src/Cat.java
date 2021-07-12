public class Cat extends Animal{

    private static int counter;

    public Cat (String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        counter++;
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

    public static int getCounter() {
        return counter;
    }
}
