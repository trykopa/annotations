package ua.kiev.prog;

import java.io.Serializable;

public class ClassToSeralize implements Serializable {
    @Save
    private String myString;

    @Save
    private int myInt;

    @Save
    private boolean isInitialized;

    public ClassToSeralize(){
        this.myString = "first";
        this.myInt = 1;
        this.isInitialized = true;
    }

    public String getMyString() {
        return myString;
    }

    public int getMyInt() {
        return myInt;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }


    public String toString(){
        String tmp = this.myString + " " + this.myInt + " " + this.isInitialized;
        System.out.println(tmp);
        return tmp;
    }
}
