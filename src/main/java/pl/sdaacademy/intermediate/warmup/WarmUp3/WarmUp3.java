package pl.sdaacademy.intermediate.warmup.WarmUp3;

public class WarmUp3 {
    public static void main(String[] args) {

        int[] array = new int[]{-2,3,1,23,-9,0,12,6,-4};
        int arrayMaxValue=Integer.MIN_VALUE;
        for (int i=0 ;i<array.length; i++){
            if (array[i]>arrayMaxValue){
                arrayMaxValue = array[i];
            }

        }
        int arrayMinValue=Integer.MAX_VALUE;
        for (int i=0 ;i<array.length; i++){
            if (array[i]<arrayMinValue){
                arrayMinValue = array[i];
            }

        }
        System.out.println(arrayMaxValue);
        System.out.println(arrayMinValue);


    }
}
