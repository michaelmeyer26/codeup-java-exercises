public class ControlFlowExercises {
    public static void main (String[] args) {
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (long a = 2; a < 1000000; a = a * a) {
            System.out.println(a);
        }

    }
}
