import java.util.Arrays;

public class Main {
    public static int[] mergeAndSort(int[] arr1,int[] arr2){
     int n1=arr1.length;
     int n2=arr2.length;
     int[] result=new int[n1+n2];

     int i=0;
     int j=0;
     int k=0;

     while(i<n1 && j<n2){
         if(arr1[i]<arr2[j]){
             result[k++]=arr1[i++];
         }else{
             result[k++]=arr2[j++];
         }
     }

     while(i<n1){
         result[k++]=arr2[j++];
     }
     while(j<n2){
         result[k++]=arr2[j++];
     }
       return result;
    }
    public static void divideArray(int[] mergedArray) {
        int mid = mergedArray.length / 2;

        int[] firstHalf = Arrays.copyOfRange(mergedArray, 0, mid);

        int[] secondHalf = Arrays.copyOfRange(mergedArray, mid, mergedArray.length);

        System.out.println("First half: " + Arrays.toString(firstHalf));
        System.out.println("Second half: " + Arrays.toString(secondHalf));
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = mergeAndSort(array1, array2);

        System.out.println(Arrays.toString(mergedArray));
        divideArray(mergedArray);
    }
}