package dsa;

import java.util.Scanner;

public class b_search {

    public static int bsearch(int a[], int search){
        int start = 0,end = a.length;
        while(start<=end){
            int mid = (end-start)/2;
            if(a[mid] == search){
                return mid;
            } else if (a[mid] > search) {
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the ise of array: ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter a intiger of "+size);
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter number to be search : ");
        int search;
        search = sc.nextInt();;

        System.out.println(bsearch(a,10));

    }
}
