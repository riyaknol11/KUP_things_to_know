package com.knoldus.task14;


public class GetName
{
    public void printName()
    {
        //can access public method of PublicMethod class in different method of same package
        PublicMethod public1 = new PublicMethod();
        System.out.println(public1.returnName());
    }
}