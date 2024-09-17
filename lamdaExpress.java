interface Calcy{

    int add(int i, int j);
}

public class lamdaExpress {
    public static void main(String[] args) {
        
        Calcy obj = (i ,j) -> i+j;

        int result = obj.add(7, 7);
        System.out.println(result);
    }
}
