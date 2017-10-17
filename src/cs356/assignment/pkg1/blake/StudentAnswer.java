/***************************************************************
* file: StudentAnswer.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Extends StudentID and adds their answer to get the
* Answer/StudentID combination that will be submitted. When not
* being used with the simulator the StudentAnswer(int)
* constructor is used to prompt a user for an answer.
*
****************************************************************/ 
package cs356.assignment.pkg1.blake;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class StudentAnswer extends StudentID{
    private Answers ans;
    private int[] answer;
    
    public StudentAnswer(int answerType) {
        if(answerType == 1) {
            ans = new SingleAnswers();
        } else {
            ans = new MultipleAnswers();
        }
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your answer: ");
        answer = ans.askForAnswer();
    }
    
    public StudentAnswer(int answerType, int numAnswers) {
        if(answerType == 1) {
            ans = new SingleAnswers();
        } else {
            ans = new MultipleAnswers();
        }
        answer = ans.randomAnswer(numAnswers);
    }
    
    
    public int[] getAnswer() {
        return answer;
    }

    void printSubmission() {
        System.out.println("Student ID: " + this.returnID());
        System.out.println("Answer Submitted: " + ans.getAnswer() + "\n");
    }
    
}
