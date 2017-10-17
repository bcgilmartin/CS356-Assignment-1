/***************************************************************
* file: CS356Assignment1.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Run this to be prompted for the question and answers.
* And you will be prompted to also answer the question.
* Other than that works just like the Simulation Driver. 
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
public class CS356Assignment1Blake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVoteService service = new IVoteService();
        Scanner kb = new Scanner(System.in);
        TeacherQuestion question = new TeacherQuestion();
        int questionType = promptUserQuestionType(kb);
        
        Random rand = new Random();
        int submissions = rand.nextInt((100 - 50) + 1) + 50;
        StudentAnswer[] studentSubmissions = new StudentAnswer[submissions];
        System.out.println("Number of submissions: " + submissions);
        for(int i = 0; i < submissions; i++) {
            studentSubmissions[i] = new StudentAnswer(questionType, question.numAnswerChoices());
            service.submission(studentSubmissions[i]);
            studentSubmissions[i].printSubmission();
        }
        
        StudentAnswer yourAnswer = new StudentAnswer(questionType);
        service.submission(yourAnswer);
        
        
        System.out.println("Number of submissions: " + submissions);
        for(int i = 0; i < submissions; i++) {
            studentSubmissions[i] = new StudentAnswer(questionType, question.numAnswerChoices());
            service.submission(studentSubmissions[i]);
            studentSubmissions[i].printSubmission();
        }
        System.out.print("Question Type: ");
        if(questionType == 1) {
            System.out.println("Single");
        } else {
            System.out.println("Multiple");
        }
        System.out.println("Number of submissions: " + submissions);
        question.displayQnA();
        service.displayOutput();
    }
    
    
    /**
     * Prompt the user for the question type until a correct question type is
     * received.
     * @param kb
     * @return integer questionType
     */
    private static int promptUserQuestionType(Scanner kb) {
        System.out.print("1.Single\n2.Multiple\n\nQuestion type: ");
        String questionTypeInput = kb.nextLine();
        int questionType = getQuestionType(questionTypeInput);
        while(questionType==0) {
            System.out.print("WRONG QUESTION TYPE!\n\n1.Single\n2.Multiple\n\nQuestion type: ");
            questionTypeInput = kb.nextLine();
            questionType = getQuestionType(questionTypeInput);
        }
        return questionType;
    }
    
    /**
     * Interprets the questionTypeInput to either be a Single Question(Return 1)
     * or a Multiple Question(Return 2), returns 0 if neither are detected.
     * @param questionTypeInput
     * @return integer questionType
     */
    private static int getQuestionType(String questionTypeInput) {
        questionTypeInput = questionTypeInput.toLowerCase();
        if(questionTypeInput.contains("1") || questionTypeInput.contains("single")) {
            return 1;
        } else if(questionTypeInput.contains("2") || questionTypeInput.contains("multiple")) {
            return 2;
        } else {
            return 0;
        }
    }
    
}
