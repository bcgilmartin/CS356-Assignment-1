/***************************************************************
* file: FinalSubmissions.java
* author: B. Gilmartin
* class: CS 356 – Object-Oriented​ ​Design​ ​and​ ​Programming
*
* assignment: program 1
* date last modified: 10/16/2017
*
* purpose: FinalSubmissions holds the final submissions from the
* class. If a student(identified by StudentID) submits multiple
* answers only the last answer will be kept.
*
****************************************************************/ 
package cs356.assignment.pkg1.blake;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Blake
 */
public class FinalSubmissions {
    
    private Hashtable<Integer, List<Integer>> submissions;
    
    public FinalSubmissions() {
        submissions = new Hashtable<Integer, List<Integer>>();
    }
    
    public void add(StudentAnswer studentAnswer) {
        submissions.values().remove(studentAnswer.returnID());
        int[] answers = studentAnswer.getAnswer();
        List tempList;
        for(int i = 0; i < answers.length; i++) {
            tempList = submissions.get(answers[i]);
            if(tempList == null) {
                tempList = new ArrayList<Integer>();
                tempList.add(studentAnswer.returnID());
                submissions.put(answers[i], tempList);
            } else {
                tempList.add(studentAnswer.returnID());
            }
        }
    }
    
    public void printResults() {
        Object[] answers = submissions.keySet().toArray();
        System.out.println("Results: ");
        for(int i=0; i < answers.length; i++) {
            System.out.print(((int)answers[i] + 1) + ":" + submissions.get(answers[i]).size() + " ");
        }
        System.out.print("\n");
    }
}
