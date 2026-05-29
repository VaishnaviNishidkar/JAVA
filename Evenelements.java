import java.util.*;

class Evenelements{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size=sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements of an array :");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println(" elements of an array are  :");
        for (int i=0;i<size;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("even elemets of array are :");
        for (int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();

    }
}
