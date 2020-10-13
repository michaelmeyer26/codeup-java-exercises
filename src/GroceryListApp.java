import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        ArrayList<HashMap> userList = new ArrayList<>();

        HashMap<String, Integer> baked = new HashMap<>();
        HashMap<String, Integer> dairy = new HashMap<>();
        HashMap<String, Integer> dry = new HashMap<>();
        HashMap<String, Integer> frozen = new HashMap<>();
        HashMap<String, Integer> meat = new HashMap<>();
        HashMap<String, Integer> produce = new HashMap<>();
        HashMap<String, Integer> other = new HashMap<>();

        userList.add(baked);
        userList.add(dairy);
        userList.add(dry);
        userList.add(frozen);
        userList.add(meat);
        userList.add(produce);
        userList.add(other);

        System.out.print("Would you like to create a grocery list? [y/n]\n> ");
        boolean wantCreateList = Input.yesNo();
        if(wantCreateList) {
            boolean addItem = true;
            do {
                System.out.println("Enter a category: ");
                System.out.print("baked - dairy - dry - frozen - meat - produce - other\n> ");
                Input.getString();
                int userCategory = userList.indexOf(Input.getString());
                System.out.print("Enter the name of the item:\n> ");
                String thisItem = Input.getString();
                System.out.print("Enter the amount you would like:\n> ");
                int numItems = Input.getInt();
                userList.get(userCategory).put(thisItem, numItems);
                System.out.print("Would you like to add another item? [y/n] (no finalizes and displays list)\n> ");
                addItem = Input.yesNo();
            } while(addItem);
            //TODO: Add another ArrayList that just adds on every single item the user adds, then use that to sort
            // alphabetically within the categories with &&. i.e. sort that list, then run through it once per
            // category and display the name and number if that category contains it. If using loop then probably need
            // another ArrayList that just lists out the categories, too. Bad solution but idk what else to do.
        }
    }

    public static void buildList() {

    }
}
