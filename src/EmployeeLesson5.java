public class EmployeeLesson5 {
    String name;
    String position;
    String email;
    String phoneNumber ;
    int salary;
    int age;

    EmployeeLesson5(String name,String position,String email,String phoneNumber,int salary,int age){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }



    @Override
    public String toString() {
        return
                "===\n"+
                "name        " + name +
                "\nposition    " + position +
                "\nemail       " + email +
                "\nphoneNumber " + phoneNumber +
                "\nsalary      " + salary +
                "\nage         " + age + "\n"+
                "===\n";
    }
}
