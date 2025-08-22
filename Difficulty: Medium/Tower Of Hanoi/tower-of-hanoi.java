class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        int moves=0;
        if(n>=1){
          //  return 1;

        moves+=towerOfHanoi(n-1,from,aux,to);
        
        moves++;
        moves+=towerOfHanoi(n-1,aux,to,from);
    }
    return moves;
}
        }