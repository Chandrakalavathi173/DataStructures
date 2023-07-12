import java.util.Scanner;
public class TrapWater {
	public int trapWater(int[] arr) {
		int totalWater=0;
		int leftMax=0,rightMax=0;
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>leftMax) {
					leftMax=arr[left];
				}
				else {
					totalWater=totalWater+(leftMax-arr[left]);
					left++;
				}
			}
			else {
				if(arr[right]>rightMax) {
					rightMax=arr[right];
				}
				else {
					totalWater+=rightMax-arr[right];
					right--;
				}
			}
		}
		return totalWater;
	}
	public static void main(String[] args) {
		TrapWater trapwater=new TrapWater();
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		int result=trapwater.trapWater(arr);
		System.out.println(result);
	}
}
