/***************************************************************
* file: AnswerChoices.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: If not using SimulationDriver a prompt will be called
* for the user to enter the answers. Answers are defaulted for
* the SimulationDriver.
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class AnswerChoices {
    
    private String[] answers;

    public AnswerChoices() {
        
        List<String> allInputAnswers = new ArrayList<String>();
        Scanner kb = new Scanner(System.in);
        String inputAnswer = "not empty";
        int answerNumber = 1;
        
        System.out.println("Enter your answers below. Leave blank and press enter when you are done entering answer options.");
        System.out.print("Enter Answer Option: " + answerNumber + ".");
        inputAnswer = kb.nextLine();
        while(!inputAnswer.equals("")) {
            answerNumber++;
            allInputAnswers.add(inputAnswer);
            System.out.print("Enter Answer Option: " + answerNumber + ".");
            inputAnswer = kb.nextLine();
        }
        answers = allInputAnswers.toArray(new String[allInputAnswers.size()]);
    }

    AnswerChoices(String[] options) {
        answers = options;
    }
    

    protected void displayAnswers() {
        for(int i = 0; i < answers.length; i++) {
            System.out.println((i+1) + "." + answers[i]);
        }    }

    public int numAnswerChoices() {
        return answers.length;
    }
    
}
