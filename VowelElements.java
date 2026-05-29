import java.util.*;

class Vowelelements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter characters of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
             
     }
          
    
     for(int i=0;i<size;i++){
        if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
            System.out.println("vowel " + (char)arr[i] + " is found at index " + i);
        }
    }
     
    }
}
