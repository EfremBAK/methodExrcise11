import java.util.Scanner;
  /*
  methods exercise

  Take integer input from the user, output whether it's odd or even.

   */


public class methodExercise {
    public static void main(String[] args) {
        boolean agn = true;
        Scanner in = new Scanner(System.in);
        while (agn) {

            int userNo;
            String reply;

            //Scanner re = new Scanner(System.in);

            System.out.println("please enter the number you want to check:  ");
            userNo = in.nextInt();
            String ans = evenOrOdd(userNo);
            System.out.println(ans);


            System.out.println(" do you want to try again? y/n");
            reply = in.next();
            if (reply.equalsIgnoreCase("n"))
                agn = false;

        }
    }

    public static String evenOrOdd(int userNo) {
        String even = "It is an even number";
        String odd = "It is an odd number";

        if (userNo % 2 == 0)

            return even;
        else
            return odd;
    }
}
