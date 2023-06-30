import java.util.Stack;

public class reverseS
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(10);
        st.push(14);
        st.push(54);
        st.push(34);

        System.out.println(st);

        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop()); 
        }

        System.out.print(rt);
    }
}