public class Tablice2 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        System.out.println("Największa liczba w tablicy to: " + getMax(array));
    }
    public static int getMax (int[] arrayOfNumbers) {
        int maxValue = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber > maxValue) {
                maxValue = arrayOfNumber;
            }
        }
        return maxValue;
    }
}
