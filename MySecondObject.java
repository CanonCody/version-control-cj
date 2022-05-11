/********************
 Cody Jones
 COP 2805C
 January 25, 2021
 Generics Project
 ********************/

public class MySecondObject implements GreaterThan {

    private int value;

    public  MySecondObject() {
        setValue(valueIs());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int value() {
        return getValue();
    }

    public int valueIs() {
        return 5;
    }

    @Override
    public String toString() {
        return "MySecondObject with value of: " + value;
    }


}
