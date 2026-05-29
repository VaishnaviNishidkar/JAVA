import java.util.*;


//find elements greater than 5 & less than 9
class CompareElements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
             
     }
        
    for(int i=0;i<size;i++){
        if(arr[i]>5&&arr[i]<9){
        System.out.println(arr[i] +" is greater than 5 & less than 9 ");
        }
    }

   
           
        }
        }
    


  
     
   

    
