package FabHotels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Given a sorted integer array, two integers N and X, return the N closest integers to X in the array. The result should also be sorted in ascending order
//	Input: N = 4, X = 35
//       arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56}
//	Output: 30 39 42 45
public class Interview {


    public static void main(String[] args) {

//        List<Employee> employeeList=new ArrayList<>();
//        List<String> emmployeeNames = employeeList.stream().filter(emp->emp < 25).map(Employee::getName).toList();
//        System.out.println(employeeList.stream().filter(emp->emp < 25).collect(Collectors.counting()));
//        System.out.println(employeeName.);







        int arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int x =35;
        int num = findIndexOfNumber(arr, x, 0, arr.length-1);
        int i =num-1;
        int j = num+1;
        int count = 4;
        int res[] = new int[4];
        int k = 0;
        while(count>0){
         int leftDigit = arr[num]-arr[i];
         int rightDigit = arr[j] - arr[num];
         if(leftDigit<rightDigit){
             res[k] = arr[i];
             i--;
         }else{
             res[k] = arr[j];
             j++;
         }
            k++;
            count--;
        }
        System.out.println(Arrays.toString(res));
        for(int z=0; z<res.length; z++){
            System.out.println(res[z]);
        }
    }

    private static int findIndexOfNumber(int[] arr, int x, int start, int end) {
        if(start >= end)
            return start;
        int mid = (start + end)/2;
        if(arr[mid]==x){
            return mid;
        }else if(arr[mid] < x){
            return findIndexOfNumber(arr, x, mid+1, end);
        }else{
            return findIndexOfNumber(arr, x, start, mid-1);
        }
    }
}
