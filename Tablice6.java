public class Tablice6 {
    public static void main(String[] args) {
        int[] array1 = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        int[] array2 = new int[]{9, 7, 5, 1, 11, 37, 82, 54, 8, 12};
        System.out.print("Elementy tablicy, której suma elementów jest większa: ");
        for (int array : getLarger(array1, array2)) {
            System.out.print(array + ", ");
        }
    }
    public static int[] getLarger (int[] firstArray, int[] secondArray) {
        int firstSum = 0, secondSum = 0;
        for (int arrayOfNumber : firstArray) {
            firstSum += arrayOfNumber;
        }
        for (int arrayOfNumber : secondArray) {
            secondSum += arrayOfNumber;
        }
        if (firstSum > secondSum) {
            return firstArray;
        }
        return secondArray;
    }
}
