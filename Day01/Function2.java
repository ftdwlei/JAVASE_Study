package Day01;
/**
 * 函数重载演示
 * @author Administrator
 *
 */
public class Function2 {
	public static void main(String[] args) {
		//输出3*5
		System.out.println(product(3,5));
		//输出3.0*2
		System.out.println(product(3.0,2));
		//输出2*3*4
		System.out.println(product(2,3,4));
	}
	//两个整数之积
	static int product(int a,int b){
		return a*b;
	}
	
	//两个浮点数乘积
	static double product(double a,double b){
		return a*b;
	}
	
	//三个整数乘积
	static int product(int a,int b,int c){
		return a*b*c;
	}
}
