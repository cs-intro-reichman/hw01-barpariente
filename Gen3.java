public class Gen3 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int min, max; 
        if ( a > b) {

            min = b;
            max = a; 
        }
        else {

            min = a; 
            max = b;
        }

        for (int i = 0; i < 3; i++) {

            int rand = (int)((Math.random()*(max-min)+min));
            System.out.println(rand);
        }

            System.out.println("The minimal generated number was " + min);
        }

    }