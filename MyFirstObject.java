/********************
 Cody Jones
 COP 2805C
 January 25, 2021
 Generics Project
 ********************/

public class MyFirstObject implements GreaterThan{

    private int value;

    public MyFirstObject() {
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

    private int valueIs() {
        return 10;
    }

    @Override
    public String toString() {
        return "MyFirstObject with value of: " + value;
    }


}
