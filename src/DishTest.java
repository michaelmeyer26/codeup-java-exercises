public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 666;
        dish1.nameOfDish = "Seitan Philly Cheesesteak";
        dish1.wouldRecommend = true;

        dish1.printSummary();
        System.out.println();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
        System.out.println(dish1.wouldRecommend);
    }
}
