/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program: Design Prject
*  Author: Jolly
*  Date: 3/15/24
*  Description: Tech Fair Program
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* - number of students per project
*
*
*PROCESSING:
* - total number of students per project
* - calculate amount of money each project will make
* - calculate total cost for the entire science fair
* - output results
*
*
*
*OUTPUT:
* - total cost that each student participating will pay
*
*
*********************PSEUDOCODE******************************/
/*PROGRAM ScienceFair:
 double DISCOUNT = 0.05
 int BASE_COST = 50
 Read totalStudents
 Read studentsArduino
 Read studentsRaspberry
 Read studentsVr
 If totalStudents <= 0
    THEN Print "Zero"
 Else
    If totalStudents > 100
       THEN fixedCost = (BASE_COST - (BASE_COST * DISCOUNT))
    Else
        fixedCost = BASE_COST
    ENDIF
    If studentsArduino >= 15
        THEN costArduino = (9*studentsArduino + fixedCost*studentsArduino)
    Else
        costArduino = (10*studentsArduino + fixedCost*studentsArudino)
    ENDIF
    If studentsRaspberry is less than or equal to 20
        THEN costRaspberry = (15*studentsRaspberry + fixedCost*studentsRaspberry)
    Else 
        costRaspberry = (12*studentsRaspberry + fixedCost*studentsRaspberry)
    ENDIF
    costVr = (20*studentsVr + fixedCost*studentsVr)
    totalCost = (costArduino+costRaspberry+costVr)
    costPerStudent = (totalCost/totalStudents)
    Print costPerStudent
END. */
/**************** TEST CASES ************************
*Test                    Input                                                                                 Desired Ouput
*                        totalStudents = 0, studentsArduino = 0,  studentsRaspberry = 0, studentsVr = 0             Zero
*                        totalStudents = 120, studentsArduino = 50, studentsRaspberry = 20, studentsVr = 50         $62.5
*                        totalStudents = 80, studentsArduino = 14, studentsRaspberry = 38, studentsVr = 28          $64.45
*                        totalStudents = 3, studentsArduino = 1, studentsRaspberry = 1, studentsVr = 1              $65.0
*                      
*
*
*
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS
       final double DISCOUNT = 0.05;
       final int BASE_COST = 50;
       Scanner scanner = new Scanner(System.in);
       
  //VARIABLES
      //initialize the variables
      double fixedCost;
      double costArduino;
      double costRaspberry;
      double costVr;
      
       

  //CODE
        //Read totalStudents
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();
        
        //Read studentsArduino
        System.out.print("Enter the total number of students participating in the Arduino project: ");
        int studentsArduino = scanner.nextInt();
         
        //Read studentsRaspberry
        System.out.print("Enter the total number of students participating in the Raspberry project: ");
        int studentsRaspberry = scanner.nextInt();
        
        //Read studentsVr
        System.out.print("Enter the total number of students participating in the VR project: ");
        int studentsVr = scanner.nextInt();
        
        //Check if totalStudents is equal to 0
        if (totalStudents <=0){
            System.out.println("Zero");
        }
        else{
            if (totalStudents > 100){
              fixedCost = (BASE_COST - (BASE_COST * DISCOUNT));
            }
            else{
                fixedCost = BASE_COST;
            }
        //Calculate total cost for Arduino project
            if (studentsArduino >= 15){
              costArduino = (10*studentsArduino + fixedCost*studentsArduino);
            }
            else{
              costArduino = (10*studentsArduino + fixedCost*studentsArduino);  
            }
        //Calculate total cost for Raspberry project
            if (studentsRaspberry <= 20){
              costRaspberry = (15*studentsRaspberry + fixedCost*studentsRaspberry);
            }
            else{
              costRaspberry = (12*studentsRaspberry + fixedCost*studentsRaspberry);
            }
        //Calculate total cost for Vr project
              costVr = (20*studentsVr + fixedCost*studentsVr);
        //Add total cost of all three projects together
            double totalCost = (costArduino + costRaspberry + costVr);
        //Divide total cost and total students to determine how much each student should pay
            double costPerStudent = (totalCost/totalStudents);
        //Display total cost per student
            System.out.println("The cost for each student is: $" + costPerStudent);
            

   
                
            }
            
        }
        
    }
    

