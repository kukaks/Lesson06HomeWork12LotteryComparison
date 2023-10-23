import java.util.Arrays;
import java.util.Random;

public class LotteryComparison {
    public static void main(String[] args){

        int size = 7;

        int[] firstArr = new int[size];
        int[] secondArr = new int[size];

        Random random = new Random();
        for (int i= 0; i<size; i++){
            firstArr[i] = random.nextInt(10);
            secondArr[i] = random.nextInt(10);
        }
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        int count = 0;
        for (int i=0; i< size; i++){
            if (firstArr[i] == secondArr[i]){
                count++;
            }
        }
        System.out.println("Кількість збігів: " + count);
    }
}
