
public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("Bitwise Operators in Java");
        System.out.println("-------------------------");
        int a = 173;
        int b = 212;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("Bitwise OR (|):");
        System.out.println("a | b = " + a + " | " + b + " = " + Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = "
                + Integer.toBinaryString(a | b) + " = " + (a | b));
        System.out.println("Bitwise AND (&):");
        System.out.println("a & b = " + a + " & " + b + " = " + Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = "
                + Integer.toBinaryString(a & b) + " = " + (a & b));
        System.out.println("Bitwise XOR (^):");
        System.out.println("a ^ b = " + a + " ^ " + b + " = " + Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = "
                + Integer.toBinaryString(a ^ b) + " = " + (a ^ b));
        System.out.println("Bitwise Complement (~):");
        System.out.println("~a = " + a + " =  ~ " + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(~a) + " = " +
                ~a);
        System.out.println("Signed Right shift operator (>>):");
        System.out.println("a >> 2 = " + a + " >> 2 = " + Integer.toBinaryString(a) + " >> 2 = " +
                Integer.toBinaryString(a >> 2) + " = " + (a >> 2));
        System.out.println("Unsigned Right shift operator (>>>):");
        System.out.println("a >>> 2 = " + a + " >>> 2 = " + Integer.toBinaryString(a) + " >>> 2 = " +
                Integer.toBinaryString(a >>> 2) + " = " + (a >>> 2));
        System.out.println("Signed Right shift operator (<<):");
        System.out.println("a << 2 = " + a + " << 2 = " + Integer.toBinaryString(a) + " << 2 = " +
                Integer.toBinaryString(a << 2) + " = " + (a << 2));
    }
}
