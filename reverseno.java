import java.io.*;
class reverseno
{
	public static void main(String arg[])
	{
		int r=0,n=356;
		while(n!=0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
			System.out.println(+r);
		}
	}
}