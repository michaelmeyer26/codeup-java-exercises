public class ControlFlowExercises {
    public static void main (String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        int a = 0;
        do {
            a +=2;
            System.out.println(a);
        } while (a < 100);
    }
}
