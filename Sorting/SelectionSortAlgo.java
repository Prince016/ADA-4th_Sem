package Sorting;

public class SelectionSortAlgo {





    public int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int val = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[val])
                    val = j;
            int temp = arr[val];
            arr[val] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }


    public  static void main(String[] args){
        SelectionSortAlgo obj = new SelectionSortAlgo();
        int arr[]={2,6,4,8,5,3};


        System.out.println(" Originall array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");


        System.out.println(" After the Selection  Sort ");
        int selection[]=obj.selectionSort(arr);
        for(int i=0;i<selection.length;i++){
            System.out.print(selection[i]+" ");
        }




    }
}
