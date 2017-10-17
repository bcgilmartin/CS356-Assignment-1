/***************************************************************
* file: IVoteService.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Handles the service. Takes submissions from 
* SimulationDriver. Displays the results.
*
****************************************************************/ 
package cs356.assignment.pkg1.blake;

import static cs356.assignment.pkg1.blake.SimulationDriver.classFinal;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class IVoteService {
    
    private FinalSubmissions classFinal;
    
    public IVoteService() {
        
        classFinal = new FinalSubmissions();
        
    }
    
    /**
     *
     * @param studentSubmissions
     */
    public void submission(StudentAnswer studentSubmissions) {
        classFinal.add(studentSubmissions);
    }
    
    public void displayOutput() {
        classFinal.printResults();
    }
    
}
