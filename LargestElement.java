class LargestElement
{
	public static void main(String[]args)
	{
		int[]arr=new int[] {1,45,7,58,1,7,89,45,45,91};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			max=arr[i];
		}
	System.out.println("Largest element in array:"+max);
	}
}