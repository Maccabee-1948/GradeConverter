/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeconverter;

import java.util.Scanner;

/**
 *
 * @author markB
 */
public class GradeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // WELCOME MESSAGE 
        System.out.println("Welcome to the Letter Grade Converter");
        // GET INPUT 
        Scanner sc = new Scanner(System.in);
        
        
       
        String choice = "y";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter numeric grade:   ");
            int numericGrade = sc.nextInt();
       
            
            String letterGrade = " ";
            ///CALCULATE LETTER GRADE
            
            if (numericGrade >= 88)
            
                letterGrade = "A";
            
            else if (numericGrade >= 80)
            
                letterGrade = "B";
            
            else if (numericGrade >= 67)
                
                letterGrade = "C";
            
            else if (numericGrade >= 60)
                
                letterGrade = "D";
            
            else
         
                letterGrade = "F";
          
           
            
            //DIPLAY RESULTS
            String message =
                
                "Letter grade: " +
                 letterGrade;
            
            System.out.println(message);
            
            System.out.println("Continue: Y/N: ");
            choice = sc.next();
            
            System.out.println();
        
        
        }
        
        
        
        //DISPLAY RESULTS TEST
        //System.out.println(numericGrade);
        
    
       
        
    }
    
}
