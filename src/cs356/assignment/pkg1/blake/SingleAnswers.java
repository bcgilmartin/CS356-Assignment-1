/***************************************************************
* file: SimulationDriver.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Use SingleAnswers when the answer to the question is
* just one answer rather than multiple.
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class SingleAnswers implements Answers {
    
    int[] studentAnswer;
    
    public SingleAnswers() {
        studentAnswer = new int[1];
    }

    @Override
    public int[] askForAnswer() {
        Scanner kb = new Scanner(System.in);
        System.out.println("There is only one correct answer. Please enter the number of the answer that you think is the correct choice: ");
        studentAnswer[0] = kb.nextInt();
        return studentAnswer;
    }

    @Override
    public void displayAnswers() {
        System.out.println("Your answer: " + studentAnswer[1]);
    }

    @Override
    public int[] randomAnswer(int numAnswers) {
        Random rand = new Random();
        int[] returnAns = new int[1];
        returnAns[0] = rand.nextInt(numAnswers);
        studentAnswer = returnAns;
        return returnAns;
    }

    @Override
    public String getAnswer() {
        return "" + (studentAnswer[0] + 1);
    }
    
}
