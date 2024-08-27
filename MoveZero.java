public class MoveZero {
    public static void main(String args[])
    {
        int[] arr={0,2,0,10,2,0,0,3};
        int n=arr.length;
        int j=0;
    
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            if(arr[j]!=0){
                j++;

            }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
