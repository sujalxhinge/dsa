public class ceilingnumber
{
    public static void main(String[] args)
    {
      int[] arr={2,3,5,9,11,14};
      int target = 13;
      System.out.println(ceiling(arr,target));
    }
public static int ceiling(int[] arr,int target)
{
    int start = 0;
    int end = arr.length-1;

    while(start<=end)
    {
        int mid = start +(end - start)/2;

        if(target < arr[mid])
        {
            end  = mid -1;
        } else if (target > arr[mid])
        {
            start = mid +1;

        }
    }
    return start;
}
}