package com.knoldus.task15.Package2;
import com.knoldus.task15.Package1.DefaultInstance;

public class DefaultInstanceAccess
{
    public static void main(String args[])
    {
        DefaultInstance defaultInstance = new DefaultInstance();
        //cant access the default instance variable from a different package
//        System.out.println(defaultInstance.number);
    }
}
