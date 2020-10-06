public class Dish {
    public static int costInCents;
    public static String nameOfDish;
    public static boolean wouldRecommend;

    public static void printSummary() {
        System.out.printf("Cost: %d\nName: %s\nRecommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
}
