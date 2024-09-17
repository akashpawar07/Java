package Strings;

public class ex1 {
    public static void main(String[] args) {
        String fname = "Akash";
        String sname = "Pawar";
        String fullName = fname +" "+ sname;

        System.out.println("length of String is : " +fname.length());
        System.out.println(fname.compareTo(sname));

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}


// length() - returns the full length of given string.
// compareTo() - comares with second value
// charAt() - retuns all enduvidual characters of a string 