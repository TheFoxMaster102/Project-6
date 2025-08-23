package Proj6;

public class insertionsort extends sort {
public insertionsort()
{
	super();
}
public int[] sorts() {
	for (int i = 1; i < temporary.length; i++) {
        int current = temporary[i];
        int temp = i - 1;

        while (temp >= 0 && temporary[temp] > current) {
            temporary[temp + 1] = temporary[temp];
            temp--;
        }
        temporary[temp + 1] = current;
    }

    return temporary;
}
}
