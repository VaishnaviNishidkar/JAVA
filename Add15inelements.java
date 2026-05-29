import java.util.*;



class Add15inelements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();


        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
             
     }
      System.out.println("________________");  
    
    for(int i=0;i<size;i++){
        arr[i]+=15;
         System.out.println(arr[i]);
    }
   
}
}
    


  
     
   

    
