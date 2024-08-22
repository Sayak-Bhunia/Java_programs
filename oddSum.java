class oddSum
{
  public static void main(String ar[])
  {
      int sum = 0;
      for(int i=0;i<ar.length;i++) 
      {
          int n = Integer.parseInt(ar[i]);
          if(n%2 != 0) {
              sum = sum + n;
          }
      }
      System.out.println("Sum = "+sum);
  }
}
