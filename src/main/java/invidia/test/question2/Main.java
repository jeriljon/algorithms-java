package invidia.test.question2;

// Question: Output will be
// Choice: false, true, true
// Equality of objects and string in particular

public class Main {

    public static void main(String[] args) {
        String a = "string";
        String b = new String("string");
        String c = a;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b.equals(c));

    }
}
