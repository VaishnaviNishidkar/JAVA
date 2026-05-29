import java.util.*;

class Sumelements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
             
     }
          int oddprod=1;
          int evenprod=1;

    for(int i=0;i<size;i++){
        if (i%2==1){
            oddprod*=arr[i];
            }

        else{
            evenprod*=arr[i];
        }
        }
           int sum = oddprod+evenprod;
           System.out.println("Product of odd & even indexed element is :"+ sum); 

    }

  
     
   

    }

