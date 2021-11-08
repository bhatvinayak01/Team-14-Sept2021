import java.util.Scanner;
class Avg
{
public static void main(String args[])
	{
	float a, b, c;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number : ");
	a = sc.nextFloat();
	System.out.print("Enter the second number : ");
	b = sc.nextFloat();
	System.out.print("Enter the third number : ");
	c = sc.nextFloat();
	sc.close();
	float avg = (a + b + c) / 3;
	System.out.println("Average of these three numbers is : "+avg);
	}
}