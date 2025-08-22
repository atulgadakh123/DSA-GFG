/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        List<Integer>ans=new ArrayList<>();
        
        while(!s.isEmpty()){
            ans.add(s.pop());//remove last element
            
        }
        
        Collections.sort(ans,Collections.reverseOrder());
        for(int i=ans.size()-1;i>=0;i--){
                s.push(ans.get(i));
        }
        return s;
    }
}