import java.util.Scanner;
public class SecondLargest {
	public void secondLargest(int arr[],int len) {
		for(int i=0;i<=len-2;i++) {
			int min=i;
			for(int j=i;j<=len-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		System.out.print("Second Largest element "+arr[len-2]);
	}
	public static void main(String [] args) {
		SecondLargest sl=new SecondLargest();
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		sl.secondLargest(arr,len);
	}
}
