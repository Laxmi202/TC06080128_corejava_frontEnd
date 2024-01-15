/* Ex 37. */
package assigns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Groups 
{
	public static void main(String [] args)
	{
		ArrayList<Student> students = new ArrayList<>(); //to store student object
		
		Scanner scanner = new Scanner(System.in); //for input
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter student details " + (i+1) + ":"); //here (i+1) is used to keep count of the entries starting from 1
			System.out.print("Name: "); 
			String name = scanner.next(); //reads user's input for name using the scanner object
			System.out.print("Roll No: ");
			int rollNo = scanner.nextInt();
			System.out.print("Age: ");
			int age = scanner.nextInt();
			System.out.print("Score: ");
			int score = scanner.nextInt();
			
			students.add(new Student(name,rollNo,age,score));
		}
		Collections.sort(students, Collections.reverseOrder()); //to sort the list of students based on their scores
		
		System.out.println("\nStudents arranged based on the score groups:");	
		printScoreGroup(students, 0, 50);
		printScoreGroup(students, 50, 65);
		printScoreGroup(students, 65, 80);
		printScoreGroup(students, 80, 100);	
	}

	private static void printScoreGroup(ArrayList<Student> students, int minScore, int maxScore) 
	{
		System.out.println("\nScore Group [" + minScore + "-" + maxScore + "]:");
		for(Student student: students)
		{
			if(student.score >= minScore && student.score <=maxScore)
			{
				System.out.println(student);
			}
		}	
	}
}
