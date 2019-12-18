package ua.kiev.prog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        final Class <?> myTestcls = TestAnnotation.class;
        Method[] myMeth = myTestcls.getDeclaredMethods();

        System.out.println("Simple result:");
        TestAnnotation.testMethod(2,3);

        for(Method method: myMeth){
            if(method.isAnnotationPresent(Test.class)){
                Test testAnn = method.getAnnotation(Test.class);
                System.out.println("Method result thru reflection " + method.getName());
                method.invoke(null,testAnn.one(),testAnn.two());

            }
        }
    }
}
