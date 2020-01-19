package pl.sdaacademy.intermediate.warmup.warmup2;

public class WarmUp2 {
    public static void main(String[] args) {

        String[] array = new String[]{"abc","cde","efghijk","lmnopr","st","u","vwxyz"};

        int all=0;
        for (int i = 0; i<array.length; i++){

            all +=array[i].length();
        }

        System.out.println(all);

    }

}
