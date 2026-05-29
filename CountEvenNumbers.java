import java.util.*;

class CountEvenNumbers{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int count=0;

        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();

            if(arr[i]%2==0){
                count++;
            }

        }
        System.out.println("Count of even numbers in the array is: " + count);
        
      
        sc.close();

    }
}
