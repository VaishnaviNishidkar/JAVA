

import java.util.*;

class EmployeeAges{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter count of employess: ");
        int count =sc.nextInt();

        int emp[]=new int[count];

        System.out.println("enter employee age :");
        for(int i=0;i<count;i++)
        {
            emp[i]=sc.nextInt();

        }
        System.out.println("employee ages are :");
        for(int i=0;i<count;i++){
            System.out.println(emp[i]+ "");
        }
    }
}
