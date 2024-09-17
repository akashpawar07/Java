package methodAndObject; 


// user defined Student class
class Student {
    // data members......

    String name;
    String rollno;
    String dept;

    public void studentInfo(){ // This is METHOD under the class student 
        System.out.println("this is student");
    }
    public void info(){
        System.out.println(this.name);
        System.out.println(this.dept);
    }
}

public class ex1 {

    public static void main(String[] args) {
       
        Student s1 = new Student();
        // Student s2 = new Student();
        
        s1.name = "Akash";
        s1.rollno = "3620";
        s1.dept = "CSE";

        s1.studentInfo();
        s1.info();
    }
}
