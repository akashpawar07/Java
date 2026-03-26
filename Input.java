import java.util.*;

class Input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // " { 1, 2, 3, 4, 5, 6, 7, 8, 9 } "
        String str = sc.nextLine();

        //  ["1,2,3,4,5,6,7"]
        if(str.startsWith("{") && str.endsWith("}")){
            str = str.substring(1, str.length()-1);
        }

        // ['1','2','3','4','5','6','7','8','9']
        String nums[] = str.split(", ");
        ArrayList<Integer> list = new ArrayList<>();

        for(String num : nums){
            list.add(Integer.parseInt(num));
        }

        for(int elem : list){
            System.out.println(elem+" ");
        }


        // // take user input "1 2 3 4"
        // String input = sc.nextLine();

        // // convert string input into string array
        // String[] charArrayOfString = input.split(" ");  // ["1", "2", "3", "4"]

        // //declare array and its size 
        // int[] arr = new int[charArrayOfString.length];   // we just declare the size of an array not value its completely empty

        // for(int i=0; i<arr.length; i++){
        //     arr[i] = Integer.parseInt(charArrayOfString[i]);
        //     System.out.print(arr[i]+ " ");
        // }

    }
}

