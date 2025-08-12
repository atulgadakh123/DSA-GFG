// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
       int maxcount=0;
        int maxxcount=-1;
       for(int i=0;i<arr.length;i++){
           int count=0;
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==1){
                   count++;
               }
            }
              if(count>maxcount){
                  maxcount=count;
                  maxxcount=i;
              }
           //System.out.println("arr[0="+i+"arr[1]="+count);
}
       
       return maxxcount;
        
    
}
    
}