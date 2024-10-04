package loopproject;
import java.util.Scanner;
public class Loopproject {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number of students:");
		int numberStudents=scanner.nextInt();
		
		for(int x=0; x<numberStudents;x++) {
			System.out.println("Enter students name:");
			String name=scanner.next();
			System.out.println("Enter student's score(0-100):");
			int score=scanner.nextInt();
			
			String grade;
			if(score>=90) {grade="A";
		}   if(score>=80) {grade="B";
		}   if(score>=70) {grade="C";
		}   if(score>=60) {grade="D";
		}   else {
	    	grade="F";
	    	}
		System.out.println(name+"grade is" + grade);
		
		
		 

		   
		    
		}
		scanner.close();
	}

}
