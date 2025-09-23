    class Solution {
        public String firstNonRepeating(String s) {
            // code 
            StringBuilder ans = new StringBuilder();
            int[] count = new int[26];
            Queue<Character>q = new LinkedList<>();
            
            //use for loop
            for(int i = 0;i<s.length();i++){
                char c = s.charAt(i);
                
                //check repetation
                if(count[c-'a'] ==0 ){
                    q.add(c);
                }
                count[c -'a']++;
                
                while(!q.isEmpty() && count[q.peek()-'a']>1){
                   q.poll();
                }
                if(!q.isEmpty()){
                    ans.append(q.peek());
                }
                else{
                    ans.append("#");
                }
            }
            
            return ans.toString();
        }
    }