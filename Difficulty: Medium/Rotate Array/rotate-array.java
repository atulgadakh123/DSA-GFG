// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n;
        reverse(arr, 0,d-1);
        reverse(arr, d,n-1);
        reverse(arr ,0, n-1);
    }   
        public static void reverse(int arr[],int left,int right){
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                
                left++;
                right--;
            }
        }
    }
