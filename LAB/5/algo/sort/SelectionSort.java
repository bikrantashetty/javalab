package algo.sort;
public class SelectionSort
{
	public int[] Selection(int arr[],int n)
	{
		int i;
		for(i=0;i<n-1;i++)
		{
			int index=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[index])
					index=j;
			int smallernumber = arr[index];
			arr[index]= arr[i];
			arr[i] = smallernumber;
			try{
				Thread.sleep(1000);
				}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Sorting using Selection Sort");
	return arr;
	}
}