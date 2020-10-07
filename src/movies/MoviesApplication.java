package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movieArray = MoviesArray.findAll();
        int userOption = -1;
        do {
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the musical category");
            System.out.println("6 - view movies in the scifi category");
            System.out.print("\nEnter your choice: ");
            userOption = Input.getInt();

            if(userOption != 0) {
                String displayCategory = "";
                switch (userOption) {
                    case 1:
                        break;
                    case 2:
                        displayCategory = "animated";
                        break;
                    case 3:
                        displayCategory = "drama";
                        break;
                    case 4:
                        displayCategory = "horror";
                        break;
                    case 5:
                        displayCategory = "musical";
                        break;
                    case 6:
                        displayCategory = "scifi";
                        break;
                }
                System.out.println();
                System.out.println("*---------------------------------------------------*");
                System.out.println();
                for( Movie thisMovie : movieArray) {
                    if (thisMovie.getCategory().contains(displayCategory)) {
                        System.out.printf("%s -- %s\n", thisMovie.getName(), thisMovie.getCategory());
                    }
                }
                System.out.println();
                System.out.println("*---------------------------------------------------*");
                System.out.println();
            }
        } while (userOption != 0);
    }

    public static void addMovie() {

    }


}
