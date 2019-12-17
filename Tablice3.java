public class Tablice3 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        System.out.println("Największa liczba w tablicy to: " + getMin(array));
    }
    public static int getMin (int[] arrayOfNumbers) {
        int minValue = arrayOfNumbers[0];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] < minValue) {
                minValue = arrayOfNumbers[i];
            }
        }
        return minValue;
    }
}
