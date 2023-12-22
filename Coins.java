public class Coins {
    public static void main(String[] args) {

        int Sumcent = Integer.parseInt(args[0]);
        
        
        System.out.println("use " + (Sumcent/25) + " quarters and " + (Sumcent%25) + " cents");
    }
}