import java.util.*;
public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms in array");;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        
        }
        // System.out.println("The array members are");
        // for(int i =0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println("Enter item to be searched");
        int item = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(item== arr[i]){
                System.out.println("Item found at index "+ i);
                flag = true;
                break;
            }
        }
        if(flag==false){
                System.out.println("Item not present in the array");
            }
    }
}


// public class LinearSearchExample{    
// public static int linearSearch(int[] arr, int key){    
//         for(int i=0;i<arr.length;i++){    
//             if(arr[i] == key){    
//                 return i;    
//             }    
//         }    
//         return -1;    
//     }    
//     public static void main(String a[]){    
//         int[] a1= {10,20,30,50,70,90};    
//         int key = 50;    
//         System.out.println(key+" is found at index: "+linearSearch(a1, key));    
//     }    
// }    