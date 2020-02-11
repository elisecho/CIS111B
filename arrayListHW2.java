// a) Create a reference to an array
// b) Add elements to a list
// c) Add elements to the list in the middle
// d) Add elements to the list at the beginning
// e) Print the list
// f) Remove a specific item from the list
// g) Compute the size of the list
// h) Double the number of items the list can hold

import java.util.ArrayList;

public class arrayListHW2 {

    //Main Method
    public static void main(String [] args) {
        // a) Create a reference to an ArrayList
        ArrayList<String> carMakes = new ArrayList<String>();
        // b) Add elements to a list
        carMakes.add("Toyota");
        carMakes.add("Mazda");
        carMakes.add("Honda");
        carMakes.add("Ford");
        // c) Add elements to the list in the middle
        carMakes.add(2, "Jeep");
        carMakes.add(3, "Subaru");
        // d) Add elements to the list at the beginning
        carMakes.add(0, "BMW");
        carMakes.add(0, "Acura");
        // e) Print the list
        for (int i = 0; i < carMakes.size(); i++) {
            System.out.println("Index: " + i + " Car: " + carMakes.get(i));
        }
        // f) Remove a specific item from the list
        carMakes.remove(5);
        System.out.println("After removing an item, here is our list: ");
        for (int i = 0; i < carMakes.size(); i++) {
            System.out.println("Index: " + i + " Car: " + carMakes.get(i));
        }
        // g) Compute the size of the list
            System.out.println("This list has " + carMakes.size() + " car brands stored in it." );

        // h) Double the number of items the list can hold
//        Here, I used .ensureCapacity() method, but you could also double at the start of the ArrayList, or you could
//        automatically increase the size by adding more objects.
        carMakes.ensureCapacity(20);
    }

}
