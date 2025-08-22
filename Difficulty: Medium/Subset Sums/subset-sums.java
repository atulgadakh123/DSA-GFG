// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        
       ArrayList<Integer>ans=new ArrayList<>();
        backtrack(arr,0,0,ans);
            return ans;
        
    } 
        public void backtrack(int[] arr,int start,int sum,ArrayList<Integer>ans){
          
          if(start==arr.length){
              ans.add(sum);
              return;
          }   
        
          backtrack(arr,start+1,sum+arr[start],ans);
          backtrack(arr,start+1,sum,ans);
        }
    }
