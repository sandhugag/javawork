public class NestedLoopDemo
{
    public static void main(String[] args)
    {
       // int n = 10;
        for(int i=1;i<=5;i++)
            for(int j=0;j<i;j++)
            {
                //System.out.println(""+j);
                System.out.print("*");
            }

        System.out.println("");
    }
}
