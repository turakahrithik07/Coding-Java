import java.util.Scanner;

public class TotalNum
{
    public static void main(String[] args)
    {
        int[][] nums = { {2,4,5,6,3},
                         {5,3,6,7,2},
                         {4,6,2,1,3},
                         {8,3,1,9,0},
                         {0,4,5,2,7},
                       };

        Scanner keyboard = new Scanner(System.in);

  System.out.print("Enter an int (0 to 9):: ");
  int totalNum = keyboard.nextInt();
  int count = 0;

  for(int row = 0; row<nums.length ;row++)
   {
      for(int col = 0; col<nums[0].length; col++)
      {
        if(nums[row][col] == totalNum)
        {
          count++;
        }         
      }
   }
  System.out.println("There are " + count + " values of" + totalNum + " in the array");
  } 
}
