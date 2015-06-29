public class compLoops
{
	static int num =0;
	static int[] a = {0, 1, 2, 3, 4, 5};
	public static void main(String[] args)
	{
		func(a);
		for (int z = 0; z < a.length; ++z)
		{
			System.out.println(a[z]);
		}
	}
	static int[] func(int a[])
	{
		  for (int i = 0; i <=1; ++i)
		{
		  	num = i;
		  	if (num == 1)
		  	{
		  		for (int x = 0; x < a.length; ++x)
		  		{
		  			a[x] = x + 1;
		  		}
		  	}
		  	else
		  	{
		  		for (int y = 6; y == 0; --y)
		  		{
		  			a[y] = (y + 7) - y;
		  		}
		  	}
		}
		return a;
	}
}