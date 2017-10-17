/***************************************************************
* file: TeacherQuestion.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Extends QString. Responsible for both the question
* and the answerOptions and can display both.
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class TeacherQuestion extends QString {
    AnswerChoices answerOptions;
    
    public TeacherQuestion() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your question: ");
        questionString = kb.nextLine();
        answerOptions = new AnswerChoices();
    }

    TeacherQuestion(String question) {
        
        String[] answers = {"A", "B", "C", "D"};
        answerOptions = new AnswerChoices(answers);
    }
    
    public void displayQnA() {
        super.displayQuestion();
        answerOptions.displayAnswers();
    }
    
    public int numAnswerChoices() {
        return answerOptions.numAnswerChoices();
    }
    
}
