package labas;
import java.util.Scanner;

public class task6 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		try{
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
	}in.close();
	}catch(Exception e){System.err.println("Что-то пошло не так " + e);}
	}
}

