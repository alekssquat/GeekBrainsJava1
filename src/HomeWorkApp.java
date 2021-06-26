public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-2);
        checkSumSign(3);
        checkSumSign(0);
        printColor(-1);
        printColor(0);
        printColor(14);
        printColor(100);
        printColor(148);
        compareNumbers(1, 1);
        compareNumbers(1, 2);
        compareNumbers(2, 1);
    }

    public static void printThreeWords(){
        System.out.print(" _Orange \n _ Banana \n _ Apple \n");
    }

    public static void checkSumSign(int b){
        int a=0;
        int c=a+b;
        if(c>=0)
            System.out.println("Сумма положительная " + c);
        else System.out.println("Сумма отрицательная " + c);

    }
    public static void printColor(int value){

        if (value <= 0)
            System.out.println("red - " + value);
        else if (value > 0 && value <= 100)
            System.out.println("yellow - " + value);
        else
            System.out.println("green - " + value);
    }

    public static void compareNumbers(int a, int b){
        if(a>=b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }

}

/*
 public static void main(String[] args) {
        CheckBoundaries(3,7);
        CheckBoundaries(3,6);
        CheckBoundaries(10,10);
        CheckBoundaries(11,10);

        AyeOrNay(1);
        AyeOrNay(0);
        AyeOrNay(-1);

        Reverse(1);
        Reverse(0);
        Reverse(-1);

        MonkeyBook("little monkey", 5);

    }
    public static void CheckBoundaries(int a, int b){
        int c=a+b;
        if(c>=10 && c<=20)
            System.out.print("In Vino ");
        else
            System.out.println("Veritas!");
    }



    public static void AyeOrNay(int a){
        if(a>=0)
            System.out.println("positive");
        else
            System.out.println("negative");
    }

    public static void Reverse(int a){
        System.out.println(!(a>=0));
    }

    public static void MonkeyBook(String str, int a){
        String s=str;
        for(int i=1; i==a; i++){

            System.out.println(i+s);
        }
        System.out.println(s);
    }
 */


