//WAP TO CHECK WHETHER GIVEN NUMBER IS PRIME NUMBER OR NOT ?
import java.util.Scanner;
class P12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no :" );
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println(num +" is Prime number " );
		else
			System.out.println(num+" is not Prime number ");
	}
}
