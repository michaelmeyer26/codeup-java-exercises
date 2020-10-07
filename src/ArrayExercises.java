import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        Person[] personArray = new Person[3];
        personArray[0] = new Person("Brandun");
        personArray[1] = new Person("Brandy");
        personArray[2] = new Person("Thomas");
        Person john = new Person("John");

        Person[] newPersonArray = addPerson(personArray, john);
        System.out.println(Arrays.toString(newPersonArray));
    }

    public static Person[] addPerson(Person[] personArray, Person person) {
        Person newPersonArray[] = new Person[personArray.length + 1];
        for (int i = 0; i < personArray.length; i++) {
            newPersonArray[i] = personArray[i];
        }
        newPersonArray[newPersonArray.length - 1] = person;
        return newPersonArray;
    }
}
