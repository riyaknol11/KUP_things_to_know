package com.knoldus.task13;


public class MySubclass extends MyClass {
    public void myPublicMethod() {
        myProtectedMethod();
    }

    public static void main(String[] args) {
        MySubclass subclassObject= new MySubclass();
        subclassObject.myPublicMethod();
    }

}