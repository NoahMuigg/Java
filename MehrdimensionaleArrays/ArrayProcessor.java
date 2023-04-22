import java.util.Random;

public class ArrayProcessor{

    public static int[][] createArray(int x, int y){
        int[][] array = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                Random rand = new Random();
                int number = rand.nextInt(100)+1;
                array[i][j] = number;
            }
        }
        return array;
    }

    public static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void sumArray(int[][] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void findMax(int[][] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }

    public static void flatten(int[][] arr){
        
    }

    public static void main(String[] args) {
        int[][] arr = createArray(5, 4);
        printArray(arr);
        System.out.println();
        sumArray(arr);
        System.out.println();
        findMax(arr);

    }


}