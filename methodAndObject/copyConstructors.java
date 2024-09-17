package methodAndObject;

class Student{
    //data member
    String name;
    int age;

    //method members
    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("The method 'studentInfo' is called...");
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){}
}


public class copyConstructors {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Akash";
        s1.age = 23;

        Student s2 = new Student(s1);
        s2.studentInfo();
    }
}
