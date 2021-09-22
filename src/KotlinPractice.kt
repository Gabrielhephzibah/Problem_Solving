import java.lang.Integer.reverse
import java.util.*

fun main(arg : Array<String>){
    val array = intArrayOf(8, 7, 10,6, 4)
    val myString = "goof job"
    val scanner = Scanner(System.`in`)
    println(numberPower(5, 3))
    findGCD()
    var a = 6
    var b = 9
    var c = a
    a = b
    b = c
    println(a)
    println(b)
//    print("Enter a number")
//    val num = scanner.nextInt()
//    squareRoot(num) //
//    val multiply = num * 2
//    scanner.nextLine()
//
//    print("Enter a text")
//    val  s = scanner.nextLine()
//    println(multiply)
//    println(s)




//    largestItemInArray(array)
//    maxAndMinArray(array)
//    reverseArray(array)
//    print(reverseString(myString))

//    val myArray = mutableListOf<Int>(1, 7, 8, 3,1,3,2,5,6,7)
//    sortAscending(myArray)
//    findFactorial(10)

//    val element = 10;
//    val high = array.size-1
//    var result = binarySearchByRecursion(array,element,0,high)
//
//    if (result == -1){
//        print("Not a in the array")
//    }else{
//        print("$element is the array at index $result")
//    }

//    reverseArrayRecursion(array, 0)

//    val arr = intArrayOf(1, 2, 4, 5, 6 )
//    val n = arr.size + 1
//    findmissingNumber(arr, n)


}

fun largestItemInArray(arrayList: IntArray){
    var largest = arrayList[0]
    for (value in arrayList){
        if (largest < value){
            largest = value
        }
    }
    print(largest)

}

fun maxAndMinArray(arrayList: IntArray){
    var max = arrayList[0]
    var min = arrayList[0]
    for (i in arrayList.indices){
        max = kotlin.math.max(max, arrayList[i])
        min = kotlin.math.min(min, arrayList[i])

    }
    println(max)
    println(min)
}

fun reverseArray(arrayList: IntArray){
    arrayList.reverse()
   print( arrayList.contentToString())
}

fun reverseArrayRecursion(arrayList: IntArray, next : Int){
    if (next == arrayList.size) return

    val value = arrayList[next]

    reverseArrayRecursion(arrayList, next+1)

    arrayList[arrayList.size - next -1] = value

   print(arrayList.contentToString())
}

fun reverseString(s: String) : String{
    if (s.isEmpty()) {
        return s
    }

    return reverseString(s.substring(1)) + s[0]

}

fun sortAscending(arr : MutableList<Int>){
    arr.sort()
    print(arr)

}

fun findFactorial(number: Int){
    var factorial = 1
    for(n in 1..number){
        factorial*=n
    }
    print(factorial)

}

fun binarySearchByRecursion(arr: IntArray, element: Int, low : Int, high: Int) : Int{
    if(high >= low){
        var min = low+(high +low)/2

        if (arr[min] == element){
            return min
        }
        return if (arr[min] > element){
            binarySearchByRecursion(arr, element, low, min-1)
        }else{
            binarySearchByRecursion(arr,element, min + 1, high)
        }


    }
    return  -1
}

fun  findmissingNumber(arr: IntArray, number: Int){
   var sum = 0;
    val elementSum = number*(number + 1)/2
    for (i in 0 until number - 1){
        sum += arr[i]
    }
    print(elementSum - sum)
}

fun squareRoot(x: Int){
    if (x == 1 || x == 0){
        println(x)
    }
    var i = 1
    var result = 1
    while (result <= x ){
        i++
        result = i+ i
    }
    println(i - 1)
}

fun numberPower(number: Int, power : Int): Int{
    return if (power!=0){
        number * numberPower(number, power-1)
    }else{
        1
    }
}

fun findGCD(){
    var x = 54;
    var y = 24
    while (x != y){
        if (x > y){
            x -= y
        }else{
           y -= x
        }

    }
    print(x)


}








