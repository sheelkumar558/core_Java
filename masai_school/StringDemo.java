//1. example
// class StringDemo {
//    public static void main(String[] args){
//     // String can be declared  two types
//     //1. String Literal - Storedin string pool (PermGen Area)
//     String s="mystring";
//     String s1="anoterstring";
//     String s2="anoterstring";
//     // == campares the momory addresses of two object, returns true if they the some address
//     System.out.println(s1==s2);
//     System.out.println(s1==s);
//     //2. String using new operater
//     String s3=new String("three");
//     String s4=new String("three");
//     System.out.println(s3==s4);
//    }
// }

//2. ex

class StringDemo {
   public static void main(String[] args){
    String s1="one";
    String s2="two";
    String s3="three";
    String s4="0123456789";
    String s5="0123456789";
    String s6=new String("0123456789");
    System.out.println(s1+s2+s3);
   s1.length();
   s4.charAt(4);
   s4.substring(4);
   s4.substring(4,6);
   s4.equals(s5);
   s4.equals(s6);
   //s4.equalsIgnoreCase(s6);
   //trim()
   //s1.toLowerCase()
   //replace
   //split  s="a,b,c"; s.split(",")
   //s7=s5.toCharArray();
   //string are immutable
   }
}