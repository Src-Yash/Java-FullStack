package OOPS;

// Object Oriented Programming 
 

// class Calculator
// {
//    int a;

//    public int add(int n1, int n2,int n3)
//    {
//       int r = n1+n2+n3;
//       return r;
//    }

// }

// public class demo {
//    public static void main(String a[])
//    {
//       int num1=4;
//       int num2=5;
//       int num3=6;

//       Calculator calc=new Calculator();
//       int res = calc.add(num1,num2,num3);
//       System.out.println(res);
//    }
// }

// class nums{
//    public int arr{
//       return 0;
//    }
// }

// public class demo{
//    public static void main(String a[]){
//       int nums[]=new int[4];
//       nums[0]=6;
//       nums[1]=3;
//       nums[2]=4;
//       nums[3]=5;
//       for(int i=0;i<=3;i++){
//          System.err.println(nums[i]);
//       }

//    }
// }



public class demo{
   public static void main(String a[]){
      int nums[][]=new int[5][3];  // multi dimensional array
      for(int i=0;i<5;i++){
         for(int j=0;j<3;j++){
            nums[i][j]=(int)(Math.random()*10);  // one decimal random number generate krta hai 

         }
          
      }
      for(int i=0;i<5;i++){
         for(int j=0;j<3;j++){
            System.out.print(nums[i][j]+" ");
         }
         System.out.println(); 
      }

      //  Jagged array

      int num[][]=new int[3][];
      num[0]=new int[3];
      num[1]=new int[4];
      num[2]=new int[2];
      // for each loop
      for(int i=0;i<num.length;i++){
         for(int j=0;j<num[i].length;j++){
            num[i][j]=(int)(Math.random()*100);
         }
      }

      for(int n[]:num){
         for(int m:n){
            System.out.print(m+" ");
         }
         System.out.println();
      }

   }
}

