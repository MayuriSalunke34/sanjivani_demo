import java.util.*;
import java.lang.*;
import java.io.*;
 
 
public class Main
{
    public static void main (String[] args)
    {
        int i,j,rows;
        Scanner my_scanner = new Scanner(System.in);
 
        System.out.println("Enter the number of rows to print * =");
        rows = my_scanner.nextInt();
 
 
 
    for (i = 1; i <= rows; i++) 
    {
      for ( j = 1; j <= i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    }
}
