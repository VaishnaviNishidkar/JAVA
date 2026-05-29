import java.util.*;


/*even -alternate
odd=whole */
class EvenOddElements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
             
     }
     if (size%2==0)
         
    for(int i=0;i<size;i++){
     System.out.println(arr[i++]);

    }

    else{
        for(int i=0;i<size;i++){
        System.out.println("Alternate elements are : " +arr[i]);

    }
           
        }
        }
          
    }

  
     
   

    
