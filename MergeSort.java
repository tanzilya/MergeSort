package com.example.tanzilyayakshimbetova.javatest;

public class MergeSort {

    public void mergeSortOfArray(int[] A, int start, int end) {
        if (start < end) {
            int middle = (start+end)/2;
            mergeSortOfArray(A, start, middle);
            mergeSortOfArray(A, middle+1, end);
            merge(A, start, middle, end);
        }
    }

    public void merge(int[] A, int start, int middle, int end) {
        int n1 = middle - start + 1 ;
        int n2 = end - middle;
        int[] left = new int [n1+1];
        int[] right = new int [n2+1];
        for (int i = 0; i < n1; i++) {
            left[i] = A[start + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = A[middle+i+1];
        }
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;
        int indexL = 0;
        int indexR = 0;
        for (int k = start; k <= end; k++) {
            if (left[indexL] <= right[indexR]) {
                A[k] = left[indexL];
                indexL++;
            }
            else {
                A[k] = right[indexR];
                indexR++;
            }
        }
    }


}
