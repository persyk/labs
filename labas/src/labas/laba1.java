package labas;
import java.util.Scanner;
import static java.lang.Math.*;

public class laba1 {
	
		public static void main(String[] args){
			//1 Task
			System.out.println("a=1, c=a+1 m=2,n=3 решение уравнений\nb=6, d=b*2-1 p=4, g=5 нахождение корней\n");
			//2 Task
			System.out.println("\t\t\t1\n"
					+ "\t\t1\t2\t3\n"
					+ "\t1\t2\t3\t4\t5\n"
					+ "1\t2\t3\t4\t5\t6\t7\n\n");
		             //3 Task
			Scanner in = new Scanner(System.in);
			System.out.println("Enter first number: ");
			double a=in.nextDouble();
			System.out.println("Enter the second number: ");
			double b=in.nextDouble();
			System.out.println("Summary="+(a+b)+"\nProduct="+(a*b)+"\nDifference="+(a-b)+"\n");
			//4 Task
			System.out.println("\nEnter lenght of gipotenoosa: ");
			double c=in.nextDouble();
			System.out.println("Enter lenght of side: ");
			double d=in.nextDouble();
			double katet;
			katet=sqrt(pow(c,2)-pow(d,2));
			System.out.println("Lenght of side is: "+katet+"\n");
			
			short i; //task 5
			double sum=1;
			
			for (i=2; i<=10000;i++)
			{
				if (i%2==0) sum-=(1.0/i); else sum+=(1.0/i);
				
			}
			System.out.println("\nSummary="+sum);
			
			System.out.println("\nEnter number from 0 to 9: "); //task 6
			short pro=in.nextShort(); 
			switch(pro)
			{
			case 0:
				System.out.println("Null");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
			in.close();
		}
	}



