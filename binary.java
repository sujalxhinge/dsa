public class binary
{
    public static void main(String[] args)
    {
        int[] arr={11,23,45,66,77,88,99,111,112};
        int target = 45;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start+(end-start)/2;

            if(target <arr[mid])
            {
                end = mid-1;
            }
            else if (target >arr[mid])
            {
                start = mid +1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}