// import java.util.Scanner;
// public class default
// {
// 	public static void main(String[] args) {
//     Scanner s1=new Scanner(System.in);
//     int n =5;
//   for(int i=5;i>=1;i--){
//       for (int j=1;j<=i;j++){
//           System.out.print("  *");
//       }
//       System.out.println();
//   } 
   
   
//   import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) {
//     Scanner s1=new Scanner(System.in);
//      System.out.println(" ");
//      int m1=s1.nextInt();
//      Isprime(m1);
    //  System.out.println(fact(m1));
    //  int m2=s1.nextInt();
    // int m2=s1.nextInt();
    // int a=2*3/4+2*5%3;
    
	
// 	public static int fact(int m1){
// 	    int fact=1;
// 	    for(int i =1 ; i<=m1 ; i++){
// 	        fact*=i;
// 	    }
// 	    return fact;
// 	}


// int count=0;
//       for(int i=1;i<=m1;i++){
//           if(m1%i==0){
//               count++;
//           }                                              ////prime no
//       }
//       if (count==2){
//           System.out.println("its prime no");
//       }else{
//           System.out.println("its not prime no");
//       }

// int count=0;
//       for(int i=2;i<=m1-1;i++){
//           if(m1%i==0){
//               count++;
//                    break;
//           }                                              ////prime no
//       }                                                     ///o(n-1)
//       if (count==0){
//           System.out.println("its prime no");
//       }else{
//           System.out.println("its not prime no");
//       }
// int sum=0;
// int count=0;
//       for(int i=1;i<=m1;i++){
//           if(m1%i==0){
//               count++;
//           }  
//          ////prime no
//                                                           ///o(n/2)
//       if (count==0){
//           sum+=i;
//       }     
//       }  
//       System.out.println(sum);
// }


//   public static Boolean Isprime(int m1){
//       int count = 0;
//      for(int i=1;i<=m1;i++){
//          if (m1%i==0){
//              count++;
//          }
//      }
//          if (count==2){
//              return true;
//          }
//          else{
//              return false;
//          }
// //      } 
//   import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner s1 = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int m1 = s1.nextInt();
        
//         if (Isprime(m1)) {
//             return true;
//         } else {
//             return false;
//         }
        
//         s1.close(); // Good practice to close the scanner
//     }

//     public static boolean Isprime(int m1) {
//         int count = 0;
//         for (int i = 1; i <= m1; i++) {
//             if (m1 % i == 0) {
//                 count++;
//             }
//         }
//         return count == 2;
//     }
// }


// }
//     int a = 5;
//     int b = 10;
//     // int temp = a;
//     // a=b;
   
//     // b=temp;
// //   a=a+b;
// //   b=a-b;
// //   a=a-b;
    
   
//     System.out.println(a);
//     System.out.println(b);



/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// public class Main
// {
// 	public static void main(String[] args) {
// 	    System.out.println("For A: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==6) || (i==2&&j==4) || (i==2 && j==7) ||(i==3 && j>2 &&j<=6) || (i==4 && j==2)||(i==4 && j==9) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
		       
// 		    }
// 		    System.out.println("");
// 		} 
// 	////////////////////////////////////////////
// 	System.out.println();

// 		System.out.println("For B: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2) || (i==2 && j==9) ||(i==3 && j>1 &&j<=5) || (i==4 && j==2)||(i==4 && j==9)||(i==5 && j>1&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// //////////////////////////////////////////
// System.out.println();

// 		System.out.println("For C: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>2&&j<=6) || (i==2 && j==2) ||(i==3 && j==2 ) || (i==4 && j==2)||(i==5 && j>2&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 		System.out.println("For D: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=5) || (i==2 && j==2) || (i==2 && j==9) ||(i==3 && j==2 ) || (i==4 && j==2)||(i==4 && j==9)||(i==5 && j>1&&j<=5) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 		System.out.println("For E: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2) ||(i==3 && j>=2&&j<=6 ) || (i==4 && j==2)||(i==5 && j>1&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 		System.out.println("For F: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2) ||(i==3 && j>=2&&j<=6 ) || (i==4 && j==2)||(i==5 && j==2) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 		System.out.println("For G: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2) ||(i==3 && j>=2&&j<=6&&j!=3 ) || (i==4 && j==2)||(i==4 && j==9)||(i==5 && j==2) ||(i==5 && j>1&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		       if(i==3&&j==3){
// 		           System.out.print(" ");
// 		       }
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For H: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1&&j==9) || (i==2 && j==2) ||(i==2&&j==9)||(i==3 && j>1&&j<=6 ) || (i==4 && j==2)||(i==4 && j==9)||(i==5 && j==2) ||(i==5 && j==2)||(i==5&&j==9) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For I: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==6)||(i==3 && j==6 ) || (i==4 && j==6)||(i==5 && j>1&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For J: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==6)||(i==3 && j==6 ) || (i==4 && j==5)|| (i==4 && j==2)||(i==5 && j>1&&j<=4) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For K: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1 && j==9) || (i==2 && j==2)|| (i==2 && j==5)||(i==3 && j==3)||(i==3 && j==2)||(i==4 && j==2)||(i==5 && j==2)|| (i==4 && j==5)|| (i==5 && j==9)){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		}
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For L: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2) || (i==2 && j==2)|| (i==3 && j==2)||(i==4 && j==2)||(i==5 && j==2)|| (i==5 && j>1&&j<=6)){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		}
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For M: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1&&j==9) || (i==2 && j==2) || (i==2 && j==3) ||(i==2&&j==6)||(i==2&&j==7)||(i==3 && j==2)||(i==3&&j==5 )||(i==3&&j==8 ) || (i==4 && j==2)||(i==4 && j==9)||(i==5 && j==2) ||(i==5 && j==2)||(i==5&&j==9) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For N: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1&&j==9) || (i==2 && j==2) || (i==2 && j==3) ||(i==3 && j==2)||(i==2 && j==8)||(i==3&&j==5 )||(i==3&&j==8 ) || (i==4 && j==2)||(i==4 && j==7)||(i==4 && j==8)||(i==5 && j==2) ||(i==5 && j==2)||(i==5&&j==9) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 	System.out.println("For O: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>2&&j<=6) || (i==2 && j==2) ||(i==2 && j==9) ||(i==3 && j==2 )||(i==3 && j==9 ) || (i==4 && j==2)|| (i==4 && j==9)||(i==5 && j>2&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 	System.out.println("For P: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2)|| (i==2 && j==9) ||(i==3 && j>=2&&j<=6 ) || (i==4 && j==2)||(i==5 && j==2) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 	System.out.println("For Q: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>2&&j<=6) || (i==2 && j==2) ||(i==2 && j==9) ||(i==3 && j==2 )||(i==3 && j==8 )||(i==3 && j==5 ) || (i==4 && j==2)|| (i==4 && j==7)|| (i==4 && j==8)||(i==5 && j>2&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 	System.out.println("For R: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2)|| (i==2 && j==9) ||(i==3 && j>=2&&j<=6 )||(i==4 && j==5 )||(i==5 && j== 9) || (i==4 && j==2)||(i==5 && j==2) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For S: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==2) ||(i==3 && j>=2&&j<=6 ) || (i==4 && j==9)||(i==5 && j>1&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		       if(i==4&&j==2){
// 		           System.out.print(" ");
// 		       }
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For T: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) || (i==2 && j==6)||(i==3 && j==6 ) || (i==4 && j==6)||(i==5 && j==6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// 	System.out.println("For U: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2) ||(i==1 && j==9)|| (i==2 && j==2) ||(i==2 && j==9) ||(i==3 && j==2 )||(i==3 && j==9 ) || (i==4 && j==2)|| (i==4 && j==9)||(i==5 && j>2&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For U: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2) ||(i==1 && j==9)|| (i==2 && j==3) ||(i==2 && j==8) ||(i==3 && j==4 )||(i==3 && j==7 ) || (i==4 && j==5)|| (i==4 && j==6)||(i==5 && j==6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For W: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1&&j==9) || (i==2 && j==2)||(i==2&&j==9)||(i==3 && j==2)||(i==3&&j==5 )||(i==3&&j==8 ) || (i==4 && j==2)|| (i==4 && j==3)||(i==4&&j==6)||(i==4 && j==7)||(i==5 && j==2) ||(i==5 && j==2)||(i==5&&j==9) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For X: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1&&j==9) || (i==2 && j==4)||(i==2&&j==7)||(i==3&&j==6 )|| (i==4 && j==4)||(i==4&&j==7)||(i==5 && j==2) ||(i==5 && j==2)||(i==5&&j==9) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();

// System.out.println("For Y: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j==2)||(i==1&&j==9) || (i==2 && j==4)||(i==2&&j==7)||(i==3&&j==6 )|| (i==4 && j==6)||(i==5 && j==6) ||(i==5 && j==6)){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////
// System.out.println();
// System.out.println("For Z: ");
// 		for (int i=1;i<=5 ;i++ ){
// 		    for(int j=1;j<=9;j++){
// 		     if((i==1 && j>1&&j<=6) ||(i==2&&j==8)||(i==3&&j==6 )|| (i==4 && j==4)||(i==5 && j==2) ||(i==5 && j==2)||(i==5&&j>1&&j<=6) ){
// 		        System.out.print("*");
// 		       }
// 		       System.out.print(" ");
// 		    }
// 		    System.out.println("");
// 		} 
// ///////////////////////////////////////////

		
		
// 	}
// }