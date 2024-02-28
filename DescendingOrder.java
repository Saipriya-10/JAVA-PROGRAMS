import java.util.*;
public class DescendingOrder 
{
	public static void main(String[] args)
	{
		int array[] = { 1, 2, 3, 7, 5, 16 };
		Arrays.sort(array);
		reverse(array);
		System.out.println(Arrays.toString(array));
	}
	public static void reverse(int[] array)
	{
	int n = array.length;
	for (int i = 0; i < n / 2; i++)
	{
		int temp = array[i];
		array[i] = array[n - i - 1];
		array[n - i - 1] = temp;
	}
   }
}