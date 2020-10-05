public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 666;
        dish1.nameOfDish = "Seitan Philly Cheesesteak";
        dish1.wouldRecommend = true;

        dish1.printSummary();
    }
}
