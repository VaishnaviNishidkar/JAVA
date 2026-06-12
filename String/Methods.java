class String{
public static void main(String[] args)[
//concat method
  String str1="Shyam";
  String sttr2="Ram";

  System.out.println(str1);   //Shyam
  System.out.println(str2);   //Rathi

  str1.concat(str2);      //ShyamRathi


  System.out.println(str1); //Shyam
  System.out.println(str2); //Rathi

//length - return no of characters contained in specific string 
    System.out.println(str1.length); //5
    System.out.println(str2.length); //5


//charAt- retur char located at specified index within given string

    System.out.println(str1.charat(3); //a
    System.out.println(str1.charAt(6); // Runtime error String index out of bound

//compareTo- compare str1 & str2 if both strings are equal ,it returns 0 otherwise returns comparison
  System.out.println(str1.compareTo(str2);  //0


//equals 
  String str3="Rahul";
  String sttr4=new String("Rahul");
 System.out.println(str1.equals(str2);  //true
//what is difference bwtn equals method & == operator
//equals method-> check content
//== operator -> check address

}
}
