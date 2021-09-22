import java.util.*;
import java.util.stream.Collectors;

public class JavaChallenge {

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(3);
        ar.add(2);
        ar.add(1);
        System.out.println(isValid("aabbccddeefghi"));



//        System.out.println(rotLeft(ar,4));




//        List<Integer> ar = new ArrayList<>();
//        System.out.println(repeatedString("aba",10));
//        System.out.println(countingValleys(8, "UDDDUDUU"));

//        ar.add(0);
//        ar.add(0);
//        ar.add(1);
//        ar.add(0);
//        ar.add(0);
//        ar.add(1);
//        ar.add(0);



//        ar.add(10);
//        ar.add(20);
//        System.out.println(sockMerchant(9, ar));


    }

    public static int sockMerchant(int n, List<Integer> ar) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int pairs = 0;
        for (int i = 0; i< ar.size(); i++){
            int each = ar.get(i);
            if (!hashSet.contains(each)){
                hashSet.add(each);
            }else {
                hashSet.remove(each);
                pairs++;
            }
        }
return pairs;
    }


    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int valleyCount = 0;
        for (int i = 0; i < path.length(); i++){
            if (path.charAt(i) == 'D'){
                count--;
            }else {
                count++;
            }

            if (count == 0 && path.charAt(i) == 'U'){
                valleyCount ++;
            }
        }
        return  valleyCount;

    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int count = 0;
        int length = c.size();
        for (int i = 0; i < length  - 1; i++){
            if (c.get(i) == 0) {
                i++;

            }
            count++;
        }
      return count;
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        int count = 0;
        int anotherCounter = 0;
        long repeatingCounter = n / s.length();

        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == 'a'){
                count++;
                if (i < n % s.length()){
                    anotherCounter++;
                }
            }

        }

        long result = repeatingCounter * count + anotherCounter;
        return result;

    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxHourGlassSum = Integer.MIN_VALUE;

        for(int startRow = 0; startRow <= 3; startRow++) {
            for(int startCol = 0; startCol <= 3; startCol++ ) {
                int currentHourGlassSum =
                        arr.get(startRow).get(startCol) +
                                arr.get(startRow).get(startCol + 1) +
                                arr.get(startRow).get(startCol + 2) +
                                arr.get(startRow + 1).get(startCol + 1) +
                                arr.get(startRow + 2).get(startCol) +
                                arr.get(startRow + 2).get(startCol + 1) +
                                arr.get(startRow + 2).get(startCol + 2);
                maxHourGlassSum = Math.max(maxHourGlassSum, currentHourGlassSum);
            }

        }
        return maxHourGlassSum;

    }


    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        for (int i = 0; i<d; i++){
            int item = a.get(0);
            a.remove(0);
            a.add(item);
        }

        return a;


    }


    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribe = 0;
        for(int i = (q.size()-1); i >= 0; i--) {
            if(q.get(i) -i-1 > 2) {
                System.out.println("Too chaotic");
                return;
            }
            int k = (q.get(i) -2 > 0) ? (q.get(i) -2) : 0;
            for (int j = k; j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    bribe++;
                }
            }
        }
        System.out.println(bribe);
    }


    static int minimumSwaps(int[] arr) {
        int count = 0;
        int i = 0;
        while (i<arr.length){
            if (arr[i]!=i+1){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                count ++;
            }else i++;
        }
        return count;

    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long[] cal = new long [n+2];
        long max = 0,tmp= 0;
        for(int i =0;i<queries.size();i++){

            int begin = queries.get(i).get(0);
            int end = queries.get(i).get(1);
            int val = queries.get(i).get(2);

            cal[begin] += val;
            cal[end+1] -=val;

        }
        for(int j = 0;j<cal.length;j++){
            tmp += cal[j];

            if(max < tmp){
                max = tmp;
            }

        }

        return max;


    }


    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        boolean canReplicate = true;
        for (String word : note) {
            if (!magazine.remove(word)) {
                canReplicate = false;
                break;
            }
        }
        System.out.println(canReplicate ? "Yes" : "No");
    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        String [] array1 = s1.split("");
        String [] array2 = s2.split("");

        HashSet<String> hashOne = new HashSet<>();
        Collections.addAll(hashOne, array1);

        HashSet<String>hashTwo = new HashSet<>();
        Collections.addAll(hashTwo,array2);

        boolean result = Collections.disjoint(hashOne,hashTwo);
        if (result) {
           return  "NO";
        }else {
           return "YES";
        }

    }

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        int start = 0 ;
        int end = start + 1;
        int strLength = s.length();
        int counter = 0;
        HashMap<String,Integer> str = new HashMap<>();
        while(start < strLength){
            char[] c = s.substring(start,end).toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);

            if(!str.containsKey(temp))
                str.put(temp, 1);
            else{
                int freq = str.get(temp);
                counter += freq;
                str.put(temp, freq + 1);
            }
            end++;
            if(end > strLength){
                start++;
                end = start + 1;
            }
        }
        return counter;


    }


    static long countTriplets(List<Long> arr, long r) {
        long num=0;
        HashMap<Long,Long> map = new HashMap<>();
        HashMap<Long,Long> poten = new HashMap<>();
        for(int j=arr.size()-1;j>=0;j--){
            long i= arr.get(j);
            if(poten.containsKey(i*r)){
                num+=poten.get(i*r);
            }
            if(map.containsKey(i*r)){
                if(poten.containsKey(i)){
                    poten.put(i,poten.get(i)+map.get(i*r));
                }
                else{
                    poten.put(i,map.get(i*r));
                }
            }

            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,Long.valueOf(1));
            }
        }
        return num;


    }

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int maxFr = 0;
        for(List<Integer> ops : queries) {
            int op = ops.get(0);
            int data = ops.get(1);
            Integer v = map.get(data) == null ? 0 : map.get(data);
            if(op == 1) {//insert
                map.put(data, ++v);
                maxFr = Math.max(maxFr, v);
            } else if(op == 2) {//delete
                if(v > 0) {
                    map.put(data, --v);
                }
            } else { //frequency
                if(data <= maxFr && map.containsValue(data)) ans.add(1);
                else ans.add(0);
            }
        }
        return ans;

    }

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int len = a.size();
        int swaps = 0;
        int temp = 0;
        for (int j=0; j<len-1; j++) {
            for (int i=0; i<len-j-1; i++) {
                if (a.get(i)>a.get(i+1)) {
                    temp = a.get(i);
                    a.set(i, a.get(i+1));
                    a.set(i+1, temp);
                    swaps += 1;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(len-1));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        int i =0;
        int toy = 0;
        Collections.sort(prices);
        while(i < prices.size() && (k - prices.get(i) > 0)){
            k = k - prices.get(i);
            toy++;
            i++;
        }
        return toy;

    }
    static int findPos(List<Integer> list, int val) {
        int beg = 0, end = list.size()-1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (list.get(mid) <= val) {
                beg = mid+1;
            } else {
                end = mid-1;
            }
        }
        return beg;
    }


    public static int activityNotifications(List<Integer> expenditure, int d) {


        List<Integer> track = new ArrayList<>();

        int notify = 0;

        for (int i = 0; i < expenditure.size()-1; i++) {
            float exp = (float) expenditure.get(i);
            int pos = findPos(track, expenditure.get(i));

            if (pos < 0) track.add(expenditure.get(i));
            else track.add(pos, expenditure.get(i));

            if (track.size() < d) continue;
            exp = (float) expenditure.get(i + 1);

            float median = (d % 2 == 0) ? (float)(track.get((d-1)/2) + track.get(d/2))/2 : (float) track.get(d/2);

            if (exp >= 2*median) notify++;


            pos = findPos(track, expenditure.get(i - d + 1)); // O(log n)
            track.remove(pos-1);
        }
        return notify;

    }

    public static long mergeSort(List<Integer> ls,int l,int r){
        long inversion=0;
        if(l<r){
            int mid=l+(r-l)/2;
            inversion+=mergeSort(ls,l,mid);
            inversion+=mergeSort(ls,mid+1,r);
            inversion+= mergeCount(ls,l,mid,r);
        }
        return inversion;
    }

    public static long mergeCount(List<Integer> ls,int l,int mid,int r){
        long inv=0;
        int a[]=new int[mid-l+1];
        int b[]=new int[r-mid];
        int n1=mid-l+1,n2=r-mid;

        for(int i=0;i<n1;i++){
            a[i]=ls.get(i+l);
        }
        for(int i=0;i<n2;i++){
            b[i]=ls.get(mid+1+i);
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                ls.set(k,a[i]);
                i++; k++;
            }
            else{
                ls.set(k,b[j]);
                inv+=n1-i;
                k++; j++;
            }
        }
        while(i<n1){
            ls.set(k,a[i]);
            i++;
            k++;
        }
        while(j<n2){
            ls.set(k,b[j]);
            j++;
            k++;
        }
        return inv;
    }
    public static long countInversions(List<Integer> arr) {
        // Write your code here
        return   mergeSort(arr,0,arr.size()-1);
    }


    public static int makeAnagram(String a, String b) {
        // Write your code here
        int[] freq = new int[26];
        a.chars().forEach((c) -> {
            freq[c - 97]++;
        });
        b.chars().forEach((c) -> {
            freq[c - 97]--;
        });
        return Arrays.stream(freq).map(Math::abs).sum();

    }

    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;
        char lastItem = 0;

        for(char item: s.toCharArray()){
            if(lastItem == item){
                count++;
            }
            lastItem = item;
        }
        return count;
    }

    public static String isValid(String s) {
        // Write your code here
        char first = s.charAt(0);
        long count = s.chars().filter(value -> value == first).count();

        if(s.chars().distinct().filter(value -> s.chars().filter(value2 -> value == value2).count() != count).count() > 1){
            return "NO";
        }

        return "YES";

    }

    static long substrCount(int n, String s) {
        long res = n;
        for(int i=0;i<n;i++){
            boolean isAfterMedian = false;
            int beforeMedian = 1;
            char current = s.charAt(i);
            for(int j=i+1;j<n;j++){
                if(!isAfterMedian){
                    if(s.charAt(j) == current){
                        res++;
                        beforeMedian++;
                    }
                    if(s.charAt(j) != current) {
                        isAfterMedian = true;
                    };
                }
                else{
                    if(s.charAt(j) == current && beforeMedian > 0) {
                        beforeMedian--;
                        if(beforeMedian == 0) res++;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return res;

    }


    public static int commonChild(String s1, String s2) {
        // Write your code here
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        int [][] a = new int [s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(ch1[i-1] == ch2[j-1])
                {
                    a[i][j] = 1+ a[i-1][j-1];
                }
                else
                {
                    a[i][j] = Math.max(a[i-1][j] , a[i][j-1]);
                }
            }
        }
        return a [s1.length()][s2.length()];
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.size() -1;i++){
            min = Math.min(min,Math.abs(arr.get(i+1) - arr.get(i)));
        }
        return min;

    }

    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int s=0;
        int n =contests.size();
        int arr[]= new int[100];
        for(int i=0; i<n;i++){
            s = s + contests.get(i).get(0);
            if(contests.get(i).get(1) ==1)
                arr[i]= contests.get(i).get(0);
        }
        Arrays.sort(arr);
        for(int j =0; j<arr.length-k;j++){
            s= s- (2* arr[j]);
        }
        return s;

    }

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int bought = 0;
        int cost = 0;
        int frequency = 1;
        for (int i = c.length - 1; i >= 0; i--) {
            if (bought < k) {
                cost += c[i];
            } else {
                frequency = bought / k;
                cost += (frequency + 1) * c[i];
            }
            bought++;
        }
        return cost;

    }

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.size()-k;i++){
            min = Math.min(min, arr.get(k + i - 1) - arr.get(i));
        }
        return min;

    }

    public static String reverseShuffleMerge(String s) {
        // Write your code here
        int [] available = new int[26];
        int [] required = new int[26];
        int [] used = new int[26];


        for(char c : s.toCharArray())
            available[c-'a']++;

        for(int i=0; i<26; i++)
            required[i] = available[i]/2;

        StringBuilder sb = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--) {

            char ch = s.charAt(i);
            available[ch-'a']--;

            if(used[ch-'a'] == required[ch-'a'])
                continue;

            while(sb.length()>0 && ch < sb.charAt(sb.length()-1) && available[sb.charAt(sb.length()-1)-'a'] + used[sb.charAt(sb.length()-1)-'a'] > required[sb.charAt(sb.length()-1)-'a'])
            {
                char removedCh = sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                used[removedCh-'a']--;
            }
            sb.append(ch);
            used[ch-'a']++;

        }


        return sb.toString();

    }

    public static void whatFlavors(List<Integer> cost, int money) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.size(); i++) {
            int complement = money - cost.get(i);
            if (map.containsKey(complement)) {
                System.out.print(map.get(complement)+1+" "+(i+1)+"\n");
                break;
            }
            map.put(cost.get(i), i);
        }

    }

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<>();
        for (int k : queries) {
            swapNodes(indexes, 1, k, 1);

            List<Integer> currTraversal = new ArrayList<>();
            inOrderTraversal(indexes, 1, currTraversal);
            result.add(currTraversal);
        }
        return result;

    }

    public static void swapNodes(
            List<List<Integer>> list, int i, int k, int depth) {
        if (i == -1) return;
        if (depth % k == 0) {
            int tmp = list.get(i - 1).get(0);
            list.get(i - 1).set(0, list.get(i - 1).get(1));
            list.get(i - 1).set(1, tmp);
        }
        swapNodes(list, list.get(i - 1).get(0), k, depth + 1);
        swapNodes(list, list.get(i - 1).get(1), k, depth + 1);
    }

    public static void inOrderTraversal(
            List<List<Integer>> indexes,
            int i,
            List<Integer> currTraversal) {

        if (i == -1)
            return;
        inOrderTraversal(indexes, indexes.get(i - 1).get(0), currTraversal);
        currTraversal.add(i);
        inOrderTraversal(indexes, indexes.get(i - 1).get(1), currTraversal);
    }

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int res = 0;

        Set<Integer> l = new HashSet<Integer>(){{
            for(int i : arr)
                add(i);
        }};

        for(int i : l){
            if(l.contains(i+k))
                res++;
        }

        return res;

    }

    static long triplets(int[] a, int[] b, int[] c) {
        int[] arr = Arrays.stream(a).sorted().distinct().toArray();
        int[] brr = Arrays.stream(b).sorted().distinct().toArray();
        int[] crr = Arrays.stream(c).sorted().distinct().toArray();
        long result = 0;
        for(int i = 0; i < brr.length; i++) {
            int aquant = Math.abs(Arrays.binarySearch(arr, brr[i]) + 1);
            int cquant = Math.abs(Arrays.binarySearch(crr, brr[i]) + 1);
            result += (long)aquant * cquant;
        }
        return result;

    }

    static long minTime(long[] machines, long goal) {
        Arrays.sort(machines);
        long max = machines[machines.length - 1];
        long minDays = 0;
        long maxDays = max*goal;
        long result = -1;
        while (minDays < maxDays) {
            long mid = (minDays + maxDays) / 2;
            long unit = 0;
            for (long machine : machines) {
                unit += mid / machine;
            }
            if (unit < goal) {
                minDays = mid+1;
            } else {
                result = mid;
                maxDays = mid;
            }
        }
        return result;

    }

    public static long maximumSum(List<Long> a, long m) {
        // Write your code here
        long maxSum=0;

        TreeSet<Long> prefix = new TreeSet<Long>();
        long currSum=0;

        for(int i=0;i<a.size();i++){
            currSum=(currSum+ a.get(i) %m)%m;
            maxSum=Math.max(maxSum, currSum);

            Long pr = prefix.higher(currSum);
            if(pr != null){
                maxSum= Math.max(maxSum, (currSum-pr+m)%m);
            }
            prefix.add(currSum);
        }

        return maxSum;

    }

    public static long minimumPasses(long m, long w, long p, long n) {
        // Write your code here
        long candies = 0;
        long invest = 0;
        long spend = Long.MAX_VALUE;

        while (candies < n) {
            // preventing overflow in m*w
            long passes = (long) (((p - candies) / (double) m) / w);

            if (passes <= 0) {
                // machines we can buy in total
                long mw = candies / p + m + w;
                long half = mw >>> 1;
                if (m > w) {
                    m = Math.max(m, half);
                    w = mw - m;
                } else {
                    w = Math.max(w, half);
                    m = mw - w;
                }
                candies %= p;
                passes++;
            }

            // handling overflowing
            // if overflowing is encountered -> candies count are definitely more than long
            // thus it is more than n since n is long
            // so we've reached the goal and we can break the loop
            long mw;
            long pmw;
            try {
                mw = Math.multiplyExact(m, w);
                pmw = Math.multiplyExact(passes, mw);
            } catch (ArithmeticException ex) {
                // we need to add current pass
                invest += 1;
                // increment will be 1 because of overflow
                spend = Math.min(spend, invest + 1);
                break;
            }

            candies += pmw;
            invest += passes;
            long increment = (long) Math.ceil((n - candies) / (double) mw);
            spend = Math.min(spend, invest + increment);
        }

        return Math.min(spend, invest);

    }




}

//class Checker implements Comparator<Player> {
//    @Override
//    public int compare(Player a, Player b) {
//        if(a.score != b.score) {
//            return b.score - a.score;
//        }
//        return a.name.compareTo(b.name);
//    }
//}
