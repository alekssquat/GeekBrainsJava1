public class Lesson2 {
    public static void main(String[] args) {

        CompareSum(5,4);
        CompareSum(5,5);
        CompareSum(10,10);
        CompareSum(10,11);

        AyeOrNay(-1);
        AyeOrNay(0);
        AyeOrNay(1);

        Reverse(-1);
        Reverse(0);
        Reverse(1);

        MonkeyBook("little monkey number ", 5);

        LeapYear(1);
        LeapYear(4);
        LeapYear(100);
        LeapYear(400);
        LeapYear(800);
        LeapYear(900);


    }

    public static void CompareSum(int a, int b){
        boolean c=(a+b)>=10 && (a+b)<=20;
        System.out.println(c);
    }

    public static void AyeOrNay(int a){
        if(a<0){
            System.out.println("Отрицательное");
        }
        else
        System.out.println("Положительное");
    }

    public static void Reverse(int a){
        System.out.println(a<0);
    }

    public static void MonkeyBook(String str, int a){
        String s=str;
        for(int i=1; i<=a; i++){
            System.out.println(s+i);
        }
    }
    public static void LeapYear(int year){
        if (year%400 == 0)
            System.out.println("Високонсный");
        else if (year%100 == 0)
            System.out.println("Не високонсный");
        else if (year%4 == 0)
            System.out.println("Високонсный");
        else
            System.out.println("Не високонсный");
    }


}
