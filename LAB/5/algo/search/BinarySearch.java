package algo.search;
public class BinarySearch
{
	public void Binary(int array[],int n,int key)
	{
		int first,last,middle,search;
		search=key;
		first=0;
		last=n-1;
		middle=(first+last)/2;
		while(first<=last)
		{
			if(array[middle]<search)
			{
				first=middle+1;
				middle=(last+first)/2;
			}
			else if(array[middle] == search)
			{
				System.out.println("\n"+search+" found at location "+(middle+1)+ " using binary search ");
				break;
			}
			else {
				last=middle-1;
				middle=(last+first)/2;
			}
		if(first>last)
			System.out.println(search+" is not present in the list\n");
		}
	}
}