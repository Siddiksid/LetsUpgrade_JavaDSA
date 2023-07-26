import java.util.*;
class TimeComplexity {
  public static void main(String[] args) {
   
    // 1.Largest Element in array
    // TimeComplexity-O(N)
    public static int findMax(int arr[]){
         int max=Integer.MIN_VALUE;
        for(int n:arr)
        {
            if(n>max)
            {
                max=n;
            }
            
        }
        return max;
     }
      
// 2.Find minimum and maximum element in an array
  // TimeComplexity-O(N)
      static Pair getMinMax(long a[], long k)  
    {
        //Write your code here
        long max=0;
        long min=Integer.MAX_VALUE;
        
        for(long n:a)
        {
            if(n>max)
            {
                max=n;
            }
             if(n<min)
            {
                min=n;
            }
        }
        return new Pair(min,max);
    }

  // 3.First and last occurrences of x
  // Time Complexity-log(n)
    private long findFirstOccurrence(long arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        long firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                firstOccurrence = mid;
                high = mid - 1; // Continue searching towards the left to find the first occurrence
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstOccurrence;
    }
  
    private long findLastOccurrence(long arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        long lastOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                lastOccurrence = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastOccurrence;
    }

  // 4.Find an element in an array using linear search
// Time complexity-o(n)
  public static int find(int arr[],int x)
  {
      int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==X)
            {
                index=i;
                return index;
            }
        }
        
        return index;
    }


// 5.Second Largest
// Time complexity-o(n)
public static int secondLargest(int arr[]){
        int fl=-1;
        int sl=-1;
        for(int i:arr)
        {
            if(i>fl)
            {
                sl=fl;
                fl=i;
            }
            else if(i<fl && i>sl)
            {
                sl=i;
            }
        }
        return sl;
}

// 6.sum of max+min in array
    // TimeComplexity-o(n)
    public int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>max)
            {
                max=A.get(i);
            }
            else if(A.get(i)<min)
            {
                min=A.get(i);
            }
        }
        return max+min;
    }


    // Atleast two greater element
    // TimeComplexity-(N*log(n))
        public long[] findElements( long a[], long n)
    {
        // Your code goes here
        Arrays.sort(a);
        
        long ans[]=new long[a.length-2];
        int i=0;
        while(i<ans.length)
        {
            ans[i]=a[i];
            i++;
        }
        return ans;
    }
}
}
    
