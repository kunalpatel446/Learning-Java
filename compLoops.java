public class compLoops{
	static Int[] a = {0, 1, 2, 3, 4, 5};
	public static void main(String[] args){
	func(a);
	for (z = 0; z <a.length; ++z){
	System.out.println(a[z]);
	}
	}
	static int[] func(Int a[]){
		  for (int i = 0; i <=1; ++i){
		  	if (i = 1){
		  		for (x = 0; x < a.length; ++x){
		  			a[x] = x + 1;
		  		}
		  		return a;
		  	}
		  	else{
		  		for (y = 0; y < a.length; --y){
		  			a[y] = (y + 7) - y;
		  		}
		  		return a;
		  	}
		  }
	}
}