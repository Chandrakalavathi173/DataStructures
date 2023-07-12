
public class BinarySearch {
	public void binarySearch() {
		int[] arr= {1,3,5,8,12,45,89};
		int search=89;
		int len=arr.length;
		int start=0;
		int end=len-1;
		int mid;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==search) {
				System.out.println("value "+search+" found at "+(mid+1)+" position");
				break;
			}
			else if(search<arr[mid]) {
				end=mid-1;
			}
			else if(search>arr[mid]) {
				start=mid+1;
			}
			else {
				System.out.println("Value "+search+"not found");
			}
		}
	}
	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
		bs.binarySearch();
	}
}
