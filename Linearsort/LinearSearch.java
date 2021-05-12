package Sorting;


public class LinearSearch {
    static class infoKey{
        Integer index;
        boolean found;

        infoKey(Integer index, boolean found){
            this.index = index;
            this.found = found;
            System.out.println("Key found: "+ found);
            System.out.println("Index is: "+ index);
        }
    }

    public infoKey linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return new infoKey(i,true);
            }
        }
        return new infoKey(-1,false);
    }
    public static void main(String a[]){
        int[] a1= {3,6,8,12,14,17,25,29,31,36,42,47,53,55};
        int key = 50;
        float startTime = System.nanoTime();
        new LinearSearch().linearSearch(a1,29);
        float endTime = System.nanoTime();
        System.out.println("Time taken is "+(endTime-startTime)+" ns");
    }
}