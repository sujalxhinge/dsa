import java.util.Arrays;

class secondlarge 
{
    public static void findSecLarge(int[] arr) 
    {
        int firlar = Integer.MIN_VALUE; // To store the largest number
        int seclar = Integer.MIN_VALUE; // To store the second largest number

        for (int num : arr) 
        {
            if (num > firlar) {
                // Update second largest before updating the largest
                seclar = firlar;
                firlar = num;
            } else if (num > seclar && num < firlar) {
                // Update second largest if the number is smaller than the largest
                seclar = num;
            }
        }

        System.out.println("Largest number is: " + firlar);
        System.out.println("Second largest number is: " + seclar);
    }

    public static void main(String[] args) 
    {
        int[] arr = {35, 55, 53, 98, 89, 99, 87};
        System.out.println("This is the array -> " + Arrays.toString(arr));
        findSecLarge(arr);
    }
}
