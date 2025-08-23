package Proj6;
import java.util.ArrayList;

public class sortingcomp {
    public static void main(String[] args) {
        ArrayList<sort> types = new ArrayList<sort>();
        Long Start, average;
        sort idk;
        
        int[] lengths = {100, 500, 1000, 5000, 10000, 50000, 100000,500000, 1000000 };
        int[][] lists= new int[lengths.length][];
        for(int i=0; i<lengths.length; i++)
        {
        	lists[i]=DataS(lengths[i]);
        }
        idk = new sort(1);
        types.add(new heapsort());
        types.add(new quicksort());
        types.add(new mergesort());
        types.add(new insertionsort());
        types.add(new selectionsort());
        types.add(new bubblesort());
        
        

        // Print header
        System.out.printf("%-15s", "Algorithm");
        for (int a : lengths) {
            System.out.printf("%12d", a);
        }
        System.out.println();
        System.out.println("-".repeat(15 + lengths.length * 12));

        // Outer loop: algorithms
        for (sort i : types) {
            System.out.printf("%-15s", i.getClass().getSimpleName());
            for (int[] a : lists) {
                    idk = new sort(a);
                    i.reset();
                    Start = System.nanoTime();
                    i.sorts();
                    average = System.nanoTime() - Start;
                System.out.printf("%12d", average/1000000);
            }
            System.out.println();
        }
    }

    public static int[] DataS(int n) {
        int[] List = new int[n];
        for (int i = 0; i < n; i++) {
            List[i] = (int) (((Math.random() - 0.5) * 2) * Integer.MAX_VALUE);
        }
        return List;
    }
}
