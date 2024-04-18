 public class Smallest
{
  public static void main(String args[])
  {

     int arr[] = {12, 13, 12, 20, 34, 10};

     int min = arr[0];

     for(int i=0; i<arr.length; i++)
     { 
    	 if(min > arr[i])
         {
            min = arr[i];
         }

     }

     System.out.println("The minimum element is" + min); 
  }
}