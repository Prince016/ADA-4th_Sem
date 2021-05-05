package Sorting;

public class BubbleSortAlgo {

    public int[] BubbleSort(int[] arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }


    public  static void main(String[] args){
        BubbleSortAlgo obj = new BubbleSortAlgo();
        int arr[]={2,6,4,8,5,3};


        System.out.println(" Originall array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        System.out.println(" After the Bubble Sort ");
        int bubble[]=obj.BubbleSort(arr);
        for(int i=0;i<bubble.length;i++){
            System.out.print(bubble[i]+" ");
        }
        System.out.println(" ");


//




    }
}
