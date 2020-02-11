
// a) Create a reference to an array
// b) Add elements to a list
// c) Add elements to the list in the middle
// d) Add elements to the list at the beginning
// e) Print the list
// f) Remove a specific item from the list
// g) Compute the size of the list
// h) Double the number of items the list can hold

import java.util.Arrays;

    public class arrayListHWreDo {

        int[] arr = new int[10];
        int i = 0;
        public void addEnd(int newElement) {
            arr[i] = newElement;
            i = i + 1;
        }

        public void addMiddle(int newElement) {
            int middle = i / 2; //represents middle
            int[] arr2 = new int[middle + 1]; //creating a new array, in which we will copy latter part of original
            for (int index = middle; index < i; index++) //copying latter part to a new array
                arr2[index - middle] = arr[index];
            arr[middle] = newElement;
            for(int index = middle + 1; index < i + 1; index++)
                arr[index] = arr2[index - middle - 1];
            i = i + 1;
        }

        public void addBeginning(int newElement) {
            int[] arr3 = new int[i];
            for (int index = 0; index < i; index++)//part 1, good job!
                arr3[index] = arr[index];

            arr[0] = newElement; //part 2

            for(int index = 1; index < i + 1);
                arr[index] = arr3[index - 1];
            i = i + 1;
        }



    }