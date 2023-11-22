import java.util.*;
class prime
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.
      print ("Enter two numbers to find the prime numbers between them ");
    int a = sc.nextInt ();
    int b = sc.nextInt ();
    int i;
    int j;
    int count;
    for (i = a + 1; i < b; i++)
      {
	count = 0;
	j = i;
	for (int k = 2; k < j; k++)
	  {
	    if (j % k == 0)
	      {
		count++;
	      }
	  }
	if (count == 0)
	  {
	    System.out.println (i);
	  }
      }


  }
}
