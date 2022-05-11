/********************
 Cody Jones
 COP 2805C
 January 25, 2021
 Generics Project
 ********************/

public class MyGenerics {

    //Part one of assignment
    public <T> //Removed extends comparable<T>
    Integer partOne(T[] item1, int item2, T item3) {
        Integer position = null;

        for (int i = 0; i < item2; i++) {
            if (item1[i] == item3) { // Changed from item1[i].compareTo(item3) == 0
                position = i;
            }
        }
        return position;
    }

    //Part two of assignment
    public <T extends GreaterThan>
    Object partTwo(T ObjectOne, T ObjectTwo) {
        if (ObjectOne.value() > ObjectTwo.value()) {
            return ObjectOne;
        }
        return ObjectTwo;
    }

}
