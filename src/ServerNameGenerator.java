public class ServerNameGenerator {
    private static String[] adjectives = {"abrupt", "noxious", "uninterested", "immense", "ablaze", "dashing", "best", "gentle", "colorful"};
    private static String[] nouns = {"buyer", "week", "river", "crab", "alligator", "crabigator", "refrigerator", "alcohol", "chocolate", "highway"};

    public static void main(String[] args) {
        String firstElement = getElement(adjectives);
        String secondElement = getElement(nouns);
        System.out.printf("Here is your dedicated server name:\n%s-%s", firstElement, secondElement);
    }

    public static String getElement(String[] elements) {
        int randomElement = (int) (Math.random() * elements.length);
        return elements[randomElement];
    }
}
