public class Tablice5 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        System.out.println("Największa liczba w tablicy: " + getMaxMinAndSum(array)[0]);
        System.out.println("Najmniejsza liczba w tablicy: " + getMaxMinAndSum(array)[1]);
        System.out.println("Suma wszystkich liczb w tablicy: " + getMaxMinAndSum(array)[2]);
    }
    public static int[] getMaxMinAndSum (int[] arrayOfNumbers) {
        int maxValue = 0, minValue = arrayOfNumbers[0], sum = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber > maxValue) {
                maxValue = arrayOfNumber;
            }
            if (arrayOfNumber < minValue) {
                minValue = arrayOfNumber;
            }
            sum += arrayOfNumber;
        }
        return new int[]{maxValue, minValue, sum};
    }
}
