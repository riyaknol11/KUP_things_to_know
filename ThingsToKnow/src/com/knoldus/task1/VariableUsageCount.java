package com.knoldus.task1;

 class Car{
    static int numOfCars = 0;

    public Car() {
        // increment the static variable by 1 for each car object created
        numOfCars++;
    }

    public static int getNumOfCars() {
        return numOfCars;
    }

    }
    public class VariableUsageCount{
        public static void main(String[] args) {
            Car car = new Car();
            System.out.println(Car.getNumOfCars());
        }
    }

