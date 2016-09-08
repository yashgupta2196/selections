import java.util.Scanner;
class duplicate
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

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); //number of elements in the list
    a=new int[n]; //a is the list of numbers
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    quick_sort(a,0,n-1);
    for(int i=0;i<n-1;i++)
    {
      if(a[i]!=a[i+1])
      {
        System.out.println(a[i]);
        return;
      }
      else
      i++;
    }
    System.out.println(a[n-1]);
  }
}
