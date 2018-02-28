package Day01;
/**
 * 
 * @author Administrator
 *需求：实现数组相关功能
 *思路：
 *步骤：
 */
public class ArrayTest {
	public static void main(String[] args) {
//		int arr[]={2,3,4,5,3,2,1,77,331,41,3};
//		printArr(arr);
//		System.out.println("数组最大值："+getMax(arr));
//		System.out.println("数组最小值："+getMin(arr));
//		printArr(selectSort(arr)); //输出选择排序后的结果
//		printArr(BubbleSort(arr)); //输出冒泡排序后的结果
		int arr2[]={2,12,34,53,144,234,237,344,4451,8652};
		System.out.println(halfSearch(arr2, 34));
		System.out.println(halfSearch(arr2, 39));
	}
	//折半查找、二分查找
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
	
	//数组元素的交换
	public static void swap(int []arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	//冒泡排序
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
	
	//选择排序
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
	
	//遍历数组
	public static void printArr(int []arr){
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+",");
		System.out.println(arr[arr.length-1]);
	}
	
	//获取最大值
	public static int getMax(int []arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	//获取最小值
	public static int getMin(int []arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
}
