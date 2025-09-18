/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    	Scanner s1=new Scanner(System.in);
	    	int n=s1.nextInt();
	    	int arr1[]=new int[n];
	         for(int i=0;i<n;i++){
	             arr1[i]=s1.nextInt();
	         }
	    	if(n%2==0){
	    	    for(int i=0;i<n/2;i++){
	    	        System.out.print(arr1[i]+" "+arr1[n-i-1]+" ");
	    	    }
	    	}else{
	    	    for(int i=0;i<n/2;i++){
	    	        System.out.print(arr1[i]+" "+arr1[n-i-1]+" ");
	    	    }
	    	    System.out.print(arr1[n/2]+" 0");
	    	}
	}
}
	    	
	    	
// 	    	int r=s1.nextInt();
//  		int c=s1.nextInt();
//         System.out.println("enter the key :");
//         int key = s1.nextInt();
        
//         int arr1[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
// 		         arr1[i][j]=s1.nextInt();
// 		}
//         }
//         System.out.println("the 2D array elements are:");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
		       
// 		         System.out.print(arr1[i][j]+" ");
// 		}
// 	        System.out.println();
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(key==arr1[i][j])
//                   System.out.printf("the element is found at %d row %d col : %d",i,j,key);  
//                   break;                                    /////
// 		}
// 	        System.out.println();
//         }
        
// 	}
// }
		
// 		Scanner s1=new Scanner(System.in);
// 		int r=s1.nextInt();
//  		int c=s1.nextInt();
//  		int count=0,countodd=0;
// //  		int [] [] arr1={{10,}
//         int arr1[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
// 		         arr1[i][j]=s1.nextInt();
// 		}
//         }
//         System.out.println("the 2D array elements are:");
//         for(int i=0;i<c;i++){
//             for(int j=0;j<r;j++){
//                   System.out.print(arr1[j][i]+" ");              /////transpose of array like A'
// 		}
// 	        System.out.println();
//         }
//        
// 	}
// }
		
		
		
		
		
		
		
		
		
		
		
		
// 		int r=s1.nextInt();
//  		int c=s1.nextInt();
//  		int count=0,countodd=0;
// //  		int [] [] arr1={{10,}
//         int arr1[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
// 		         arr1[i][j]=s1.nextInt();
// 		}
//         }
//         System.out.println("the 2D array elements are:");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if((arr1[i][j])%2==0)
// 		           count++;
// 		        else countodd++;
// 		}
// 	       // System.out.println();
//         }
//          System.out.print("the count  of even Array elements are: "+count);
//          System.out.print("the count  of Odd Array elements are: "+countodd);
// 	}
// }
		
		
		
//---------------------------------------------------------------------------------------------------------------------
//////2D Array////
// 		int r=s1.nextInt();
//  		int c=s1.nextInt();
// //  		int [] [] arr1={{10,}
//         int arr1[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
// 		         arr1[i][j]=s1.nextInt();
// 		}
//         }
//         System.out.println("the 2D array elements are:");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
		       
// 		         System.out.print(arr1[i][j]+" ");
// 		}
// 	        System.out.println();
//         }
// 	}
// }
		
	
		
		
		
		
// 		int sume=0;
// 		int sumo=0;
// 		for(int i=0;i<=n-1;i++){
		   
// 		    if(arr1[i]%2==0){
// 		        sume+=arr1[i];
// 		    }else{
// 		      sumo+=arr1[i];  
// 		    }
		    
// 		}
// 		System.out.println("Even sum in an array"+sume);
// 		System.out.println("odd sum in an array"+sumo);
// 	}
// }
		
// 		int min=arr1[0];
// 		int count=0;
// 		for(int i=0;i<arr1.length-1;i++){
		   
// 		    if(arr1[i]>arr1[i+1]){
// 		        min=arr1[i+1];
// 		    }
// 		     count++;
// 		}
// 		System.out.print("the minimum element at "+count+" in the array:  "+min);
// 	int min=arr1[0];
// 	int count=0;
// 	for(int i=0;i<n;i++){
// 	    if(min>arr1[i]){
// 	        min = arr1[i];
// 	         count++;
// 	    }
	   
// 	}
// 	System.out.println("the array element at "+count+" is: "+min);
// 	}
	
// }
//     int max=arr1[0];
// 	int count=0;
// 	for(int i=0;i<n;i++){
// 	    if(max<arr1[i]){
// 	        max = arr1[i];
// 	         count+=i;
// 	    }
	   
// 	}
// 	System.out.println("the array element at "+count+" is: "+max);
// 	}
	
// }
        
        
        
        
// 		int arr[]={10,20,30,40};
// 		System.out.println("Hello World");
// 		int  [] arr1=new int[4];
// 		arr1[0]=10;
// 		arr1[1]=20;
// 		arr1[2]=30;
// 		arr1[3]=40;
// 		for(int i=0;i<n;i++){
// 		arr[i];
// 		}
// 		for(int i=0;i<arr1.length;i++){
// 		    System.out.println(arr1[i]+" ");
// 		}
// 	for(int i=0;i<arr.length;i++){
// 		    System.out.println(arr[i]+" ");
// 		}
// System.out.println("Array elements are: ");
// int count=0;
// 		for(int num: arr1){
// 		    if(isprime(num)){
// 		        count++;
		       
// 		    }
// }
// System.out.print("no of prime  "+count);
// }


// public static boolean isprime(int n){
//     int con=0;
//     for(int i=1;i<=n;i++){
//         if(n%i==0)
//         con++;
//     }
//     if(con==2){
//       return true;
//     }
//     else{
//         return false;
//     }
// }

// 		for(int i=1;i<arr1.length;i++){
// 		    if(isarmstrong(arr1[i])){
// 		        System.out.println("armstrong no is found at "+i+" is : "+arr1[i]);
		  //  }
		  //  int count=0;
		  //  for(int num:arr1){
		  //      count++;
		  //      if(isarmstrong(num)){
		  //        System.out.println("armstrong no is found at "+count+" is : "+num);  
		  //      }
		  //  }
		  
// 		  int min=arr1[0];
// 		  for(int i=1;i<arr1.length;i++){
// 		    for(int j=i+1;j<arr1.length;j++){
// 		        if(i>j){
// 		            swap(min,j);
// 		        }
// 		    }
		    
// 		    }
// 		    System.out.println(arr1[min]);
// }
// public static void swap(int min,int j){
//     int temp=0;
//     temp=min;
//     min=j;
//     j=temp;
// }
// }


// public static boolean isarmstrong(int n){
//     int sum=0;
//     int temp=n;
//     int digit=0;
//     int l=String.valueOf(n).length();
//     while(n!=0){
//      digit=n%10;
//      sum+=Math.pow(digit,l);
//     n/=10;
//     }
//     if(temp==sum){
//         return true;
//     }
//     else {
//         return false;
//     }
    
// }


// public static boolean isstrong(int n){
//     int sum=0;
//     int temp=n;
//     int digit=0;
//     int fact=1;
//     int l=String.valueOf(n).length();
//     while(n!=0){
//      digit=n%10;
//      for(int i=1;i<=n;i++){
//          fact*=i;
//      }
//      sum+=fact;
//     n/=10;
//     }
//     if(temp==sum){
//         return true;
//     }
//     else {
//         return false;
//     }
    
//  }

    

