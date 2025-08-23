package Proj6;

import java.util.Arrays;

public class mergesort extends sort {
public mergesort()
{super();}

public int[] sorts() {
    return mergeSort(temporary);
}

private int[] mergeSort(int[] array) {
    if (array.length <= 1) {
        return array;
    }

    int mid = array.length / 2;

    int[] left = Arrays.copyOfRange(array, 0, mid);
    int[] right = Arrays.copyOfRange(array, mid, array.length);

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
}

private int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            result[k++] = left[i++];
        } else {
            result[k++] = right[j++];
        }
    }

    while (i < left.length) {
        result[k++] = left[i++];
    }

    while (j < right.length) {
        result[k++] = right[j++];
    }

    return result;
}
}
