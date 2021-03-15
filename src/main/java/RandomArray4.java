import java.util.Random;

public class RandomArray4 {
    public static void main(String[] args) {

//        Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
//        Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.

        //Массив рандомных элементов
        final int countElemArray = 20;
        int[] arrRandom = new int[countElemArray];

        System.out.println("Массив: ");
        //Заполнение массива рандомными числами
        for (int i = 0; i < countElemArray; i++) {
            arrRandom[i] = randomInt(-10, 10); //Минимальное и максимальное значение рандомных чисел [-10 ; 10]
            System.out.printf("array[%d] = %d\n", i, arrRandom[i]);
        }

        // Максимальный и минимальный элемент в массиве
        int maxEl =0;
        for(int cur: arrRandom) {
            maxEl = Math.max(maxEl, cur);
        }
        int minEl =0;
        for(int cur: arrRandom) {
            minEl = Math.min(minEl, cur);
        }
//        System.out.printf("max = %d\n", maxEl);
//        System.out.printf("min = %d\n", minEl);

        int maxNegativeEl = minEl;
        int indexMaxNegativeEl = 0;
        int minPositiveEl = maxEl;
        int indexMinPositiveEl = 0;
        for (int i = 0; i < countElemArray; i++){
            //Поиск максимального отрицательного элемента массива
            if (arrRandom[i] < 0) {
                if (arrRandom[i] > maxNegativeEl) {
                    maxNegativeEl = arrRandom[i];
                    indexMaxNegativeEl = i;
                }
            }
            //Поиск минимального положительного элемента массива
            else if (arrRandom[i] > 0) {
                if (arrRandom[i] < minPositiveEl) {
                    minPositiveEl = arrRandom[i];
                    indexMinPositiveEl = i;
                }
            }
        }
        System.out.printf("Максимальный отрицательный элемент array[%d] = %d\n", indexMaxNegativeEl, maxNegativeEl);
        System.out.printf("Минимальный положительный элемент array[%d] = %d\n", indexMinPositiveEl, minPositiveEl);

        int temp = minPositiveEl;
        arrRandom[indexMinPositiveEl] = maxNegativeEl;
        arrRandom[indexMaxNegativeEl] = temp;

        // Вывести измененный массив
        System.out.println("Измененный массив: ");
        for (int i = 0; i < countElemArray; i++) {
            System.out.printf("array[%d] = %d\n", i, arrRandom[i]);
        }

    }

    //Рандомные целые числа в промежутке [a, b]
    public static int randomInt(int minRange, int maxRange){
        Random random = new Random();
        return minRange + random.nextInt(maxRange - minRange + 1);
    }
}
