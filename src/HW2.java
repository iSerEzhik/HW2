import java.util.Random;

public class HW2 {
    public static void main(String[] args) {

        zeroToOneToZero();//Ex1
        mas3X();//Ex2
        ifLowerThanSixX2();//Ex3
        diagonalsEqualsOne();//Ex4
        maxAndMinOfArray();//Ex5*
        int[] a = new int[10];
        Random rand= new Random();
        for(int i=0;i< a.length;i++)
        {
            a[i]= i;
        }
        System.out.println(-5%3);
        if (ifCheckBalance(a)) //Ex6**
        {
            System.out.println("Есть баланс");
        }
        else
        {
            System.out.println("Нет баланса");
        }
        shiftArrayByN(a,5);//Ex7***
    }
    public static void zeroToOneToZero()
    {
        int i=0;
        int[] a=new int[10];
        for (i=0;i< a.length;i++)
        {
            a[i]=i%2;
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        for (i=0;i<a.length;i++)
        {
            if (a[i]==0)
            {
                a[i]=1;
            }
            else
            {
                a[i]=0;
            }
            System.out.print(a[i]+" ");
        }
    }
    public static void mas3X()
    {
        System.out.println();
        int[] a=new int[8];
        for (int i=0;i< a.length;i++)
        {
            a[i]=3*i;
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void ifLowerThanSixX2()
    {
        int[] a={1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i=0;i<a.length;i++)
        {
            if (a[i]<6)
            {
                a[i]*=2;
            }
            System.out.print(a[i]+" ");
        }
    }
    public static void diagonalsEqualsOne()
    {
        int[][] a=new int[5][5];
        for(int i=0;i< a.length;i++)
        {
            a[i][i]=1;
            a[a.length-i-1][i]=1;
        }
        for(int i=0;i< a.length;i++)
        {
            System.out.println();
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public static void maxAndMinOfArray()
    {
        System.out.println();
        int[] a=new int[8];
        int max=0;
        int min=1000000000;
        for (int i=0;i< a.length;i++)
        {
            a[i]=i;
            if (a[i]>max)
            {
                max=a[i];
            }
            if (a[i]<min)
            {
                min=a[i];
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
    public static boolean ifCheckBalance(int[] a)
    {   int sleft=0;
        int sright=0;
        for (int i=0;i< a.length;i++)
        {
            sleft+=a[i];
        }
        for (int i=a.length-1;i>0;i--)
        {
            if (sleft==sright)
            {
                return true;
            }
            else
            {
                sleft-=a[i];
                sright+=a[i];
            }

        }
        return false;
    }
    static public void  shiftArrayByN(int[] a,int n)
    {
        System.out.println();
        for (int i=0;i< a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int buf,buf1;
        int i=0;
        int k=1;
        if (n<0)
        {
            n+=a.length;
        }
        buf = a[i];
        buf1 = a[(i + n) % a.length];
        while (k <= a.length) {
            a[(i + n) % a.length] = buf;
            buf = buf1;
            if ((k%(a.length/n)==0)&&(a.length%n==0))
            {
                i++;
                buf=a[(i + n) % a.length];
            }
            i = (i + n) % a.length;
            buf1 = a[(i + n) % a.length];
            k++;

        }

        System.out.println();
        for (i=0;i< a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
