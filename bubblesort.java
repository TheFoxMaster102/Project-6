package Proj6;

public class bubblesort extends sort {
public bubblesort(){
	super();
}
public int[] sorts() {
	int max,temp;
	for(int i=0; i<temporary.length; i++)
	{ max=0;
		for(int j=0; j<temporary.length-i; j++)
		{
			if(temporary[max]<=temporary[j])
			{
				max=j;
			}
		}
	for(int j=max; j<temporary.length-i-1;j++)
	{
		temp=temporary[j];
		temporary[j]=temporary[j+1];
		temporary[j+1]=temp;
	}
	}
	return temporary;
}
}
