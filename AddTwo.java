public class AddTwo {
    public static void main(String[] args) {

        /*
            #Feedback:
            Names of parameters are really important to make their essence more understable.
            In addition 'i' is likely to known as itterating variable which is not the case here.
            Please pay attention that not only the computer should understand your code,
            bad names can confuse people to understand it.
        */
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        /*
            #Feedback:
            Better to not do any calculation during non-related command.
            Here you calculate the sum when you want to log it out to the user.
            Using variable for the sum will give you both:
            1. Clear name that explain the essence.
            2. The sum result can be reused in future to another purpose.
        */
        int sum = num1 + num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
