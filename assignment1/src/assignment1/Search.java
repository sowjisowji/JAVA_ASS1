package assignment1;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int ele=19;
		int ind=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				ind=i;
				break;
			}
		}
		if(ind!=-1)
		{
			System.out.println(ele+"found at index"+ind);
		}
		else
		{
			System.out.println("element not found");
		}
	}

}
