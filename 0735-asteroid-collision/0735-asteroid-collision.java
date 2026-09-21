class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ast: asteroids)
        {
           boolean dest=false;
           while(!st.isEmpty() && ast<0 && st.peek()>0)
           {
            if(st.peek()<-ast)
            {
                st.pop();
            }
            else if(st.peek()==-ast)
            {
                st.pop();
                dest=true;
                break;
            }
            else
            {
                dest=true;
                break;
            }
           }
           if(!dest)
           {
            st.push(ast);
           }
        }
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        return res;
    }
}