package practice;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {

	public static void main(String[] args) {
		//0 for ROCK
		//1 for PAPER
		//2 for SCISSOR
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 for Rock 1 for paper and 2 for scissor :");
		Random ran=new Random();
		int num=sc.nextInt();
		int random=ran.nextInt(3);
		if(num==random ) {
			System.out.println(" Draw");
		}
		else if(num==1&& random==0 || num==2 && random==1 || num==0&&random==2){
			System.out.println("You win");
		}
		else {
			System.out.println("computer win");
		}


		if(random==0) {
			System.out.println("Rock");
		}
		else if(random==1) {
			System.out.println("Paper");
		}
		else if(random==2) {
				System.out.println("Scissor");
			}
	}

}
