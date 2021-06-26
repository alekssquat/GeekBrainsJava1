public class Lesson2 {
    public static void main(String[] args) {

        System.out.println( CompareSum(5,4));
        System.out.println( CompareSum(5,5));
        System.out.println(CompareSum(10,10));
        System.out.println(CompareSum(10,11));

        AyeOrNay(-1);
        AyeOrNay(0);
        AyeOrNay(1);

        System.out.println(Reverse(-1));
        System.out.println(Reverse(0));
        System.out.println(Reverse(1));

        MonkeyBook("little monkey number ", 5);

        System.out.println(LeapYear(1));
        System.out.println(LeapYear(4));
        System.out.println(LeapYear(100));
        System.out.println(LeapYear(400));
        System.out.println(LeapYear(800));
        System.out.println(LeapYear(900));








    }

    public static boolean CompareSum(int a, int b){
        boolean c=(a+b)>=10 && (a+b)<=20;
        return c;

    }

    public static void AyeOrNay(int a){
        if(a<0){
            System.out.println("Отрицательное");
        }
        else
        System.out.println("Положительное");
    }

    public static boolean Reverse(int a){
    return a<0;}

    public static void MonkeyBook(String str, int a){
        String s=str;
        for(int i=1; i<=a; i++){
            System.out.println(s+i);
        }
    }
    public static boolean LeapYear(int year){
        if (year%400 == 0)
            return true;
        else if (year%100 == 0)
            return false;
        else if (year%4 == 0)
            return true;
        else
            return false;
    }


}
