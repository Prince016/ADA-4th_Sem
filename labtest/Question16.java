

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'A','B','C','D','E','F'};
        System.out.println("Enter index you want to find sibling for? : ");
        int index = sc.nextInt();
        while (index < 0 || index >= arr.length){
            if (index < 0 || index >= arr.length){
                System.out.println("Index "+ index + " not present");
            }
            System.out.println("Enter index you want to find sibling for? : ");
            index = sc.nextInt();
        }
        Question16 question16 = new Question16();
        question16.findAncestors(index,arr);
    }

    public void findAncestors(int i, char[] arr){
        int index = i;
        while (index != 0){
            if (index / 2 != 0){
                index = (index - 1) / 2;
                System.out.println("Ancestor is: "+arr[index]);
            }
            else {
                index = (index - 2) / 2;
                System.out.println("Ancestor is: "+arr[index]);
            }
        }
    }

}