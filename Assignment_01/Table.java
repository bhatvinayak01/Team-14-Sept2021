import java.util.Scanner;
public class Table
{
    public static void main(String args[])
    {
		int n, mul;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number : ");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			mul = n * i;
			System.out.println(n+" x "+i+" = "+mul);
        }
    }
}
