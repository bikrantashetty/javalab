import algo.search.*;
import algo.sort.*;
class Sort extends Thread
{
	String str;
	
	Sort(int i){
		if(i==1)
			str="Bub";
		else
			str="Sel";
	}
	
	public void run()
	{
		int arr[]={5,3,1,6,4};
		int arr1[]={23,45,12,10,53};
		int array[];
		int n=5;
		
		if (str.equals("Bub"))
		{
			BubbleSort b = new BubbleSort();
			array = b.Bubble(arr1,n);
			for(int i=0;i<array.length;i++)
				System.out.println(array[i]);
		}
		
		else
		{
			SelectionSort s=new SelectionSort();
			array=s.Selection(arr, n);
			for(int i=0;i<array.length;i++)
				System.out.println(array[i]);
		}
	}
}

class Search extends Thread
{
	public void run()
	{
		int arr[]={15,24,34,12,13};
		int array[];
		int n=5,key=34;
		BubbleSort b= new BubbleSort();
		array=b.Bubble(arr,n);
		BinarySearch bs= new BinarySearch();
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		bs.Binary(array,n,key);
	}
}

public class Five
{
	public static void main(String args[])
	{
		Sort s1=new Sort(1);
		Sort s2=new Sort(2);
		s1.run();
		s2.run();
		Search s3= new Search();
		s3.run();
	}
}