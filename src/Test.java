import java.util.ArrayList;
import java.util.List;

public class Test {


    public static int value = 1;

    public static void incrValue() {
        System.out.println("Updated value: " + value++);
    }

    public static void main(String args[]) {

        for (int i=0;i<10;i++) {
            incrValue();
        }

    }




}
