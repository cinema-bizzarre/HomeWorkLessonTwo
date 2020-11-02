import java.util.Arrays;

public class HomeWorkLessonTwo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(taskArrayTwo()));
        System.out.println(Arrays.toString(taskOne()));
        System.out.println(Arrays.toString(taskThreeArray()));
        taskFourArray();
        System.out.println(taskMaxValue());
        System.out.println(taskMinValue());
    }


    public static int[] taskArrayTwo() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7};

        for (int j = 1; j < 8; j++) {
            array[j] = j * 3;
        }
        return array;
    }


    public static int[] taskOne() {
        int[] array = new int[]{0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < 10; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }


    public static int[] taskThreeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    public static void taskFourArray() {
        int[][] array = new int[5][5];
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j < array.length ; j++) {
                if (i==j||i+j== array.length-1) array[i][j]=1;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        }



    public static int taskMaxValue() {
        int[] array = {6, 25, 17, 3, 853, 0, 478};
        int maxValue = array [0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array [i];
            }

        }

        return maxValue;

    }

    public static int taskMinValue(){
        int [] array = {6 , 25 ,17, 3, 853, 0, 478};
        int minValue = array [0];
        for (int i = 1; i < array.length ; i++) {
            if (array [i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }



}










