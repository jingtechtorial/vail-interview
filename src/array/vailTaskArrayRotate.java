package array;

public class vailTaskArrayRotate {

    public static int[] rotateArrayLeft(int[] array, int positions) {
        if (positions < 0) {
            throw new IllegalArgumentException("Number of position can't be negative");
        }

        int length = array.length;
        if (length == 0) {            return array;
        }

        positions %= length; // handle positions greater than array length

        int[] rotatedArray = new int[length];
        for (int i = 0; i < length; i++) {
            int newIndex = (i - positions + length) % length;
            rotatedArray[newIndex] = array[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 2;
        int[] rotatedArray = rotateArrayLeft(array, positions);

        for (int element : rotatedArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}



