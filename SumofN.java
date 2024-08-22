class SumofN
{
  public static void main(String ar[])
  {
      int sum = 0;
      for(int i=0;i<ar.length;i++) // here .length is a variable defined array class
      {
          sum = sum + Integer.parseInt(ar[i]); // string -> int
      }
      System.out.println("Sum = "+sum);
  }
}
