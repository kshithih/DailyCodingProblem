/* Good morning! Here's your coding interview problem for today.
This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division? */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number_of_elements = scan.nextInt();
        int[] array = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; ++i) {
            array[i] = scan.nextInt();
        }
        Solution s = new Solution();
        int[] result = new int[number_of_elements];
        result = s.getAns(array, number_of_elements);
        for (int i = 0; i < number_of_elements; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution {
    public int[] getAns(int arr[], int n) {

        int answer[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; ++i) {
            int product = 1;
            for (int j = 0; j < n; ++j) {
                if (i != j) {
                    product = arr[j] * product;
                }
            }
            answer[k++] = product;

        }
        return answer;


    }
}

/* 
Time complexity: O(n^2)
Space complexity : O(n)
*/
