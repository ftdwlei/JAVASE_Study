package Day01;
/**
 * 
 * @author Administrator
 *  需求：进制转换相关代码实现
 *  思路：
 *  步骤：
 *  
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int num=31;
		toHex(num);
		toOtherJZ(num, 12);
	}
	//转换任意进制(16以内)  x代表x进制
	public static void toOtherJZ(int num,int x){
		char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //查表法
		String str="";
		while(num>0){
			char ch=arr[num%x];
			num=num/x;
			str+=ch;
		}
		//打印x进制数
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println();
	}
	
	//转换16进制
	public static void toHex(int num){
		char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //查表法
		String str="";
		while(num>0){
			char x=arr[num&15];
			num=num>>4;
			str+=x;
		}
		//打印16进制数
		System.out.print("0x");
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println();
	}
}
