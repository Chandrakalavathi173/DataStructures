
public class BubbleSort {
	public void bubbleSort() {
		int[] arr= {64,25,22,12,11};
		int len=arr.length;
		for(int i=len-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		bs.bubbleSort();
	}
}
