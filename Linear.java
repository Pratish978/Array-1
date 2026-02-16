//Time complexity :- O(n) Because loop checks every number.

public class Linear {

    public static int LinearSearch(int num[],int keys){

        for(int i=0;i<=num.length;i++){
            if(num[i]==keys)
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        int keys=5;

        int index=LinearSearch(num, keys);
        if(index == -1){
        System.out.println();
        }else{
            System.out.println("Key is at : " + index);
        }
    }
}
