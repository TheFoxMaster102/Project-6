package Proj6;

import java.util.Arrays;

public class sort {
static public int[] original;
protected int[] temporary;
public void reset(int[] list)
{
original=list;
temporary=Arrays.copyOf(original, original.length);	
}
public void reset()
{
temporary=Arrays.copyOf(original, original.length);	
}
public sort(int[] list)
{
reset(list);	
}
public sort()
{
reset();	
}
public sort(int i)
{
	reset(sortingcomp.DataS(i));
}
public int[] sorts()
{
return temporary;	
}
public String toString()
{
	String output="";
	for(int i:temporary)
	{output+=i+", ";}
	return output;
}
}
