public class ceiling 
{
    public static void main(String[] args)
    {

        int[] arr = {1,2,3,55, 33, 67, 88, 99, 100};
        // int[] arr = {100, 99, 88, 67, 55, 33, 3, 2, 1};
        
        
        int target = 68;

        int result = binary_search(arr, target);

        

        System.out.println(result);
        // System.out.println(result2);

    }


    // return the smallest number >= target
    
    static int binary_search(int[] arr, int target)
    {
       int start = 0;
       int end = arr.length - 1;
       
       while(start <= end)
       {
        int mid = start + (end - start) / 2;

        if(target < arr[mid])
        {
            end = mid - 1;
        }

        else if(target > arr[mid])
        {
            start = mid + 1;
        }

        else 
        {
            return mid;
        }
       }

       return start;
    }
}
