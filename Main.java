/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



///Methods  --- -----------
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s1=new Scanner (System.in);
	    int n=s1.nextInt();
	    int star=n;
	    
	    for(int i=1;i<=n;i++){
	        char ch='A';
	        ch+=n-i;
	        for(int j=1;j<=star;j++){
	            
	            System.out.print(ch--);
	        }
	        star--;
	        
	        
	        System.out.println();
	    }
	}
}
	    
	    
	    
	    
// //     // boolean num=false;
//     int a=s1.nextInt();
//     int b=s1.nextInt();
//     int f=0,big=0;
//     int gcd=0;
//     if(a>b) big=a;
//     else big=b;
//         for(int i=1;i<=big;i++){
//             if((a%i==0)&&(b%i==0))               ////GCD 
                
//                     gcd=i;
//         }
//         System.out.println("GCD :"+gcd);

// 	}
// }
// 	public static int Gcd(int a,int b){
// 	    if(b%a==0){
// 	        return a;
// 	    }else{
// 	        int r = b%a;
// 	         r=a;
// 	         b=a;
	         
// 	    }
// 	}
	    
	    
	    
	    
	    
//     Scanner s1=new Scanner (System.in);
//     // boolean num=false;
//     int s=s1.nextInt();
//     int e=s1.nextInt();
//     int flag=0;
//     for(int i=s;i<=e;i++){
//         if(isprime(i)){
//         System.out.println(i);
//         // num=true;
//         flag=1;
//         }
//     }
//     // if(num==false){
//     //     System.out.println("No prime numbers");
//     // }
//      if(flag==0){
//         System.out.println("No prime numbers");
//     }
// 	}
// 	public static boolean isprime(int n){
// 	    int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//             count++;
//         }
//         }
//         return count==2;
     

// 	}
// }







// 	 //	System.out.println("Hello World");
// 	 Main r1=new Main();                    /////creating the Object
//         System.out.println(r1.main(2));
// 		System.out.println(r1.main(1.2));
	    
// 	                                                        // overloading the non-static  method
// 	}
// 	public  int  main(int a){
// 	    return a;
	   
// 	}
// 	public  double main(double a){
	   
// 	    return a;
// 	}
// }





// 	   System.out.println(main(2));
// 		System.out.println(main(1.2));
	    
	                                                        //// overloading the main method
// 	}
// 	public static int  main(int a){
// 	    return a;
	   
// 	}
// 	public static double main(double a){
	   
// 	    return a;
// 	}
// }

	   
// 	    System.out.println(add());
// 		System.out.println(add("Ashok"));
// 	    System.out.println(add("Ashok","Ambani"));	
	
// 	}
// 	public static String  add(){
// 	    return "Hello";
	   
// 	}
// 	public static String add(String a){
	   
// 	    return "hello , "+a;
	    
	       
// 	}
	
// 	public static String add(String  a,String  b){
	  
// 	   return "hello , "+a+" "+b+"ji";
// 	}
// }


// 	   System.out.printf("%.2f\n",add(3));
// 		System.out.println(add(4,5,true));
// 	    System.out.println(add(4,5,false));	
// 		System.out.println(add(2,3,5));
// 	}
// 	public static double add(double a){
// 	    return 3.14*a*a;
	   
// 	}
// 	public static double add(int a,int b ,boolean istrangle){
// 	   if(istrangle)
// 	    return 0.5*a*b;
// 	    else{
// 	        return a*b;
// 	    }
// 	}
	
// 	public static double add(int  a,int  b,int c){
	  
// 	   return a*b*c;
// 	}
// }
	   
// 	    System.out.println(	add(7.4 , 4.4));
// 		System.out.println(add(4,2));
// 	    System.out.println(add(1,2,3));	
// 		System.out.println(add("hello","world"));
// 	}
// 	public static double add(double a,double b){
// 	    return a+b;
	   
// 	}
// 	public static int add(int a,int b){
	    
// 	    return a+b;
// 	}
// 	public static int add(int a,int b,int c){
	    
// 	    return a+b+c;
// 	}
// 	public static String add(String a,String b){
	  
// 	   return a+b;
// 	}
// }
	   
	   
// 		add(7.4 , 4.4);
// 		add(4,2);
// 		add(1,2,3);
// 		add("hello","world");
// 	}
// 	public static double add(double a,double b){
	    
// 	    System.out.println(a+b);
// 	}
// 	public static int add(int a,int b){
	    
// 	    System.out.println(a+b);
// 	}
// 	public static int add(int a,int b,int c){
	    
// 	    System.out.println(a+b+c);
// 	}
// 	public static void add(String a,String b){
	  
// 	    System.out.println(a+b);
// 	}
// }

	    
	    
	    
// // 		System.out.println("Hello World");
// 		m1();
// 		m1(4,2);
// 		m1(1,2,3);
// 	}
// 	public static void m1(){
// 	    System.out.println(0);
// 	}
// 	public static void m1(int a,int b){
// 	    System.out.println(a+" "+b);
// 	}
// 	public static void m1(int a,int b,int c){
// 	    System.out.println(a+" "+b+" "+c);
// 	}

