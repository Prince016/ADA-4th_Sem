package Sorting;

import java.util.Random;

public class QuickSort {

   static int count=0;
    int partition(int arr[], int first, int end)
    {
        int pivot = arr[end];
        int i = (first-1);
        for (int j=first; j<end; j++)
        {

            if (arr[j] < pivot)
            {
                i++;
               int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    void sort(int arr[], int first, int end)
     {

        if (first < end)
        {
            int b = partition(arr, first, end);


            sort(arr, first, b-1);
            sort(arr, b+1, end);

        }
         count++;
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        QuickSort ob = new QuickSort();

        Random rd = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++)
            arr[i] = rd.nextInt(1000);

        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++)
            arr1[i] = i;

        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++)
            arr2[i] = (100-i);

        int[] arr3 = new int[100];
        for (int i = 0; i < 100; i++)
            arr3[i] = 7;

        System.out.println("\nSorted  Random array");

        printArray(arr);

        long startTime = System.nanoTime();
        ob.sort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        long Dur = (endTime - startTime);
        System.out.println("Time taken :-  " + Dur);
        printArray(arr);

        System.out.println("Recursive calls :-> "+ob.count);
        count=0;


        System.out.println("\n Sorted Ascending array");
        System.out.println("");
        printArray(arr1);
        long startTime1 = System.nanoTime();
        ob.sort(arr1, 0, arr1.length - 1);
        long endTime1 = System.nanoTime();
        long Dur1 = (endTime1 - startTime1);
        System.out.println("Time taken :-  " + Dur1);
        printArray(arr1);
        System.out.println("Recursive calls :-> "+ob.count);
        count=0;


        System.out.println("\nSorted  Descending array");
        System.out.println("");
        printArray(arr2);
        long startTime2 = System.nanoTime();
        ob.sort(arr2, 0, arr2.length - 1);
        long endTime2 = System.nanoTime();
        long Dur2 = (endTime2 - startTime2);
        System.out.println("Time taken :-  " + Dur2);
        printArray(arr2);
        System.out.println("Recursive calls :-> "+ob.count);
        count=0;


        System.out.println("\nSorted  same no. array");
        System.out.println("");
        printArray(arr3);
        long startTime3 = System.nanoTime();
        ob.sort(arr3, 0, arr3.length - 1);
        long endTime3 = System.nanoTime();
        long Dur3 = (endTime3 - startTime3);
        System.out.println("Time taken :-  " + Dur3);
        printArray(arr3);
        System.out.println("Recursive calls :-> "+ob.count);
        count=0;
    }
}






