package Strings;

public class findLongestString {
    public static void main(String[] args) {
        String str = "Jva, JavaScript, React";
        String[] words = str.split(", ");
        String longest = " ";

        for (String s : words) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println(longest);
    }

}
