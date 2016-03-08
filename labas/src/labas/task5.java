package labas;
import java.util.Scanner;
import static java.lang.Math.*;

public class task5 {
	
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			try{
			System.out.println("\nEnter lenght of gipotenoosa: ");
			double c=in.nextDouble();
			System.out.println("Enter lenght of side: ");
			double d=in.nextDouble();
			if (c<d){
				System.out.println("Не бывает такого треугольника");
			}else{
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
			in.close();
			}
			}catch(Exception e){
				System.err.println("Что-то пошло не так " + e);
			}
		}
		}
