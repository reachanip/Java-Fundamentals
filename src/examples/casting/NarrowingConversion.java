package examples.casting;

public class NarrowingConversion {
    public static void main(String[] args) {
        double x = 10.23;
        System.out.println("x " + x);
        int z = (int) x;
        System.out.println("z " + z);
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println("long value " + l);
        System.out.println("Int value " + i);
    }
}
