import java.util.Scanner;

class LogicPyramid
{
    public static void main(String args[])
    {
        int i,n,j;
        int k=2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++){
                int a = (k*(2*k-1));
                String f = String.format("%05d", a);
                System.out.print(f + "  ");
                k=k+2;
            }
            System.out.println();
        }
    }
}
