public class Lesson6 {
    public static void main(String[] args) {

        Dog bob=new Dog("Bob",150,50);
        bob.run(150);
        bob.run(151);
        bob.swim(50);
        bob.swim(51);

        Cat tom=new Cat("Tom", 50,0);
        tom.run(50);
        tom.run(51);
        tom.swim(0);
        tom.swim(1);
        tom.swim(-1);

        System.out.println("Total number of animals - ");
        System.out.println("animal - "+Animal.getCounter());
        System.out.println("cat - "+Cat.getCounter());
        System.out.println("dog - "+Dog.getCounter());

    }
}
