import java.util.*;

class SumOddIndexedelements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
             
     }
          int oddsum=0;

    for(int i=0;i<size;i++){
        if (i%2==1){
            oddsum+=arr[i];
            }
        }
            System.out.println("sum of odd indexed elements is : " + oddsum);
    }
     
    }

