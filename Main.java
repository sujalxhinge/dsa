public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {12,1221,98,95,78,87,95,96,100,101};
        int target = 1221;
        int result=linearSearch(arr,target);
        System.out.println(result);
    }

    //static function for checking
    static int linearSearch(int[] arr,int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }
        return -1;
    }

}