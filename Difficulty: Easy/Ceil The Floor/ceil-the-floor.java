    // User function Template for Java
    
    class Solution {
        public int[] getFloorAndCeil(int x, int[] arr) {
            // code here
             Arrays.sort(arr); 
            int left=0;
            int right=arr.length-1;
            int floor=-1;
            int ceil=-1;
             
           
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==x){
                    floor=arr[mid];
                    ceil=arr[mid];
                    break;
                }
                    else if(arr[mid]<=x){
                        floor=arr[mid];
                        left=mid+1;
                    }
                    else{
                   ceil= arr[mid];
                        right=mid-1;
                    }
                }
            
            return new int[]{floor,ceil};
            
        }
    }
