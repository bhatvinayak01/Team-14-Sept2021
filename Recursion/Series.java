import java.util.*;
class Series
{
    static double sum(int i, int n, double s)
    {
        if(i>n)
            return s;
        else
        {
            if(i%2==0)
                s = s - (double)1/i;
            else
                s= s + (double)1/i;
            return sum(i+1,n,s);
        }
    }
 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        double res = sum(1,n,0);
        System.out.println(res);
    }
}