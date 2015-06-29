public class Functions{
	static int num = 0;
	static String[] a = {"0","00"};
	static int[] b = {0,1,2,3};
	public static void main(String[] args){
		func(b, num);
		func2(a);
		System.out.println(a[0] + b[0] + "," + b[1] + "," + b[2] + "," + b[3] + a[1]);
	}
	static int[] func(int b[], int num){
			for (int i = 0; i<=3;++i){
				num = i;
				b[i] = num + 1;
			}
		return b;
	}
	static String[] func2(String a[]){
		a[0] = "I can count to 4, ";
		a[1] = ". See?";
		return a;
	}
}