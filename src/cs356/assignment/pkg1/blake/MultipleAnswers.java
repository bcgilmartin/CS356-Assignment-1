/***************************************************************
* file: MultipleAnswers.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: MultipleAnswers is used instead of SingleAnswers when
* there can be more than one correct answer.
*
****************************************************************/
package cs356.assignment.pkg1.blake;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Blake
 */
public class MultipleAnswers implements Answers {
    
    int[] answers;
    
    public MultipleAnswers() {}

    public int[] askForAnswer() {
        Scanner kb = new Scanner(System.in);
        System.out.println("There may be one or more correct Answer. Enter multiple answers like this: \"A B C\" \nPlease enter the number(s) of the answer(s) that you think is/are the correct choice: ");
        String studentAnswer = kb.nextLine();
        String[] splitAnswers = studentAnswer.split("\\s+");
        answers = new int[splitAnswers.length];
        for(int i = 0;i < splitAnswers.length;i++)
        {
            answers[i] = Integer.parseInt(splitAnswers[i]);
        }
        return answers;
    }

    @Override
    public void displayAnswers() {
        for(int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + " ");
        }
    }

    @Override
    public int[] randomAnswer(int numAnswers) {
        Random rand = new Random();
        int num = rand.nextInt(numAnswers) + 1;
        Set<Integer> randAns = new HashSet<Integer>();
        for(int i = 0; i < num; i++) {
            randAns.add(rand.nextInt(numAnswers));
        }
        
        int[] returnAns = new int[randAns.size()];
        Object[] tempObjArr = randAns.toArray();
        
        for(int i = 0; i < tempObjArr.length; i++) {
            returnAns[i] = (int)tempObjArr[i];
        }
        answers = returnAns;
        return returnAns;
    }

    @Override
    public String getAnswer() {
        String answerString = "";
        for(int i = 0; i < answers.length; i++) {
            answerString += (answers[i] + 1) + " ";
        }
        return answerString;
    }
    
}
