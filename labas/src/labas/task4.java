package labas;
import java.util.Scanner;

public class task4 {
	public static void main(String[] args){
	try{
		Scanner in = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	double a=in.nextDouble();
	System.out.println("Enter the second number: ");
	double b=in.nextDouble();
	System.out.println("Summary="+(a+b)+"\nProduct="+(a*b)+"\nDifference="+(a-b)+"\n");
	in.close();
	}catch(Exception e){
		 System.out.println("Мы ловим следующий эксепшен " + e); 
	}
}
}