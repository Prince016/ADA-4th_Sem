package Sorting;

public class BinarSearch {


    public static void main(String[] args) {
//                            0 1 2 3  4  5  6  7  8  9  10 11 12 13
        int[] arr = new int[]{3,6,8,12,14,17,25,29,31,36,42,47,53,55};
        int key = 100;
        System.out.println(recursiveSearch(arr,key,0, arr.length-1));
    }

    public static int recursiveSearch(int[] arr,int key,int low,int high){
        int mid = (low + high) / 2;
        if (key == arr[mid]){
            return mid;
        }
        else if (key > arr[mid]){
            if (low == high){
                return -1;
            }
            low = mid + 1;
            mid = (low + high) / 2;
            return recursiveSearch(arr,key,low,high);
        }
        else {
            if (low == high){
                return -1;
            }
            high = mid - 1;
            mid = (low + high) / 2;
            return recursiveSearch(arr, key, low, high);
        }
    }
}