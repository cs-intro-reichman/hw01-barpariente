public class Coins {
    public static void main(String[] args) {

        int Sumcent = Integer.parseInt(args[0]);
        
        /*
            #Feedback:
            Better to not do any calculation during non-related command.
            Here you calculate the quarters and remainders when you want to log it out to the user.
            Using variable for these calculation give you both:
            1. Clear name that explain the essence.
            2. The results can be reused in future to another purpose.
            Remember that code should be understandable by humans as well.
        */
        System.out.println("Use " + (Sumcent/25) + " quarters and " + (Sumcent%25) + " cents");
    }
}
