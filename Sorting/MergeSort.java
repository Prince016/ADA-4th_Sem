package Sorting;
import java.util.Random;

public class MergeSort
{

    void mergesort(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            mergesort(arr, l, m, r);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        MergeSort ob = new MergeSort();

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

//


                    System.out.println("\nSorted  Random array");
                    //        System.out.println("Given Array");
                    printArray(arr);

                    long startTime = System.nanoTime();
                    ob.sort(arr, 0, arr.length - 1);
                    long endTime = System.nanoTime();
                    long Dur = (endTime - startTime);
                    System.out.println("Time taken :-  " + Dur);
                    printArray(arr);


                    System.out.println("\n Sorted Ascending array");
                    System.out.println("");
                    printArray(arr1);
                    long startTime1 = System.nanoTime();
                    ob.sort(arr1, 0, arr1.length - 1);
                    long endTime1 = System.nanoTime();
                    long Dur1 = (endTime1 - startTime1);
                    System.out.println("Time taken :-  " + Dur1);
                    printArray(arr1);


                    System.out.println("\nSorted  Descending array");
                    System.out.println("");
                    printArray(arr2);
                    long startTime2 = System.nanoTime();
                    ob.sort(arr2, 0, arr2.length - 1);
                    long endTime2 = System.nanoTime();
                    long Dur2 = (endTime2 - startTime2);
                    System.out.println("Time taken :-  " + Dur2);
                    printArray(arr2);


                    System.out.println("\nSorted  same no. array");
                    System.out.println("");
                    printArray(arr3);
                    long startTime3 = System.nanoTime();
                    ob.sort(arr3, 0, arr3.length - 1);
                    long endTime3 = System.nanoTime();
                    long Dur3 = (endTime3 - startTime3);
                    System.out.println("Time taken :-  " + Dur3);
                    printArray(arr3);
                }
            }


