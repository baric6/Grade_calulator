package hollon_joe_01;

import java.util.Scanner;

public class grade_calulator 
{
	public static void main(String[] args) 
	{
		//new scanner object
				Scanner input = new Scanner(System.in);
				
				//max score of the project
				int max_score_1, max_score_2, max_score_3, max_score_4;
				
				//the score you earned
				double earned_score_1, earned_score_2, earned_score_3, earned_score_4,
					   points_earned, total_possible, coarse_total_score;
				
				//for letter grade 
				char letter_grade = 'z';
				String letter_gradez = null;
				
				System.out.println("");
				System.out.println("XXXXXXXXXXXXXXXXXXX");
				System.out.println("X Grade Calulator X");
				System.out.println("XXXXXXXXXXXXXXXXXXX");
				System.out.println("");
				
				//input for the max score and score earned, really wanted to put this in a for-loop :}
				System.out.print("Max Score 1: ");
				max_score_1 = input.nextInt();
				System.out.print("Earned Score 1: "); 
				earned_score_1 = input.nextDouble();
				
				System.out.print("Max Score 2: ");
				max_score_2 = input.nextInt();
				System.out.print("Earned Score 2: ");
				earned_score_2 = input.nextDouble();
				
				System.out.print("Max Score 3: ");
				max_score_3 = input.nextInt();
				System.out.print("Earned Score 3: ");
				earned_score_3 = input.nextDouble();
				
				System.out.print("Max Score 4: ");
				max_score_4 = input.nextInt();
				System.out.print("Earned Score 4: ");
				earned_score_4 = input.nextDouble();
				
				//closes scanner 
				input.close();
				
				System.out.println("");
				
				//add up all the score earned
				points_earned = earned_score_1 
						      + earned_score_2 
						      + earned_score_3 
						      + earned_score_4;
				
				System.out.println("Points Earned: " + points_earned);
				
				//adds up all the max scores
				total_possible = max_score_1 
							   + max_score_2 
							   + max_score_3 
							   + max_score_4; 
				
				System.out.println("Total Possible: " + total_possible);
				
				System.out.println("");
				
				//makes decimal to percentage
				//coarse_total_score = 1000;
				coarse_total_score = (points_earned / total_possible) * 100;
				
				System.out.println("Coarse Score: " + coarse_total_score + "%");
				
				//if statements to see what your letter grade is from your total
				if(coarse_total_score >= 0 && coarse_total_score < 60)
				{
					letter_grade = 'F';
				}
				else if(coarse_total_score >= 60 && coarse_total_score < 70)
				{
					letter_grade = 'D';
				}
				else if(coarse_total_score >= 70 && coarse_total_score < 80)
				{
					letter_grade = 'C';
				}
				else if(coarse_total_score >= 80 && coarse_total_score < 90)
				{
					letter_grade = 'B';
				}
				else if(coarse_total_score >= 90 && coarse_total_score <= 100)
				{
					letter_grade = 'A';
				}
				else
				{
					//having a bit of fun 
					letter_gradez = ":}";
					System.out.println("Error...404\nGrade is to high, are you sure your not the teacher");
				}
				
				//if to see if the grade is a valid grade 
				if(coarse_total_score >= 101)
				{
					System.out.println("Letter Grade: " + letter_gradez);
				}
				else
				{
					System.out.println("Letter Grade: " + letter_grade);
				}
	}
}
