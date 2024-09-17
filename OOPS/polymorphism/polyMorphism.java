package OOPS.polymorphism;
// polymorphism => method overloading
class Person {
  public void son(){
    System.out.println("In son method");
  }

  public static void father(){
    System.out.println("In father method");
  }

  public void husband(){
    System.out.println("In husband method ");
  }

  public void employee(){
    System.out.println("I'm an employee in IT");
  }


}


public class polyMorphism {
    public static void main(String[] args) {
      
        Person obj = new Person();

        obj.son();
        obj.father();
        obj.husband();
        obj.employee();
    }
}
