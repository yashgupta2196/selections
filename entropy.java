import java.util.Scanner;
class entropy
{
  static int bit_diff(int x,int y)
  {
    int b1=(int)Math.floor(Math.log(x)/Math.log(2)+1); //number of bits in x
    int b2=(int)Math.floor(Math.log(y)/Math.log(2)+1); //number of bits in y
    int b=Math.min(b1,b2);
    int d=0;
    for(int i=1;i<=b;i++)
    {
      int a=(int)Math.pow(2,i);
      int a1=x%a;
      int a2=y%a;
      if((a1<a/2&&a2<a/2)||(a1>=a/2&&a2>=a/2))
      continue;
      else
      d++;
    }
    if(b1!=b2)
    {
      int z=Math.max(x,y);
      for(int i=b+1;i<=Math.max(b1,b2);i++)
      {
        int a=(int)Math.pow(2,i);
        int a1=z%a;
        if(a1>=a/2)
        d++;
      }
    }
    return d;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt(); //first number
    int y=sc.nextInt(); //second number
    System.out.println(bit_diff(x,y));
  }
}
