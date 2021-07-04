import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {

        Arr1();
        System.out.println("\n");
        Arr2();
        System.out.println("\n");
        Arr3();
        System.out.println("\n");
        Arr4();
        System.out.println("\n");
        System.out.println(Arrays.toString(Arr5(5,8)));
        System.out.println("\n");
        Arr6(4, 6);
        System.out.println("\n");
        System.out.println(Arr7(7,3));
        System.out.println("\n");
        Arr8(new int[]{1,2,3,4,5,6},-10);


    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void Arr1(){
        int[] arr = { 1, 0, 1, 0, 0, 1 };

        for (int i = 0; i < arr.length; i++){
            if(arr[i]==0)
                arr[i]=1;
            else
                arr[i]=0;
        }

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void Arr2(){
        int[] arr = new int[100];
        for(int i=0; i< arr.length;i++){
            arr[i]=i+1;
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void Arr3(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i< arr.length;i++){
            if(arr[i]<6){                                       //числа меньшие 6 (принимаем строгое неравенство)
                arr[i]*=2;
            }
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void Arr4(){

        int[][] arr = new int[3][3];
        int counter=1;
        //int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j)
                    arr[i][j]=0;
                else if(i-j==1)
                    arr[i][j]=1;
                else if(i-j==-1)
                    arr[i][j]=2;
                else
                    arr[i][j]=counter;
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] Arr5(int len, int initialValue){
        int[]arr=new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=initialValue;
        }
        return arr;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    // length - длинна массива
    // bound - граница значений ячеек

    public static int[] Arr6(int length, int bound){

        int[] arr= getArray(length,bound);

        System.out.println(Arrays.toString(arr));

        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
                min=arr[i];
            if (max<arr[i])
                max=arr[i];
        }
        System.out.printf("MIN - %d MAX - %d", min, max);
        return arr;
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

    public static boolean Arr7(int length, int bound){

        int[]arr=getArray(length, bound);
        int[]arr1= new int[length/2];
        int[]arr2= new int[length/2+1];
        int sumL=0;
        int sumR=0;
        boolean result=false;

        //разбиваем на два массива

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i< arr.length/2){
                arr1[i]=arr[i];
            }else{
                arr2[i-arr.length/2]=arr[i];
            }
        }

        //вычисляем суммы ячеек

        for (int x: arr1) { sumL+=x;}
        for (int x: arr2) { sumR+=x;}
        System.out.printf("left - %d right - %d\n", sumL, sumR);

        //проводим проверку

        if(sumL==sumR){
            result=true;
        }else if(sumL>sumR){
            for (int i = arr1.length-1; i > 0; i--) {
                sumL-=arr1[i];
                sumR+=arr1[i];
                if(sumL<sumR){
                    break;
                } else if (sumL==sumR){
                    result=true;
                    break;
                }
            }
        }else {
            for (int i = 0; i < arr2.length; i++) {
                sumR-=arr2[i];
                sumL+=arr2[i];
                if(sumL>sumR){
                    break;
                }else if(sumL==sumR){
                    result=true;
                    break;
                }
            }
        }

        System.out.printf("left - %d right - %d\n", sumL, sumR);

        return result;
    }

    //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.


    //Логика и алгоритм решения были подсмотренны, код написан самостоятельно

    public static void Arr8(int[]arr, int n){

        //если значение n больше длинны массива оптимизируем через деление по модулю

        System.out.println(Arrays.toString(arr));
        if(n!=0){
            int shift;
            if(n> arr.length){
                n=Math.abs(n%arr.length);
            }else shift=n;
        }

        //при n слева на право
        //при -n справо на лево

        if (n>0){
            for (int i = 0; i < n; i++) {
                int buffer=arr[0];
                arr[0]=arr[arr.length-1];

                for (int j=1;j< arr.length-1;j++){
                    arr[arr.length-j]=arr[arr.length-j-1];
                }
                arr[1]=buffer;
            }
        }else if(n<0){
            for (int i = 0; i > n ; i--) {
                int buffer = arr[arr.length-1];
                arr[arr.length-1]=arr[0];

                for (int j = 1; j < arr.length-1 ; j++) {
                    arr[j-1]=arr[j];
                }

                arr[arr.length-2]=buffer;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод для создания рэндомного массива

    public static int[] getArray(int length, int bound){
        int[] arr= new int[length];

        Random x;
        for (int i = 0; i < arr.length; i++) {
            x=new Random();
            arr[i]= x.nextInt(bound);
        }
        return arr;
    }

}


