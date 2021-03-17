package Sorting;

import java.util.Random;

public class HeapSort {

    public void sort(int arr[])
    {
        int n = arr.length;


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);


        for (int i=n-1; i>=0; i--)
        {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        HeapSort ob = new HeapSort();

        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = rd.nextInt(1000);

        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++)
            arr1[i] = i;

        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++)
            arr2[i] = (100-i);

        int[] arr3 = new int[10];
        for (int i = 0; i < 10; i++)
            arr3[i] = 7;

        System.out.println("\nSorted  Random array");

        printArray(arr);

        long startTime = System.nanoTime();
        ob.sort(arr);
        long endTime = System.nanoTime();
        long Dur = (endTime - startTime);
        System.out.println("Time taken :-  " + Dur);
        printArray(arr);




        System.out.println("\n Sorted Ascending array");
        System.out.println("");
        printArray(arr1);
        long startTime1 = System.nanoTime();
        ob.sort(arr1);
        long endTime1 = System.nanoTime();
        long Dur1 = (endTime1 - startTime1);
        System.out.println("Time taken :-  " + Dur1);
        printArray(arr1);



        System.out.println("\nSorted  Descending array");
        System.out.println("");
        printArray(arr2);
        long startTime2 = System.nanoTime();
        ob.sort(arr2);
        long endTime2 = System.nanoTime();
        long Dur2 = (endTime2 - startTime2);
        System.out.println("Time taken :-  " + Dur2);
        printArray(arr2);



        System.out.println("\nSorted  same no. array");
        System.out.println("");
        printArray(arr3);
        long startTime3 = System.nanoTime();
        ob.sort(arr3);
        long endTime3 = System.nanoTime();
        long Dur3 = (endTime3 - startTime3);
        System.out.println("Time taken :-  " + Dur3);
        printArray(arr3);

    }
}
