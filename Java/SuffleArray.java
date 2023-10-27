import java.lang.Math;

public class SuffleArray{
    public static void main(String[] args){
        int [] myArray = {1,2,3,4,5,6,7};
        int[] suffledArray = new int[7];
        int max = 7;
        int min = 1;
        int range = max - min + 1;
        for(int i=0;i<7;i++)
        {
        suffledArray[(int)((Math.random())* range)] = myArray[i];
        }
        int flag =0,k=0;
        for(int i=0;i<7;i++)
        {
            flag = 0;
           for(int j=0;j<7;j++)
           {
               if(myArray[i]==suffledArray[j])
               {
               flag = 1;
               }
               else if(suffledArray[j]==0) //check zero in array and assign index of 0 in                             variable k
                 k=j;
           }
           if(flag==0)
           suffledArray[k] = myArray[i];
        }
       System.out.println("Suffled Array");
        
        for(int i=0;i<7;i++)
        {
            System.out.print(suffledArray[i] + " ");
        }
    }
}