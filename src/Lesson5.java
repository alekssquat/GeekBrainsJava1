public class Lesson5 {
    public static void main(String[] args) {

        EmployeeLesson5[]staff5=new EmployeeLesson5[5];

        EmployeeLesson5 bori=new EmployeeLesson5("Борис Иванович","один","один","один",1,0);
        EmployeeLesson5 ivan=new EmployeeLesson5("Иван Васильевич","два","два","два",2,41);
        EmployeeLesson5 vasi=new EmployeeLesson5("Василий Евгеньевич","три","три","три",3,39);
        EmployeeLesson5 evge=new EmployeeLesson5("Евгения Александровна","четыре","четыре","четыре",4,-2);
        EmployeeLesson5 alex=new EmployeeLesson5("Александра Борисовна","пять","пять","пять",5,40);

        staff5[0]=bori;
        staff5[1]=ivan;
        staff5[2]=vasi;
        staff5[3]=evge;
        staff5[4]=alex;

        for (EmployeeLesson5 x : staff5) {
            if(x.age>=40) System.out.println(x);
        }

    }
}
