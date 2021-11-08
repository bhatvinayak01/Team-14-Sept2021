class Q16
{
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((i==1) && (j>2 && j<8))
					System.out.print("\"");
				else if((i==1 || i==5) && (j==2 ||j==8))
					System.out.print("+");
				else if(i==2 && j==1)
					System.out.print("[");
				else if(i==2 && j==9)
					System.out.print("]");
				else if((i>1 && i<5) && (j==2 || j==8))
					System.out.print("|");
				else if(i==2 && (j==4 || j==6))
					System.out.print("O");
				else if(i==3 && j==5)
					System.out.print("^");
				else if(((i==5) && (j>1 && j<9)) || (i==4 && j==5))
					System.out.print("-");
				else if(i==4 && (j==4 || j==6))
					System.out.print("'");
				else
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
}