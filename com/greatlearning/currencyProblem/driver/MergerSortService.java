package com.greatlearning.currencyProblem.driver;

public class MergerSortService {

    private void merge(Integer Arr[], int start, int mid, int end) {

        Integer temp[] = new Integer[end - start + 1];
        int i = start, j = mid+1, k = 0;

        while(i <= mid && j <= end) {
            if(Arr[i] >= Arr[j]) {
                temp[k] = Arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = Arr[j];
                k += 1; j += 1;
            }
        }

        while(i <= mid) {
            temp[k] = Arr[i];
            k += 1; i += 1;
        }

        while(j <= end) {
            temp[k] = Arr[j];
            k += 1; j += 1;
        }

        for(i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
    }

    public void mergeSort(Integer Arr[], int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid+1, end);
            merge(Arr, start, mid, end);
        }
    }
}
