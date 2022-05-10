package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        int length = str.length();
        System.out.println("the length of string is: " + str);

        String str2 = "hello";
        boolean equal = str.equalsIgnoreCase(str2);
        System.out.println("str and str2 is equal: " + equal);

        String concat = str.concat(str2);
        System.out.println("concatenate str & str2: " + concat);

        String replace = str.replace('!','?');
        System.out.println("the new string is: " + replace);

        String sub = str.substring(1,4);
        System.out.println("the substring is: " + sub);

        Boolean contain = str.contains("ll");
        System.out.println("Is str contain ll: " + contain);

        System.out.println("the index of str of ello: " + str.indexOf("ello"));


    }


}