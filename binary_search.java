import java.util.Scanner;
class binary_search
{
  static int a[];
  static void quick_sort(int a[],int first,int last) //quick sort
  {
    int i,j,t,pivot;
    if(first<last)
    {
      pivot=first;
      i=first;
      j=last;
      while(i<j)
      {
        while(a[i]<=a[pivot]&&i<last)
          i++;
        while(a[j]>a[pivot])
          j--;
        if(i<j)
        {
          t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
      t=a[pivot];
      a[pivot]=a[j];
      a[j]=t;
      quick_sort(a,first,j-1);
      quick_sort(a,j+1,last);
    }
  }

  static boolean search(int a[],int lb, int ub,int x) //binary search
  {
    while(lb<=ub)
    {
      int mp=(lb+ub)/2;
      if(a[mp]>x)
      ub=mp-1;
      else if(a[mp]<x)
      lb=mp+1;
      else
      return true;
    }
    return false;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int x=sc.nextInt(); //element to be searched for
    quick_sort(a,0,n-1);
    if(search(a,0,n-1,x))
    System.out.println("Found");
    else
    System.out.println("Not found");
  }
}
