//Time complexity :- O(n) Because loop checks every number.

import java.util.*;

public class Largest {

    public static int Large(int num[]){   
        int largest=Integer.MIN_VALUE;// -Infinity
        int Smallest=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(Smallest > num[i]){
                Smallest = num[i];
            }
        }

        System.out.println("Smallest value is : " + Smallest);
        return largest;

    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};

        System.out.println("Largest Value is :"+ Large(num));
        
    }
}
