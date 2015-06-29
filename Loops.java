public class Loops{
	static String[] a = {"1,2," , "3,4"};
	static String[] b = {"I can count to 4 " , ". See?"};
	public static void main(String[] args){
		System.out.print(b[0]);
		for (int i = 0; i < a.length; ++i){
			System.out.print(a[i]);
		}
		System.out.println(b[1]);
	}
}