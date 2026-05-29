import java.util.*;

class SumOfElements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
     }
     int sum =0;
     for(int i=0;i<size;i++){
         if(arr[i]%3==0){
            sum+=arr[i];
        }
    }
      System.out.println("sum of elements divisible by 3 is :"+ sum);
        
      
        sc.close();

    }
}
