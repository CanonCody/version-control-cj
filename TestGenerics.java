public class TestGenerics {
    public static void main(String[] args) {
        MyFirstObject myObj1 = new MyFirstObject();
        MySecondObject myObj2 = new MySecondObject();
        MyGenerics mg = new MyGenerics();
        Integer[] array = {2,4,6,8};
        String[] array2 = {"a", "b", "c", "d"};

        System.out.println( mg.partOne(array, array.length, 6) );
        System.out.println( mg.partOne(array2, array2.length, "a") );

        System.out.println( mg.partTwo(myObj1, myObj2) );
    }
}