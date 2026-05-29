import java.util.*;

class Searchelements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
             
     }
          
    
    
        System.out.println("Enter element to be searched: ");
        int key = sc.nextInt();

    for(int i=0;i<size;i++){
        if (key==arr[i]){
            System.out.println("Element is found at index: " + i);
        }
            }
    }
     
    }

