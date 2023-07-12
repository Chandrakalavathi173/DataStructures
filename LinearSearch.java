
public class LinearSearch {
	public void linearSearch() {
		int arr[] = {1,8,2,10,15,5};
		int search=15;
		int temp=0;
		System.out.println("Array Length: "+arr.length);
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				temp=-1;
				System.out.println("found "+arr[i]+" at "+(i+1)+" position");
			}
		}
		if(temp!=-1)
			System.out.println("Did not find the value: "+search);
	}
	public static void main(String[] args) {
		LinearSearch ls=new LinearSearch();
		ls.linearSearch();
	}
}
