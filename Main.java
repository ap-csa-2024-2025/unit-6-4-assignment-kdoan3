import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;

    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i].length() == targetLength)
      {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {

      for (int j = 0; j < arr.length; j++)
      {
        if (arr[j] == arr[i])
        {
          return true
        }
      }
    }
    return false;
  }

  public static int findMode(int[] arr)
  {
    int count = 0;
    int maxcount = 0;
    int mode = arr[0];

    for (int i = 0; i < arr.length; i++)
    {
      int potential_mode = arr[i];
      count = 0;

      for (int j = 0; j < arr.length; j++)
      {
        if (arr[j] == arr[i]) // arr[j] == potential_mode
        {
          count++
        }
      }

      if (count > maxcount)
      {
        maxcount = count;
        mode = arr[i]; // mode = potential_mode
      }
    }
    return mode;
  }
}  
