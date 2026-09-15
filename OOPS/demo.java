package OOPS;

// Object Oriented Programming 
 

class Calculator
{
   int a;

   public int add(int n1, int n2,int n3)
   {
      int r = n1+n2+n3;
      return r;
   }

}

public class demo {
   public static void main(String a[])
   {
      int num1=4;
      int num2=5;
      int num3=6;

      Calculator calc=new Calculator();
      int res = calc.add(num1,num2,num3);
      System.out.println(res);
   }
}
