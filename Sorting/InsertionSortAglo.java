package Sorting;

public class InsertionSortAglo {




    public int[] InsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && temp <= arr[j]) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = temp;
            }

        }
        return arr;
    }



    public  static void main(String[] args){
        InsertionSortAglo obj = new InsertionSortAglo();
        int arr[]={2,6,4,8,5,3};


        System.out.println(" Originall array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");



        System.out.println(" After the Insertion  Sort ");
        int insertion[]=obj.InsertionSort(arr);
        for(int i=0;i<insertion.length;i++){
            System.out.print(insertion[i]+" ");
        }
        System.out.println(" ");




    }

}
