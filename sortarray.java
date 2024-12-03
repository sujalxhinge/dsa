import java.util.Arrays;

public class sortarray 
{
    public static void sortarr(int[] arr)
    {
        int temp;

        for (int i = 0; i < arr.length-1; i++)
         {
           for(int j = 0;j<arr.length-1-i;j++)
           {
             if(arr[j]>arr[j+1])
             { 
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
           }
         }
    }

    public static void main(String []args)
    {
      int []arr = {1,4,3,2,5,7,6,8,9};
      System.out.println("array before sort "+Arrays.toString(arr));
      sortarr(arr);
      System.out.println("array after sort "+Arrays.toString(arr));

    }
}
