/***************************************************************
* file: SimulationDriver.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Runs IVoteService. Has default question. Randomly
* selects question type. Random amount of submissions. Random 
* Answers. 
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Blake
 */
public class SimulationDriver {
    
    static FinalSubmissions classFinal;
    
    public static void main(String args[]) {
        IVoteService service = new IVoteService();
        Scanner kb = new Scanner(System.in);
        TeacherQuestion question = new TeacherQuestion("What is the correct answer(s)?");
        
        Random rand = new Random();
        int questionType = rand.nextInt(2) + 1;
        System.out.print("Question Type: ");
        if(questionType == 1) {
            System.out.println("Single");
        } else {
            System.out.println("Multiple");
        }
        
        
        
        int submissions = rand.nextInt((100 - 50) + 1) + 50;
        StudentAnswer[] studentSubmissions = new StudentAnswer[submissions];
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
    
    private static void submission(StudentAnswer studentSubmissions) {
        classFinal.add(studentSubmissions);
    }
    
}
