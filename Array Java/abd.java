public class abd {

    public static void main(String[] args) {

        String marks[][] = {
                { "akash", "rahul", "ram" },
                { "radhe", "krishn", "ramesh" },
                { "vitthal,", "aditya", "sandip" }
        };

        for (String[] row : marks) {
            for (String stdMarks : row){
                System.out.print(stdMarks + " ");
            }
            System.out.println("");
               
        }

    }
}
