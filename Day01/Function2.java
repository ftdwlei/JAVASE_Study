package Day01;
/**
 * ����������ʾ
 * @author Administrator
 *
 */
public class Function2 {
	public static void main(String[] args) {
		//���3*5
		System.out.println(product(3,5));
		//���3.0*2
		System.out.println(product(3.0,2));
		//���2*3*4
		System.out.println(product(2,3,4));
	}
	//��������֮��
	static int product(int a,int b){
		return a*b;
	}
	
	//�����������˻�
	static double product(double a,double b){
		return a*b;
	}
	
	//���������˻�
	static int product(int a,int b,int c){
		return a*b*c;
	}
}
