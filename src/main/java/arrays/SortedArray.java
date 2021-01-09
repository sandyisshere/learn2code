package arrays;

import org.testng.Assert;

public class SortedArray {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // System.out.println( isRotation(array1, array2a));
        Assert.assertFalse(isRotation(array1, array2a));
        System.out.println(isRotation(array1, array2a));
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        Assert.assertTrue(isRotation(array1, array2b));
        System.out.println(isRotation(array1, array2b));
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        Assert.assertFalse(isRotation(array1, array2c));
        System.out.println(isRotation(array1, array2c));
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        Assert.assertFalse(isRotation(array1, array2d));
        System.out.println(isRotation(array1, array2d));
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        Assert.assertFalse(isRotation(array1, array2e));
        System.out.println(isRotation(array1, array2e));
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
        System.out.println(isRotation(array1, array2f));
        Assert.assertTrue(isRotation(array1, array2f));
        System.out.println(isRotation(array1, array2f));
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
        int a1 = array1.length;
        int a2 = array2.length;
        if (a1 != a2)
            return false;
        int pointer = -1;
        boolean flag = false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[0] == array2[i]) {
                pointer = i;
                flag = true;
                break;
            }
        }
        if (!flag)
            return false;
        for (int i = 0; i < array1.length; i++) {
            int j = (pointer + i) % array1.length;
            if (array1[i] != array2[j]) {
                return false;
            }
        }
        return true;
    }
}

