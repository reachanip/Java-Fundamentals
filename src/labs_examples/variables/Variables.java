package labs_examples.variables;

public class Variables {
   static double val = 123.45;
    public static void main(String[] args){
        Person myPerson = new Person("Rayan", 35);
        Person yourPerson = new Person("someCoolName", 39);
        Person einstien = new Person("Einstein", 110);
        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstien.toString());
      // double x =  multiply(val,val * 2);
    }
    public static double multiply(double a, double b){
       double result = a * b;
        printNum(result);
        return result;
    }
    public static void printNum(double numToPrint){
        System.out.println(numToPrint);
        System.out.println(val);
    }
}
