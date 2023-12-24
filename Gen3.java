public class Gen3 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]); 
        int min, max; 
        min = Math.min(a,b);
        max = Math.max(a,b); 
        

            int rand1 = (int)((Math.random()*(max-min+1)+min));
            System.out.println(rand1);
            int rand2 = (int)((Math.random()*(max-min+1)+min));
            System.out.println(rand2);
            int rand3 = (int)((Math.random()*(max-min+1)+min));
            System.out.println(rand3);

            int min2 = Math.min(rand1,rand2);
            int min3 = Math.min(min2,rand3);
            System.out.println("The minimal generated number was " + min2);

   }
}
