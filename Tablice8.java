public class Tablice8 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[]{2, 2, 4, 9, 4, 3, 8, 5, 3, 7, 8, 1, 4, 3, 7};
        System.out.print("Oto elementy tablicy bez powtórzeń: ");
        for (int i : getDistinct(arrayOfNumbers)) {
            System.out.print("[" + i + "] ");
        }
    }
    public static int[] getDistinct(int[] array) {
        int[] tempArray = new int[array.length];
        boolean comparisonResult = true;
        int k = 0;
        for (int value : array) {
            for (int j : tempArray) {
                if (value == j) {
                    comparisonResult = false;
                    k--;
                    break;
                }
            }
            if (comparisonResult) {
                tempArray[k] = value;
            }
            comparisonResult = true;
            k++;
        }
        int[] result = new int[k];
        System.arraycopy(tempArray, 0, result, 0, k);
        return result;
    }
}
