package Sorting;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class knapnsap_Problem {


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

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }





    private static double higestVal(int[] wt, int[] val, int capacity)
        {
            Value[] iVal = new Value[wt.length];

            for (int i = 0; i < wt.length; i++) {
                iVal[i] = new Value(wt[i], val[i], i);
            }

            Arrays.sort(iVal, new Comparator<Value>() {
                @Override
                public int compare(Value o1, Value o2)
                {
                    return o2.cost.compareTo(o1.cost);
                }
            });


//            sort(iVal);

            double finalValue = 0d;

            for (Value i : iVal) {

                int currentweight = (int)i.wt;
                int currentprofit = (int)i.val;

                if (capacity - currentweight >= 0) {
                    capacity = capacity - currentweight;
                    finalValue += currentprofit;
                }
                else {
                    double fraction = ((double)capacity / (double)currentweight);
                    finalValue += (currentprofit * fraction);
                    capacity = (int)(capacity - (currentweight * fraction));
                    break;
                }
            }

            return finalValue;
        }


        public static class Value {
            Double cost;
            double wt, val, ind;

            public Value(int wt, int val, int ind)
            {
                this.wt = wt;
                this.val = val;
                this.ind = ind;
                cost = new Double((double)val / (double)wt);
            }
        }

        public static void main(String[] args)
        {
            knapnsap_Problem ob = new knapnsap_Problem();

            Scanner sc = new Scanner(System.in);

            System.out.println(" Enter the no of items :-> ");
            int items_no=sc.nextInt();

            System.out.println("Enter capacity  :->  ");
            int capacity = sc.nextInt();




            Random rd = new Random();
            int[] weight = new int[items_no];

            int wt=weight.length;
            for (int i = 0; i < wt; i++)
                weight[i] = rd.nextInt(100);



            int[] benefit = new int[items_no];
            int pf = benefit.length;
            for (int i = 0; i < pf; i++)
                benefit[i] = rd.nextInt(1000);

            System.out.println(" Weight are :-> ");
            for (int i = 0; i < wt; i++)
                System.out.print(weight[i]+" ");

            System.out.println("\n Profits  are :-> ");
            for (int i = 0; i < pf; i++)
                System.out.print(benefit[i]+" ");
//





            double maxprofit = higestVal(weight, benefit, capacity);

            System.out.println("\nMaximum benefit is :-> " );
            System.out.print(String.format("%.3f",maxprofit));
        }
    }




