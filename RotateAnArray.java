import java.util.Scanner;
public class RotateAnArray {
	public void rotateLeft(int arr[],int rotations) {
		int len=arr.length;
		int[] arrleft=new int[len];
		for(int i=0;i<len;i++) {
			int newindex=(i+rotations)%len;
			arrleft[i]=arr[newindex];
		}
		for(int i=0;i<len;i++)
		System.out.print(arrleft[i]+" ");
	}
	public void rotateRight(int arr[],int rotations) {
		int len=arr.length;
		int[] arrright=new int[len];
		for(int i=0;i<len;i++) {
			int newindex=(i+len-rotations)%len;
			arrright[i]=arr[newindex];
		}
		for(int i=0;i<len;i++)
		System.out.print(arrright[i]+" ");
	}
	
	public static void main(String[] args) {
		RotateAnArray rotate=new RotateAnArray();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
			int rotations=sc.nextInt();
			rotate.rotateLeft(arr,rotations);
			System.out.println();
			rotate.rotateRight(arr,rotations);
		}
	}
}
