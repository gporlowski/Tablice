public class Tablice1 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 4, 15, 9, 17, 3, 22, 6, 122, 8};
        print(array);
    }
    public static void print (int arrayOfNumbers[]) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println((i + 1) + ".\t" + arrayOfNumbers[i]);
        }
    }
}
