package ua.kiev.prog;

public class TestAnnotation {

    @Test(one = 1, two = 2)
    public static void testMethod(int a, int b){
        System.out.println("Result " + (a + b));
    }
}
