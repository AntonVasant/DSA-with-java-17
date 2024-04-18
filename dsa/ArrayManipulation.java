package dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayManipulation {

    public int[] reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        int temp;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        rotate(arr, 0, n - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
    }

    public void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
        rotate(arr, 0, n - 1);
    }

    private void rotate(int[] arr, int first, int last) {
        int temp;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public void swapWithoutTemp(int[] arr, int first, int second) {
        arr[first] = arr[first] + arr[second];
        arr[second] = arr[first] - arr[second];
        arr[first] = arr[first] - arr[second];
    }

    public List<Integer> duplicate(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                list.add(num);
            }
        }
        return list;
    }

    public void maxAndMin(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    public int[] prefixSum(int arr[]) {
        int n = arr.length;
        int[] nums = new int[n];
        nums[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nums[i] = nums[i - 1] + arr[i];
        }
        return nums;
    }

    public int[] prefixProduct(int arr[]) {
        int n = arr.length;
        int[] nums = new int[n];
        nums[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nums[i] = nums[i - 1] * arr[i];
        }
        return nums;
    }

    public int[] prefixMaximum(int arr[]) {
        int n = arr.length;
        int[] nums = new int[n];
        nums[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nums[i] = Math.max(nums[i - 1], arr[i]);
        }
        return nums;
    }

    public int[] prefixMinimum(int arr[]) {
        int n = arr.length;
        int[] nums = new int[n];
        nums[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nums[i] = Math.min(nums[i - 1], arr[i]);
        }
        return nums;
    }

    public int[] Gcd(int arr[]) {
        int n = arr.length;
        int[] nums = new int[n];
        nums[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nums[i] = gcd(nums[i - 1], arr[i]);
        }
        return nums;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public boolean panagram(String str) {
        if (str.length() < 26)
            return false;
        str = str.toLowerCase();
        boolean alphabets[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabets[ch - 'a'] = true;
            }
        }
        for (boolean num : alphabets) {
            if (!num)
                return false;
        }
        return true;
    }
}