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


//indexOf- find 1st instance of character inn given string, if character isnt present in given string it return -1

 System.out.println(str1.indexOf(y); //2
 System.out.println(str1.indexOf('a',1); //3

//Replace- replace every instance of char in given string with new char
  String str="Ashish";
 System.out.println(str.replace('s','x'); //Axhixh

//substring- create substring of given string starting at specific index & ending at 1 cchar b4 specific index
 System.out.println(str.substring(2));  // hish
   System.out.println(str.substring(2,5));  //his

//Trim-trims all whitespaces before & after string
  String str5="           Radha        ";
  System.out.println(str5.trim());      //Radha 


//toUpperCase(),toLowerCase()
  String str6= "VEDANT";
  String str7="yuvanshi";
   System.out.println(str.toLowerCase());  //vedant
  System.out.println(str.toUpperCase());  //YUVANSHI


}
}
