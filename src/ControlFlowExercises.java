public class ControlFlowExercises {
    public static void main (String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        long a = 2;
        do {
            System.out.println(a);
            a = a * a;
        } while (a < 1000000);

    }
}
