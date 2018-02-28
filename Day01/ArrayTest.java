package Day01;
/**
 * 
 * @author Administrator
 *����ʵ��������ع���
 *˼·��
 *���裺
 */
public class ArrayTest {
	public static void main(String[] args) {
//		int arr[]={2,3,4,5,3,2,1,77,331,41,3};
//		printArr(arr);
//		System.out.println("�������ֵ��"+getMax(arr));
//		System.out.println("������Сֵ��"+getMin(arr));
//		printArr(selectSort(arr)); //���ѡ�������Ľ��
//		printArr(BubbleSort(arr)); //���ð�������Ľ��
		int arr2[]={2,12,34,53,144,234,237,344,4451,8652};
		System.out.println(halfSearch(arr2, 34));
		System.out.println(halfSearch(arr2, 39));
	}
	//�۰���ҡ����ֲ���
	public static int halfSearch(int []arr,int index){
		int min=0;
		int max=arr.length-1;
		int mid=(max+min)/2;
		while(min<=max){
			if(index>arr[mid]){
				min=mid+1;
				mid=(max+min)/2;
			}else if(index<arr[mid]){
				max=mid-1;
				mid=(max+min)/2;
			}else
				return mid;
		}
		return -1;
	}
	
	//����Ԫ�صĽ���
	public static void swap(int []arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	//ð������
	public static int[] BubbleSort(int []arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	//ѡ������
	public static int[] selectSort(int []arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//��������
	public static void printArr(int []arr){
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+",");
		System.out.println(arr[arr.length-1]);
	}
	
	//��ȡ���ֵ
	public static int getMax(int []arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	//��ȡ��Сֵ
	public static int getMin(int []arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
}
