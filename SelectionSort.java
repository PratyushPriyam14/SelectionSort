import java.io.*;
import java.util.*;
public class SelectionSort
{
    public static void main(String []args)throws Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        selectionsort(arr);
        display(arr);
    }
    public static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void selectionsort(int []arr)
    {
        for(int i=0 ; i < arr.length-1 ; i++){
            int m=i;  //har iteration mein jaha i hoga wohi min hoga initially
            for(int j = i+1 ;j < arr.length ; j++){  //j hamesa i se ek aage hi rahega har iteration mein
                if(isSmaller(arr,j,m)){
                    m=j;  //agr j chhota hai min se toh j ka value min ho jayega
                }
            }
            swap(arr,i,m);  //phir last jab iteration khtam honge toh m jaha hoga woh i se swap ho jayega
        }

    }
    public static void swap(int []arr,int i,int j){
        System.out.println("Swapping "+arr[i]+" and "+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static boolean isSmaller(int []arr,int i,int j){
        System.out.println("Comparing "+arr[i]+" and "+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
    }
}
 */
 min get compare with j
 min get swap with i
 /*
