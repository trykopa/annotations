package ua.kiev.prog;

import java.io.*;
import java.lang.reflect.Field;


public class Task3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "/Users/at/Downloads/saved.obj";
        ClassToSeralize testObj = new ClassToSeralize();
        testObj.toString();
        serObj(testObj, path);
        testObj.setMyString("changed");
        testObj.toString();
        testObj = deserObj(path);
        testObj.toString();


    }

    static public void serObj(ClassToSeralize obj, String path) throws IOException {
        Class<?> testcls = ClassToSeralize.class;
        Save save = testcls.getAnnotation(Save.class);
        Field[] fields = testcls.getDeclaredFields();
        for(Field field : fields){
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            if (field.isAnnotationPresent(Save.class)){
                oos.writeObject(obj);
            }
        }
    }

    static public ClassToSeralize deserObj(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassToSeralize newcls = (ClassToSeralize) ois.readObject();
        return newcls;

    }
}
