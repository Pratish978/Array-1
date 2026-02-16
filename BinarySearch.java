//Time complexity:-O(Logn)

import java.util.*;

public class BinarySearch {

    public static int Binary(int num[],int key){
        int start=0, end=num.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(num[mid] == key){
                return mid;
            }
            if(num[mid]<key){
                start = mid + 1;
            }else{
                end= mid- 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=10;

        System.out.println("Index for Key is :" + Binary(num, key));
    }
}


//Time complexity :-

/*
Iteration 1:-n      n/2 power 0
Iteration 2:-n/2    n/2 power 1
Iteration 3:-n/4    n/2 power 2
Iteration 4:-n/8    n/2 power 3
          .
          .
          .
          .
Iteration nth:-n/n  n/2 power k=1 . n=2 powerK  
                    k=log n
*/