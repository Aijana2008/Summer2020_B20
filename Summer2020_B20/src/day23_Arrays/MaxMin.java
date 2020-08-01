package day23_Arrays;
/*
int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array
 */
public class MaxMin {

    public static void main(String[] args) {

        int[]arr = {5,5,4,6,4,1};
        int max = arr[0];  //6;
        int min = arr[0]; // 5;

        for(int i =0; i <= arr.length -1; i ++){
            if(max < arr[i]){
                max = arr[i];

            }if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);





    }
}
