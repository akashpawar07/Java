package OOPS.inheritance;

class Person {
    public String names ;
    
    void setName(String name){
        this.names = name;
    }
    void showParent(){
        System.out.println(" Parent of Son class ");
    }
}

class Son extends Person {
    void showData(){
        System.out.println("This is Son which inheritace from Parents");
    }
}
public class single_inhertance {
    public static void main(String[] args) {
         Son obj = new Son();

        obj.setName("Akash Pawar");
        obj.showParent();
        obj.showData();
    }
}
