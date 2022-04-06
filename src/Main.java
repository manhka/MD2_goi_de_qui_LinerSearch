import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,66,44,0};
    Arrays.sort(arr);
    int low=0;
    int high=arr.length-1;
    int value=2;
        System.out.println(binarySearch(arr,low,high,value));


    }
    private static   int  binarySearch(int[] array, int left, int right ,int value){
        while (left<=right){ int mid=(left+right)/2;
            if (value>array[mid]){
                return binarySearch(array,left=mid-1,right,value);
            }else if (value==array[mid]){
               return mid;
            }else {
                return binarySearch(array,left,right=mid+1,value);
            }
           }
        return 0;
    }

    }


