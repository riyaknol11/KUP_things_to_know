package com.knoldus.task7;

public class Database {
    // Creating Static variable for the number of active database connections
    private static int numOfConnections = 0;

    public Database() {
        // Code to establish a database connection
        numOfConnections++;
    }

    public static int getNumOfConnections() {
        return numOfConnections;
    }
    public static void main(String[] args){
        Database databaseUser1 = new Database();
        Database databaseUser2 = new Database();
        int activeConnections = Database.getNumOfConnections();
        System.out.println("Number of active database connections: " + activeConnections);
    }
}
