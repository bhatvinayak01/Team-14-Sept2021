import java.util.Scanner;
class Rect
{
	public static void main(String args[])
	{
		float w, h, a, p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Width : ");
		w = sc.nextFloat();
		System.out.print("Height : ");
		h = sc.nextFloat();
		sc.close();
		a = w * h;
		p = 2 * (w + h);
		System.out.println("Area is "+w+" * "+h+" = "+a);
		System.out.println("Perimeter is : "+p);
	}
}