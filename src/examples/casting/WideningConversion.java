package examples.casting;

public class WideningConversion {
    public static void main (String[] args){
        int i = 100;
        long l = i;
        float f = l;
        double x = f;
        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("float value " + f);
        System.out.println("double value " + x);
    }

}
