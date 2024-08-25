public class Arrayex {
    
        public static int[] removeEven(int[] arr)
        {
            int n=arr.length;
            int oddCount=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                {
                    oddCount++;
                }
            }
            int[] oddarr=new int[oddCount];
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                {
                    oddarr[count++]=arr[i];
    
                }
            }
            return oddarr;
        }
    
    public static void main(String[] args )
    {
        int[] arr=new int[]{3,2,4,7,10,6,5};
       
        int[] result=removeEven(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
        

        


    }
    
}
