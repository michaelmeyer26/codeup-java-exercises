public class ControlFlowExercises {
    public static void main (String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (long a = 2; a < 1000000; a = a * a) {
            System.out.println(a);
        }


        //FizzBuzz
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0 & j % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (j % 3 == 0) {
                System.out.println("Fizz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(j);
            }
        }


    }
}
