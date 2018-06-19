package lab_2_10_2;

public class Main {
    public static Long compute(Byte b, Integer i){
        return (long) (b + i);
    }

    public static void main(String[] args) {
        Byte b = 47;
        Integer i = 2345;
        System.out.println(compute(b,i));
    }
}
