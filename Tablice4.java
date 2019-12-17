public class Tablice4 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        System.out.println("Suma wszystkich elementów tablicy wynosi: " + getSum(array));
    }
    public static int getSum (int[] arrayOfNumbers) {
        int sum = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            sum += arrayOfNumber;
        }
        return sum;
    }
}
