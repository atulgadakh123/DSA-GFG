class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int right=arr.length-1;
        int left=0;
       // int ans=-1;
        int count=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
             
                 count++;
                int i=mid-1;
                while( i>=0&&arr[i]==target){
                    count++;
                    i--;
                }
                int j=mid+1;
                while(j<arr.length&&arr[j]==target){
                    count++;
                    j++;
                }
                break;
            }
            else if(arr[mid]<=target){
              //  ans=arr[mid];
                left=mid+1;
               
            }
            else{
               // ans=arr[mid];
                right=mid-1;
                
            }
        }
        return count;
    }
}
