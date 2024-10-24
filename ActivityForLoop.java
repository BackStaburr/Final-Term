/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @Neo ITE-104
 */
import java.util.Scanner;
public class ActivityForLoop {
    public static void main(String[] args){
       Scanner neo = new Scanner(System.in);
       
        double[] grades = new double[5];
        String[] subjects = {"Math","Science","Filipino","History","Programming"};
        
        System.out.println("Please enter the grades of the following subjects: ");
        //double()
            for (int i = 0; i < subjects.length; i++) {
            //System.out.print(subjects[i] + ":");
            //grades[i] = neo.nextDouble();
            
            double grade;
            do {    
            System.out.print(subjects[i] + " : ");
            while (!neo.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                neo.next(); // Clear the invalid input
            }
            grade = neo.nextDouble();
            if(grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            }    
        } while (grade < 0 || grade > 100); //the condition is under the while loop
          grades[i] = grade;
                    
            }
        System.out.println("\nGrades of the subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + grades[i]);
            
        }
        int sum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            char gradesClassification;
            if (grades[i] >= 90){
                gradesClassification = 'A';
            }else if (grades[i] >= 80) {
                gradesClassification = 'B';
            }else if (grades[i] >= 70) {
                gradesClassification = 'C';
            }else if (grades[i] >= 60 ) {
                gradesClassification = 'D';
            }else {
                gradesClassification  = 'F';
          
            }
            System.out.println(subjects[i] + ":" + grades[i] + "=>" + gradesClassification);
        }
        //check for the subject below 75
        
        
        System.out.println("\nSubjects with grades below 75");
        for(int i = 0; i <subjects.length; i++);
        if(grades[i] < 75){
            System.out.println(subjects[i] + " : " + grades[i]);
        }
            double maxGrade = grades[0];
            double minGrade = grades[0];
            String maxSubject = subjects[0];
            String minSubject = subjects[0];
        
        for (int i = i; i < grades.length; i++);
        {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                maxSubject = subjects[i];
                for (int i = i; i < subjects.length; i++);
        {
            
            if (subjects[i] > maxSubject) {
                maxSubject = subjects[i];
                maxGrade = grades[i];
                
        }
            System.out.println("\nHighest grade: " + maxSubject + " : " + maxGrade);
            System.out.println("\nHighest grade: " + minSubject + " : " + minGrade);
        }            
        }      
            neo.close();
    }
    }
}
