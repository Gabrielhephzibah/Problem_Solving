import java.lang.Math.abs

fun main(arg : Array<String>){
    val arr = intArrayOf(-2, 2,3,0, 0, 4, -7)
    println(solution(arr))


}


fun solution(n : Int) : String {
    var pattern = ""

    for (i in 1..n){
        pattern += if (i % 2 != 0){
            "+"
        }else{
            "-"
        }
    }

    return  pattern

}

fun solution(arr: IntArray): Int {
    val map = HashMap<Int, Int>()
    map[0] = 1
    var psum = 0
    var ans = 0
    for (i in arr.indices) {
        psum += arr[i]
        if (map.containsKey(psum)) {
            ans += map[psum]!!
        }
        map[psum] = map.getOrDefault(psum, 0) + 1
    }
    return if (ans >= 1_000_000) -1 else ans
}


fun MaximumPossible(num: Int): Int {
    // edge case
    var num = num
    if (num == 0) {
        return 5 * 10
    }

    // -1 if num is negative number else 1
    val negative = num / abs(num)
    // get the absolute value of given number
    num = abs(num)
    var n = num
    // maximum number obtained after inserting digit.
    var maxVal: Int = Int.MIN_VALUE
    var counter = 0
    var position = 1

    // count the number of digits in the given number.
    while (n > 0) {
        counter++
        n = n / 10
    }

    // loop to place digit at every possible position in the number,
    // and check the obtained value.
    for (i in 0..counter) {
        val newVal = num / position * (position * 10) + 5 * position + num % position

        // if new value is greater the maxVal
        if (newVal * negative > maxVal) {
            maxVal = newVal * negative
        }
        position *= 10
    }
    return maxVal
}

