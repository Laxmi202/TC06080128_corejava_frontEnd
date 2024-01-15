/*37. Make list of Students having name, roll no., age, score.   
Write a program to accept 10 students record and arrange the Students based on the score group [0 - 50] .[50-65],[65- 80],[80-100].*/


package assigns;

public class Student implements Comparable<Student>
{
	String name;
	int rollNo;
	int age;
	int score;
	
	public Student(String name, int rollNo, int age, int score)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score; //constructor 
	}
	
	@Override // enables sorting based on the scores
	public int compareTo(Student other) 
	{
		return Integer.compare(this.score, other.score); 
	}
	
	public String toString()
	{
		return "Name: " + name + ", Roll no: " + rollNo + ", Age: " + age + ", Score: " + score; //representing the student object
	}
}

	


