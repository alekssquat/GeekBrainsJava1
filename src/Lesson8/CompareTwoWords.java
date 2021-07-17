package Lesson8;

import java.util.Scanner;

public class CompareTwoWords {
    Scanner scanner=new Scanner(System.in);
    String answer;
    CompareTwoWords(String random){
        answer=random;
        compare();
    }

    private boolean compare(){
        char arrToTerminal[]= new char[15];
        for (int i = 0; i < arrToTerminal.length; i++) {
            arrToTerminal[i]='#';
        }
        char arrAnswer[]=answer.toCharArray();

        while(true){

            System.out.println(arrToTerminal);
            String user=scanner.nextLine().toLowerCase();
            if(answer.equalsIgnoreCase(user)){
                System.out.println("WellDone");
                return true;
                }else {
                   char arrUser[]=user.toCharArray();
                   for (int i = 0; i < arrUser.length; i++) {
                       if(arrUser.length> arrAnswer.length){
                           System.out.println("Слишком много букв");
                           break;
                       }else {
                           if(arrUser[i]==arrAnswer[i]){
                               arrToTerminal[i]=arrAnswer[i];
                           }
                       }
                   }


                }
        }
    }


}
