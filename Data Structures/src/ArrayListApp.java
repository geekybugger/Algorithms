import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Adding numbers
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(10000);
        numbers.add(100000);

        // Showing the array --> Initial
        System.out.println(numbers);

        //Retrieving
        System.out.println(numbers.get(0));

        //Indexed for loop
        System.out.println("Indexing #1 : ");
        for (int i =0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        // Both indexing are same however
        System.out.println("Indexing #2 : ");
        for(Integer value : numbers){
            System.out.println(value);
        }

        //Removing
        /* As removing a number from a array is very complex and time consuming .. it is not the preferred way.
         * So Linked List becomes the next best option for removing numbers from a list.
         */
        numbers.remove(numbers.size() - 1);
        System.out.println("Array after removal of last digit: ");
        System.out.println(numbers);
    }
}
