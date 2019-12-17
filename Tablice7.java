public class Tablice7 {
    public static void main(String[] args) {
        int[] array1 = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        int[] array2 = new int[]{9, 7, 5, 1, 11, 37, 82, 54, 8, 12};
        System.out.println("Elementy obu tablic: ");
        for (int array : merge(array1, array2)) {
            System.out.print(array + ", ");
        }
    }
    public static int[] merge (int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, array, 0, firstArray.length);
        System.arraycopy(secondArray, 0, array, firstArray.length, secondArray.length);
        return array;
    }
}
