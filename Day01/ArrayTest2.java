package Day01;
/**
 * 
 * @author Administrator
 *  ���󣺽���ת����ش���ʵ��
 *  ˼·��
 *  ���裺
 *  
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int num=31;
		toHex(num);
		toOtherJZ(num, 12);
	}
	//ת���������(16����)  x����x����
	public static void toOtherJZ(int num,int x){
		char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //���
		String str="";
		while(num>0){
			char ch=arr[num%x];
			num=num/x;
			str+=ch;
		}
		//��ӡx������
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println();
	}
	
	//ת��16����
	public static void toHex(int num){
		char arr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //���
		String str="";
		while(num>0){
			char x=arr[num&15];
			num=num>>4;
			str+=x;
		}
		//��ӡ16������
		System.out.print("0x");
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println();
	}
}
