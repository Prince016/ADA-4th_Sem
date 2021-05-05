package Sorting;



    import java.util.Arrays;

    public class Insertion {
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
            Insertion obj = new Insertion();
            int arr[]={2,6,4,8,5,3};


            System.out.println(" Originall array ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");

            System.out.println(" After the Bubble Sort ");
            int bubble[]=obj.selectionSort(arr);
            for(int i=0;i<bubble.length;i++){
                System.out.print(bubble[i]+" ");
            }
            System.out.println(" ");


            System.out.println(" After the Insertion  Sort ");
            int insertion[]=obj.selectionSort(arr);
            for(int i=0;i<insertion.length;i++){
                System.out.print(insertion[i]+" ");
            }
            System.out.println(" ");

            System.out.println(" After the Selection  Sort ");
            int selection[]=obj.selectionSort(arr);
            for(int i=0;i<selection.length;i++){
                System.out.print(selection[i]+" ");
            }



//
//        System.out.println(Arrays.toString(obj.selectionSort(arr)));
//        System.out.println(Arrays.toString(obj.InsertionSort(arr)));
//        System.out.println(Arrays.toString(obj.BubbleSort(arr)));



        }
    }




