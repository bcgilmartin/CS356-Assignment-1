/***************************************************************
* file: QString.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Contains the question string. Default question when
* using the SimulationDriver is "What is the correct answer(s)?"
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.Scanner;

/**
 *
 * @author Blake
 */
class QString {
    
    protected String questionString;
    
    public QString() {
        questionString = "What is the correct answer(s)?";
    }
    
    public void displayQuestion() {
        System.out.println(questionString);
    }
    
}
