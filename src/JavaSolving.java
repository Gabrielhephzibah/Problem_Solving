import java.util.*;

public class JavaSolving {
    public static void main(String[] arg) {
//        int[][] rotateImagerr = new int[123][678];
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(1);
        a.add(2);

        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(7);
        a.add(9);

        compareTriplets(a, b);

//        rotateImage(rotateImagerr);

//        getFirstNonReapeatingCharacter("werywuy");
//        int [] arr = {1, 5, 6, 7, 9, 10, 50};
//        int[] arr = {4, 3, 1, 0, 2};
////        largestInArray(arr);
////        minAndMax(arr);
////        reverseAnArray(arr);
//        int result = binarysearch(arr, 50, 1, arr.length - 1);
//        System.out.println(result);
//        findMissingNumber(arr, arr.length);
//        squareRoot(64);
//        int value = raisedToPower(2, 2);
//        System.out.println(value);
//        int gcd = findGCD(54, 24);
//        System.out.println(gcd);
//        sumOfNaturalNumber(10);
//        finabocci(10);
//        reverseAnumber(12345);
//        raiseToPower(5, 2);
//        int initial = 1111;
//        int result = palindromeNumber(initial);
//        if (initial == result){
//            System.out.println("it's palindrome");
//        }else {
//            System.out.println("it's not palindrome");

//        reverseString("tobi");

//        }
//        ArrayList<Integer>myArray = new ArrayList<>();
//       myArray.add(1);
//        myArray.add(5);
//        myArray.add(4);
//        myArray.add(1);
//        myArray.add(9);
//        myArray.add(3);
//        sortArray(myArray);
//
//        findFactorial(3);
//        List<Integer> array = new ArrayList<>();
//        array.add(2);
//        array.add(5);
//
//        System.out.println(findSumOfArray(array)); ;


    }


    public static void largestInArray(int[] arr) {
        int largest = arr[0];
        for (int i : arr) {
            if (largest < i) {
                largest = i;
            }
        }
        System.out.println(largest);
    }

    public static void minAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int value : array) {
            max = Math.max(max, value);
            min = Math.min(min, value);

        }
        System.out.println(max);
        System.out.println(min);

    }

    public static void reverseAnArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void sortArray(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

    public static int binarysearch(int[] arr, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarysearch(arr, target, low, mid - 1);
            } else {
                return binarysearch(arr, target, mid + 1, high);
            }
        } else {
            return -1;
        }

    }

    public static void findMissingNumber(int[] arr, int arrLength) {
        int itemSum = arrLength * (arrLength + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arrLength; i++) {
            sum += arr[i];
        }

        System.out.println(itemSum - sum);
    }

    public static void squareRoot(int x) {
        if (x == 1 || x == 0) {
            System.out.println(x);
        }
        int i = 1;
        int result = 1;
        while (x >= result) {
            i++;
            result = i * i;
        }

        System.out.println(i - 1);

    }

    public static int raisedToPower(int number, int power) {
        if (power != 0) {
            return number * raisedToPower(number, power - 1);
        } else {
            return 1;
        }

    }

    public static int findGCD(int first, int second) {
        while (first != second) {
            if (first > second) {
                    first -= second;
                } else {
                    second -= first;
                }
            }

return first;
    }

   public static void sumOfNaturalNumber(int number){
        int sum = 0;
        for (int i = 1; i < number; i++){
            sum += i;
        }
       System.out.println(sum);
   }

   public static void finabocci(int number){
        int firstDigit = 0;
        int secondDigit = 1;
        int sum = 0;
        for (int i = 0; i < number; i++){
            sum = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = sum;
            System.out.println(sum);
        }


   }

   public static void reverseAnumber(int number){
        int result = 0;
        while (number!=0){
            int remainder = number % 10;
            result = result * 10 +remainder;
            number/=10;

        }
       System.out.println(result);
   }

   public static void raiseToPower(int number, int power){
        int result = 1;
        while (power!=0){
            result *= number;
            --power;

        }

       System.out.println(result);
   }

   public static int palindromeNumber(int number){
        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return  reverse;
   }

   public static void reverseString(String value){
        String initial = value;
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        builder.reverse();
       System.out.println(initial);
       System.out.println(builder);
   }

   public static void getFirstNonReapeatingCharacter(String value){
        String[] charArray = value.split("");
        int count = 0;
       HashMap<String , Integer> hashMap = new HashMap<>();

       for (String currentLetter : charArray) {
           if (!hashMap.containsKey(currentLetter)) {
               hashMap.put(currentLetter, 1);
               count = 1;

           } else {
               count++;
               hashMap.put(currentLetter, count);
           }
       }

       for (int j = 0; j< charArray.length; j++){
           String letter = charArray[j];
           if (hashMap.get(letter)==1){
               System.out.println(letter);
               break;
           }
       }


       System.out.println(hashMap);
   }


    int firstDuplicate(int[] a) {
        //input -> array of int
        // output->int
        Set<Integer> hashset = new HashSet<>();
        for(int num : a){
            if(!hashset.add(num)){
                return num;
            }
        }


        return -1;


    }


   static void rotateImage(int[][] a) {
        //input- two array
        // output two rotatated array
        int [][] output = {};



        for(int i = 0; i< a.length; i++){
            for(int j=1; j < a.length; j++){
                int position = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = position;

            }
        }

        for (int i =0; i< a.length; i++){
            for(int j = 0; j < a.length/2; i++){
                int position = a[i][j];
                a[i][j] = a[i][a.length-1-j];
                a[i][a.length-1-j] = position;


            }
        }

    }



    boolean sudoku2(char[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != '.'){
                    char tmp = grid[i][j];
                    for(int k = j+1; k < grid[0].length; k++){
                        if(tmp == grid[i][k]){
                            return false;
                        }
                    }
                    for(int l = i+1; l < grid.length; l++){
                        if(tmp == grid[l][j]){
                            return false;
                        }
                    }
                    int x = 0;
                    int y = 0;
                    if(i < 3){
                        x = 0;
                    }
                    if(j < 3){
                        y = 0;
                    }
                    if(i > 3 && i < 6){
                        x = 3;
                    }
                    if(j > 3 && j < 6){
                        y = 3;
                    }
                    if(i  > 6){
                        x = 6;
                    }
                    if(j > 6){
                        y = 6;
                    }
                    int tmp2 = 0;
                    for(int p = x; p < x+3; p++){
                        for(int g = y; g < y+3; g++){
                            if(grid[p][g] == tmp){
                                tmp2++;
                            }
                        }
                    }
                    if(tmp2 >= 2){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    int[][] rotateImage2(int[][] a) {
        //input- two array
        // output two rotatated array
        int colLenght = a[0].length;
        int rowLength = a.length;
        int[][] r = new int[rowLength][colLenght];
        for(int i = 0; i < a.length; i++) {
            for(int j = a.length - 1, rc = 0; j >= 0 && rc < a.length; j--, rc++) {
                r[i][rc] = a[j][i];
            }
        }
        return r;


    }


    boolean isCryptSolution(String[] crypt, char[][] solution) {
        String[] values = new String[crypt.length];

        // iterate through the crypt
        for (int i = 0; i < crypt.length; i++) {
            char[] word = crypt[i].toCharArray();
            // ensure there is actually a word
            if (word.length == 0) return false;

            values[i] = "";
            // iterate through the crypt word
            for (int x = 0; x < word.length; x++) {
                // set the variable in the values array to the mapped value
                values[i] += GetMappedCharacter(word[x], solution);
            }
        }

        // ensure we have no leading zeros
        if (HasLeadingZero(values[0]) || HasLeadingZero(values[1]) || HasLeadingZero(values[2])) return false;

        // ensure we meet the word[1] + word[2] = word[3] restriction
        return Long.parseLong(values[0]) + Long.parseLong(values[1]) == Long.parseLong(values[2]);
    }

    boolean HasLeadingZero(String value) {
        char[] chars = value.toCharArray();
        if (chars.length > 1 && chars[0] == '0') return true;
        if (chars.length == 0) return true;
        return false;
    }

    char GetMappedCharacter(char c, char[][] map) {
        // check the map for the corresponding value
        for (int i = 0; i < map.length; i++) {
            if (map[i][0] == c) {
                return map[i][1];
            }
        }
        return '0';
    }


    boolean almostIncreasingSequence(int[] sequence) {
        int max = Integer.MIN_VALUE, count = 0;
        boolean flag = true;
        for (int j = 0; j < sequence.length; j++){
            if ( max >= sequence[j]){
                count++;
            }
            max = sequence[j];
            if ( count > 1){
                flag = false;
                break;
            }
        }
        return flag;
    }


    int[][] meanGroups(int[][] a) {
        Map<Double, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            int[] arr = a[i];
            double sum = 0;
            for(int x : arr) sum += x;
            sum /= arr.length;
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return map.values().stream().map(l -> l.stream().mapToInt(x->x).toArray()).sorted((x,y)->x[0]-y[0]).toArray(int[][]::new);
    }

//    long hashMap(String[] queryType, int[][] query) {
//        long sum = 0;
//        int currKey = 0;
//        int currValue = 0;
//
//        Map<Integer, Integer> values = new HashMap<>();
//
//        for (int i = 0; i < queryType.length; i++) {
//            String currQuery = queryType[i];
//            if (isInsert(currQuery)) {
//                if (didWeCopiedValuesToMap(currKey, currValue, values)) {
//                    currValue = 0;
//                    currKey = 0;
//                }
//                values.put(query[i][0], query[i][1]);
//            } else if (isAddToValue(currQuery)) {
//                currValue += values.isEmpty() ? 0 : query[i][0];
//            } else if (isAddToKey(currQuery)) {
//                currKey += values.isEmpty() ? 0 : query[i][0];
//            } else if (isGet(currQuery)) {
//                if (didWeCopiedValuesToMap(currKey, currValue, values)) {
//                    currValue = 0;
//                    currKey = 0;
//                }
//                sum += values.get(query[i][0]);
//            }
//        }
//
//        return sum;
//    }

    private boolean isGet(String currQuery) {
        return "get".equals(currQuery);
    }

    private boolean isAddToKey(String currQuery) {
        return "addToKey".equals(currQuery);
    }

    private boolean isAddToValue(String currQuery) {
        return "addToValue".equals(currQuery);
    }

    private boolean isInsert(String currQuery) {
        return "insert".equals(currQuery);
    }

    private boolean didWeCopiedValuesToMap(int currKey, int currValue, Map<Integer, Integer> values) {
        HashMap<Integer, Integer> copiedValues = new HashMap<>();

        if (currKey != 0 || currValue != 0) {
            Set<Integer> keys = values.keySet();

            for (Integer key : keys) {
                copiedValues.put(key + currKey, values.get(key) + currValue);
            }

            values.clear();
            values.putAll(copiedValues);

            return true;
        }

        return false;
    }


    long hashMap(String[] queryType, int[][] query) {
        Map<Long, Long> map = new HashMap<>();
        long sum = 0, addedToKey = 0, addedToValue = 0;
        for (int i = 0; i < query.length; i++) {
            int[] args = query[i];
            switch (queryType[i]) {
                case "insert":
                    map.put(args[0] - addedToKey, args[1] - addedToValue);
                    break;
                case "get":
                    sum += map.get(args[0] - addedToKey) + addedToValue;
                    break;
                case "addToKey":
                    addedToKey += args[0];
                    break;
                case "addToValue":
                    addedToValue += args[0];
            }
        }
        return sum;
    }



    private  static int[] isZigZag( int [] number){
        int n = number.length;
        int [] res = new int[n -2];
        for (int i = 2; i < n; ++i){
            int a = number[i-2];
            int b = number[i-1];
            int c = number[i];
            if (b > a && b > c || a > b && b < c){
                    res[i-2] = 1;
            }

            return  res;

        }
return  null;
}



    int[] mutateTheArray(int n, int[] a) {
        int b[] = new int[a.length];
        if(a.length == 1)
            return a;
        for(int i = 0; i < a.length; i++)
        {
            if(i == 0)
            {
                b[0] = 0 + a[i] + a[i + 1];
            }
            else if(i == a.length-1)
            {
                b[a.length-1] = a[i - 1] + a[i] + 0;
            }
            else
            {
                b[i] = a[i - 1] + a[i] + a[i + 1];
            }
        }
        return b;

    }

    int[] mutateTheArray2(int n, int[] a) {
        int b[] = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
            b[i] += i > 0 ? a[i-1] : 0;
            b[i] += i < a.length-1 ? a[i+1] : 0;
        }

        return b;

    }

    int minDiffOfArrays(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;

        // Find sum of absolute differences
        int sum = 0 ;
        for (int i = 0; i < n; i++)
            sum = sum + Math.abs(a[i] - b[i]);

        return sum;
    }

   public static int findSumOfArray(List<Integer> array){
        int sum = 0;
        for (int i = 0; i < array.size(); i++){
            sum = sum + array.get(i);
        }

        return  sum;

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int aliceSum = 0;
        int bobSum = 0;
        List<Integer>sum = Arrays.asList(0,0);
        for (int i = 0; i < a.size(); i++){
            if (a.get(i) > b.get(i)) {
                sum.set(0, sum.get(0) + 1);
            }else if (a.get(i) < b.get(i)){
                sum.set(1,sum.get(i) + 1 );
            }
        }
        System.out.println(sum);
        return  null;

    }






}
