package lab_2_10_1;

public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");

        System.out.println("x1==x2 - "+(x1==x2));
        System.out.println("x1.equals(x2) - "+(x1.equals(x2)));
        System.out.println("x1==x4 - "+(x1==x4));
        System.out.println("x1.equals(x4) - "+(x1.equals(x4)));
        System.out.println("x1==x5 - "+(x1==x5));
        System.out.println("x1.equals(x5) - "+(x1.equals(x5)));
        System.out.println("x2==x4 - "+(x2==x4));
        System.out.println("x2.equals(x4) - "+(x2.equals(x4)));
        System.out.println("x2==x5 - "+(x2==x5));
        System.out.println("x2.equals(x5) - "+(x2.equals(x5)));
        System.out.println("x4==x5 = "+(x4==x5));
        System.out.println("x4.equals(x5) - "+(x4.equals(x5)));

        System.out.println("-------------------------------------");
        x1 = 1000;
        x2 = new Integer(1000);
        x4 = Integer.valueOf(1000);
        x5 = Integer.parseInt("1000");

        System.out.println("x1==x2 - "+(x1==x2));
        System.out.println("x1.equals(x2) - "+(x1.equals(x2)));
        System.out.println("x1==x4 - "+(x1==x4));
        System.out.println("x1.equals(x4) - "+(x1.equals(x4)));
        System.out.println("x1==x5 - "+(x1==x5));
        System.out.println("x1.equals(x5) - "+(x1.equals(x5)));
        System.out.println("x2==x4 - "+(x2==x4));
        System.out.println("x2.equals(x4) - "+(x2.equals(x4)));
        System.out.println("x2==x5 - "+(x2==x5));
        System.out.println("x2.equals(x5) - "+(x2.equals(x5)));
        System.out.println("x4==x5 = "+(x4==x5));
        System.out.println("x4.equals(x5) - "+(x4.equals(x5)));
    }
}
