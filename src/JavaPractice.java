

import java.sql.Array;
import java.time.Instant;
import java.util.*;

public class JavaPractice {
    public static void main(String[] args) {
        int[] myarray = {10, 5, 7, 8, 4};
        largestElementInArray(myarray);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Double");
//        int number = scanner.nextInt();
//        System.out.println(Math.sqrt(number));
//        squareRoot(number);
       int result= powerRaised(5 ,2);
        System.out.println(result);
        findGCD(54, 24);

//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//        int multiply = number * 2;
//        scanner.nextLine();
//
//        System.out.println("Enter a text");
//        String string = scanner.nextLine();
//
//        System.out.println(multiply);
//        System.out.println(string);

//       largestElementInArray(myarray);
//       maxAndMinArray(myarray);
//       reverseAnArray(myarray);
//       reverseAnArraySecond(myarray);
//       ArrayList<Integer>myArray = new ArrayList<>();
//       myArray.add(1);
//        myArray.add(5);
//        myArray.add(4);
//        myArray.add(1);
//        myArray.add(9);
//        myArray.add(3);
//        sortAscending(myArray);

//getMinimumAbsoluteDiff(myarray);
//        minAbsoluteValue(myarray);
//        findFactorial(10);
//    int[] my_arr = { 3, 4, 5, 6, 7, 8, 9 };
//        int[] newArray = { 1, 2, 4, 5, 6 };
//        findMissingNumber(newArray, newArray.length+1);
//        int[] my_arr = {11, 23, 67, 83, 42, 11, 0};
//        int high = my_arr.length -1;
//        int element = 7;
//        int result = binarySearchUsingRecursion(my_arr,element,0, high);
//        if (result == -1)
//            System.out.println("Element not found");
//        else {
//            System.out.println("Element"+ element + "is found at index" + result);
//        }
//        recusiveInsertionSort(my_arr, my_arr.length);
//        System.out.println("The array elements after implementing insertion sort is ");
//        System.out.println(Arrays.toString(my_arr));


    }

    public static void largestElementInArray(int[] arr) {
        int largest = arr[0];
        for (int i : arr) {
            if (largest < i) {
                largest = i;
            }

        }

        System.out.println(largest);

    }

    public static void maxAndMinArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void reverseAnArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i]);
        }

    }

    public static void reverseAnArraySecond(int[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));


    }

    public static void sortAscending(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void getMinimumAbsoluteDiff(int[] arrayList) {
        Arrays.sort(arrayList);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.length - 1; i++) {
            int diff = arrayList[i + 1] - arrayList[i];
            if (diff < minDiff) {
                minDiff = diff;

                if (minDiff == 0) {
                    System.out.println(0);

                }

            }
        }
        System.out.println(minDiff);
    }

    public static void minAbsoluteValue(int[] myArray) {
        Arrays.sort(myArray);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < myArray[0]; i++) {
            minDiff = Math.min(Math.abs(myArray[i] - myArray[i - 1]), minDiff);
        }
        System.out.println(minDiff);

    }

    public static void findFactorial(int number) {
        int factoral = 1;
        for (int i = 1; i <= number; ++i) {
            factoral *= i;
        }
        System.out.println(factoral);
    }

    public static void recusiveInsertionSort(int[] my_arr, int arr_len) {
        if (arr_len <= 1)
            return;
        recusiveInsertionSort(my_arr, arr_len - 1);
        int last = my_arr[arr_len - 1];
        int j = arr_len - 2;
        while (j >= 0 && my_arr[j] > last) {
            my_arr[j + 1] = my_arr[j];
            j--;
        }
        my_arr[j + 1] = last;

    }

    public static int binarySearchUsingRecursion(int[] arr, int element, int low, int high) {
        if (high >= low) {
            System.out.println("here");
            int mid = low + (high - low) / 2;
            // if midd is the element return middle value
            if (arr[mid] == element)

                return mid;


            if (arr[mid] > element)

                return binarySearchUsingRecursion(arr, element, low, mid - 1);


            return binarySearchUsingRecursion(arr, element, mid + 1, high);

        }
        System.out.println("Here else");
        return -1;
    }


    public static void findMissingNumber(int[] arr, int numberLength) {
        int elementSum = numberLength * (numberLength + 1) / 2;
        int sum = 0;
        for (int i = 0; i < numberLength - 1; i++)
            sum += arr[i];

        System.out.println(elementSum - sum);
    }


    public static void squareRoot(int x) {
        if (x == 0 | x == 1) {
            System.out.println(x);
        }

        int i = 1; int result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        System.out.println(i-1);
    }

    public static int powerRaised(int number, int raised) {
        if (raised != 0) {

            return (number * powerRaised(number, raised - 1));
        }else {
            return  1;
        }
    }

    public static void findGCD(int number1, int number2){
        while (number1 != number2){
            if (number1 > number2){
                number1 -= number2;
            }else {
                number2 -= number1;
            }


        }
        System.out.println(number1);
    }

}






