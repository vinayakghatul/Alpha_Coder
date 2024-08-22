package Interface;

/**
 * Diamond problem solution using interfaces and default methods
 */
interface A {
    void method();
}

interface B extends A {
    @Override
    default void method() {
        System.out.println("This is method in B");
    }
}

interface C extends A {
    @Override
    default void method() {
        System.out.println("This is method in C");
    }
}

public class DiamondProblem implements B,C {

    @Override
    public void method() {
        System.out.println("This method is from D Class");
        B.super.method();
        C.super.method();
    }

    public static void main(String[] args) {
        DiamondProblem d = new DiamondProblem();

        d.method();
    }

}
