package methodAndObject;

class Teacher{
    String name;
    long salary;

    //method
    public void teacherInfo(){
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(" 'teacherInfo' method called successfully...");
    }

    //non parameterised constructor
    // Teacher(){
    //     System.out.println("The 'non-parameterised' constructor called.");
    // }


    //Parameterised constructor
    Teacher(String NAME, long SALARY){

        this.name = NAME;
        this.salary = SALARY;
        System.out.println("The 'Parameterised' constructor called.");
    }

}

public class constructor {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sky", 90000);

        // t1.name = "sky";
        // t1.salary = 90000;

        t1.teacherInfo();
    }
}
