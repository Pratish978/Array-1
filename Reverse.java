public class Reverse {
    
    public static void reverse(int num[]) {
        int first=0 , last= num.length-1; 

        while(first<last){
            // Logic for Swapping
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            // Move pointers
            first++;// index 0 to 1
            last--;//index 4 to 3

        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        reverse(num);


    }
}
