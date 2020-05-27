import java.util.*;
class ReverseSpiral
{
    static void reverseSpiral(int arr[][],int n)
    {
        int res[]=new int[n*n];
        int l=0,h=n-1,k=0;
        while(l<=h)
        {
            int i=l,j;
            for(j=i;j<=h;j++)
            {
            res[k]=arr[i][j];k++;
            }
            j--;
            for(i=i+1;i<=h;i++)
            {
            res[k]=arr[i][j];k++;
                
            }
            i--;
            h--;
            for(j=j-1;j>=l;j--)
            {
                res[k]=arr[i][j];k++;
            }
            j++;
            l++;
            for(i=i-1;i>=l;i--)
            {
                res[k]=arr[i][j];k++;
            }
        }
        for(int i=n*n-1;i>=0;i--)
        System.out.print(res[i]+" ");
    }
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<=0)
        System.out.println("-1");
        else{
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        arr[i][j]=s.nextInt();
        reverseSpiral(arr,n);
     }
    }
}