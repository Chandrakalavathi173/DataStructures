import java.util.Scanner;
public class TwoSum {
	public int[] twoSum(int[] nums,int target) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[]{nums[i],nums[j]};

				}
			}
		}
		throw new IllegalArgumentException("No two numbers add up to the target sum");

		
	}
	public static void main(String args[]) {
		TwoSum ts=new TwoSum();
		Scanner sc=new Scanner(System.in);
		int[] nums=new int[6];
		for(int i=0;i<6;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		ts.twoSum(nums, target);
		int[] result=ts.twoSum(nums, target);
		for(int i=0;i<result.length;i++)
		System.out.print(result[i]+" ");
	}
}

