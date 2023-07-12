
public class SelectionSort {
	public void selectionSort() {
		int[] arr= {64,25,22,12,11};
		int len=arr.length;
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
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		SelectionSort ss=new SelectionSort();
		ss.selectionSort();
		
		
	}
}
