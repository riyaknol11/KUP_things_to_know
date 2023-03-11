package com.knoldus.task12;

public class PatientDetails {
    public static void main(String[] args) {
        //the getter and setter methods used to access the variable from other class
        PatientInformation patient = new PatientInformation();
        patient.setPatient_name("Rose");
        System.out.println("getting my number "+ patient.getPatient_name());
    }
}
