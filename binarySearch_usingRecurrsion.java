import java.util.*;
public class binarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms in array");;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in ascending order");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter item to be searched");
        int item = sc.nextInt();
        //binary(arr, item, 0, n-1);
        int result = binarySearch(arr,item, 0, n-1 );
        if(result==-1){
            System.out.println("The element is not present");
        }
        else{
            System.out.println("element found at index "+result);
        }
    }
    public static int binarySearch(int[] arr, int item, int left, int right){
        while(left<= right){
            int mid= left + (right - left)/2;
            if(arr[mid]==item){
               return mid;
            }
            else if(arr[mid]<item){
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void binary(int arr[], int item ,int first, int last){  
        int mid = (first + last)/2;  
        while( first <= last ){  
           if ( arr[mid] < item ){  
             first = mid + 1;     
           }else if ( arr[mid] == item ){  
             System.out.println("Element is found at index: " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element is not found!");  
        }  
      }
}
