/***************************************************************
* file: StudentID.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: contains the student ID that is randomly generated 
* from 100000 to 999999.
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.Random;

/**
 *
 * @author Blake
 */
class StudentID {
    private int studentID;
    
    public StudentID() {
        Random rnd = new Random();
        studentID = rnd.nextInt(999999-100000) + 100000;
    }
    
    public int returnID() {
        return studentID;
    }

}
