package algo.sort;
public class BubbleSort
{
	public int[] Bubble(int arr[], int n)
	{
		int temp=0;int i;
		for(i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				}
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{	
		e.printStackTrace();
		}
		System.out.println("Sorting using Bubble Sort");
		return arr;
	}
}