public class LinearEq {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        double x = ((double)(c-b))/(a); 

        System.out.println((double)(a) + " * X + " + (double)(b) + " = " + (double)(c));
        System.out.println("X = " + x);
    }
}