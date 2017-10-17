/***************************************************************
* file: Answers.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: Answer Interface that can be assigned as either a 
* SingleAnswers or as MultipleAnswers.
*
****************************************************************/ 
package cs356.assignment.pkg1.blake;

/**
 *
 * @author Blake
 */
public interface Answers {
    public int[] askForAnswer();
    public void displayAnswers();
    public int[] randomAnswer(int numAnswers);
    public String getAnswer();
}
