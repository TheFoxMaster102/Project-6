package Proj6;

public class selectionsort extends sort {
public selectionsort()
{
	super();
}
public int[] sorts() {
	int min,temp;
	for(int i=0; i<temporary.length; i++)
	{
		min=i;
		for(int j=i; j<temporary.length; j++)
		{
			if(temporary[min]>temporary[j])
			{min=j;}
		}
		temp=temporary[min];
		temporary[min]=temporary[i];
		temporary[i]=temp;
	}
	return temporary;
}
}

