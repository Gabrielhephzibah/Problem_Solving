
import java.util.*
import javax.print.attribute.standard.PrinterLocation
import kotlin.math.abs
import kotlin.math.pow

fun main(args : Array<String>){
//       printUserInput()
//        println(multiplyTwoFloatingNumber())
//        println(convertCharToASCII())
//        println(getQuotientAndRemainder())
//        println(swapTwoNumber())
//        println(swapNumberWithoutAnotherValue())
//    findLargestNumberInThreeNumber()
//    println(checkIfNumberIsEvenOrOld())
   // println(checkIfAlphabetIsVowelOrConsonant())
//        val sum = addTwoIntegers()
//        println("The sum of the two number is $sum")
   // rootOfQuadraticEquation()

 //   checkLeapYear()

//   checkIfYearIsALeapYear()
//    checkIfNumberIsPositiveOrNegative()
//    checkIfCharacterIsAnAlphabet()
   // calculateTheSumOfNaturalNumbers()
 //   findTheFactorialOfNumber()
 //   generateMultiplicationTable()
   // displayFibonacciSeries()
 //   findGreatestCommonDivisor()

   // findLowestCommonDivisor()
  //  printCharacterFromAtoZ()
  //  countNumberOfDigitInInteger()
   // reverseANumber()
//    displayFibonacciSeries()
   // calThePowerOfANumber()

   // checkIfNumberIsPalindromesOrNot()

   // getPrimeNumbers()

 //   checkIfNumberIsPrime()

//    armStrong()










    }

 fun printUserInput(){
     val reader = Scanner(System.`in`)
     println("Please input a number")

     val userInput = reader.nextInt()

     println(userInput)

     // without using scanner class

     val read = readLine()
     var input = read.toString()

     print(input)


 }


fun addTwoIntegers() : Int {
    val reader = Scanner(System.`in`)
    println("Please Input your first Number : ")

    var firstNumber = reader.nextInt()

    println("Please input your second number :")

    var secondNumber = reader.nextInt()

    val result =  firstNumber + secondNumber



    return result

}

fun multiplyTwoFloatingNumber() : Float {
    val one = 1.5f
    val two = 2.0f
    val result = one * two
    return  result

}

fun convertCharToASCII() : Int {
    val char = 'H'
    val result = char.toInt();
    return  result

}

fun getQuotientAndRemainder(): String{
    val number = 25
    val divider = 4
    val division  = number / divider
    val remainder = number % divider
    return "The division is $division and the remainder is $remainder"

}

fun swapTwoNumber() :  String {
    var first = 45
    var second = 80

    var temporal = first

    first = second

    second = temporal

     return "Now the value of first has been swapped to $first and the value of second has been swapped to $second"
}


fun swapNumberWithoutAnotherValue() : String{
    var firstNo = -4
    var secondNo = -7

    firstNo = firstNo - secondNo
    secondNo = firstNo + secondNo
    firstNo = secondNo - firstNo

    return "Now the value of first has been swapped to $firstNo and the value of second has been swapped to $secondNo"

}

fun checkIfNumberIsEvenOrOld() : String{
    val scanner = Scanner(System.`in`)
    println("Please enter a number")
   val input = scanner.nextInt()
//    while (input %2 != 0){
//        println("$input is an odd number, please try again")
//        input = scanner.nextInt()
//
//
//    }
//    return  "$input is an even number"
//    if (input % 2 == 0){
//        return "$input is an even number"
//    }else{
//        return  " $input is an odd number"
//    }

    return if (input % 2 == 0) "even" else "odd"

}

fun checkIfAlphabetIsVowelOrConsonant() : String{
    val scanner = Scanner(System.`in`)
//    var input = readLine()?.first()
    var input = scanner.next().single()

    //************************ USING IF STATEMENT *******************
//    return (if (input == 'A'.toLowerCase() || input == 'E'.toLowerCase() || input == 'I'.toLowerCase() || input == 'O'.toLowerCase() || input == 'U') "It's a vowel"
//    else "it's a consonant letter")

    //****************** USING WHEN STATEMENT ********************

    return when(input){
        'A', 'E', 'I', 'O', 'U'.toLowerCase() -> "it's a vowel"
        else -> "it's a consonant"
    }
}

 fun findLargestNumberInThreeNumber() {
     var numbers = arrayOf(0, 0, 0)
     println(numbers.max())


//     var one = 78
//     var two = 8
//     var three = 1
//
//     if (one >= two && one >= three){
//         println("$one is the greatest Number")
//     }else if (two >= one && two >= three){
//         println("$two is the greatest number")
//     }else{
//         println("$three is the greatest number")
//     }


     val scanner = Scanner(System.`in`)
     var input = scanner.nextInt()
     var inputTwo = scanner.nextInt()
     var inputThree = scanner.nextInt()
     when {
         input >= inputTwo && input >= inputThree -> println("$input is the greatest number")
         inputTwo >= input && inputTwo >= inputThree -> println("$inputTwo is the greatest number")
         else -> println("$inputThree is the greatest number")


     }
 }

    fun rootOfQuadraticEquation() {
        // *********** FORMULAS *******************
        // x= b
        val a = 3.5
        val b = 4.5
        val c = 5
        val rootOne: Double
        val rootTwo: Double
        val outPut: String

        val determinant = b * b - 4.0 * a * c

        if (determinant > 0) {
            rootOne = -b - Math.sqrt(determinant) / (2 * a)
            rootTwo = -b + Math.sqrt(determinant) / (2 * a)
            outPut = "rootOne = $rootOne and rootTwo = $rootTwo"

        } else if (determinant == 0.0) {
            rootTwo = -b / (2 * a)
            rootOne = rootTwo

            outPut = "rootOne = rootTwo  = $rootOne"

        } else {
            val realPart = -b / (2 * a)
            val imaginaryPart = Math.sqrt(-determinant) / (2 * a)
            outPut = "rootOne = ${realPart + imaginaryPart} and rootTwo = ${realPart + imaginaryPart}"
        }

        println(outPut)
    }



fun checkIfYearIsALeapYear(){
    val year = 1900
    if(year % 4 == 0 ){
        if (year % 100 == 0){
            if (year % 400 == 0){
                print("$year is a leap year")
            }else{
                print("$year is not a leap year")
            }

        }else{
            print("$year is a leap year")
        }
    }else{
        print("$year is not a leap year")
    }
}

fun checkIfNumberIsPositiveOrNegative(){
    val reader = Scanner(System.`in`)
    println("Please Input a number")
    val input = reader.nextInt()
    if (input >= 0 ){
        print("$input is a positive number")
    }else{
        print("$input is a negative number")
    }
}

fun checkIfCharacterIsAnAlphabet(){
    val char  = '9'

//    if (char >= 'a' && char <= 'z' || char >= 'A' && char <= 'Z'){
//        print("$char is an aplphabet")
//    }else{
//        print("$char is not an alphabet")
//    }
// ******************* Using Range ***************************
    if (char in 'a'..'z' || char in 'A'..'Z'){
        print("$char is an alphabet")
    }else{
        print("$char is not an alphabet")
    }
}


fun  calculateTheSumOfNaturalNumbers(){

    val naturalNumber = 10
    var sum = 0
    for( i in  1..naturalNumber){
      sum += i
    }
    print(sum)


}


fun  findTheFactorialOfNumber(){
    val number = 5
    var factorial = 1

    for (n in 1..number){
        factorial *= n


    }
    print(factorial)

}

fun generateMultiplicationTable(){
    val number = 5;

    for( j in 1..12){
        println("5 * $j = ${number * j}")
    }
}

// *************** Fibonacci series ia program where the value of the next number is the sum of the previous Two digit **************
// ******  I.E 0, 1, 1, 2, 3, 5, 8 ****************

fun displayFibonacciSeries(){
    val number  = 10
    var digitOne = 0
    var digitTwo = 1
    var sum = 0

    for (j in 0..number){

        sum = digitOne + digitTwo
        digitOne = digitTwo
        digitTwo = sum
        println(sum)

    }
}

fun findGreatestCommonDivisor(){
    var n1 = 81
    var n2 = 153
    while (n1 != n2){
        if (n1 > n2){
            n1 -= n2
        }else{
            n2 -= n1
        }
    }
    print(n1)
}

fun findLowestCommonDivisor(){
    var n1 =  16
    var n2 = 12
    var lcm = if (n1 > n2) n1 else n2
    var m1 = n1
    var m2 = n2
//
//    while (true){
//        if (lcm % n1 == 0 && lcm % n2 == 0){
//            print("The LCM is $lcm")
//            break
//        }
//        ++lcm
//    }

}


fun printCharacterFromAtoZ(){
    var character = 'z'
    for ( c in 'a'..character ){
        println(c)

    }
}

fun countNumberOfDigitInInteger() {
    val integer = 1234567
    print(integer.toString().length)

}

fun reverseANumber(){
    var number = 123456719
    var reverse = 0

    while (number != 0){
        val lastdigit = number % 10
        reverse = reverse * 10 + lastdigit
        number /= 10
    }
    print("Reverse is : $reverse")
}

fun calThePowerOfANumber(){
    val number = 3
    var power = 4
    var result= 1



    while ( power != 0) {
        result *= number
        --power
    }

    println("Answer = $result")
}
//
//    print(number.pow(power))
//    for (r in 1.. abs(3)){
//        power = power * number
//
//    }
//    print(power)

fun checkIfNumberIsPalindromesOrNot(){
    var number = 11221
    var reverse = 0
    var initial = number
    while (number != 0){
        val lastDigit = number % 10
        reverse = reverse * 10 +lastDigit
        number /= 10

    }
    if (initial == reverse){
        println("$initial is a palindrome Number")
    }else{
        println("$initial is not a palindrome number")
    }
    println(reverse)
}

fun getPrimeNumbers() {
    var from = 0
    val high = 10
    while (from < high) {
        if (checkPrimeNumber(from))
            print(from.toString() +" ")
            ++from
    }
}



fun checkIfNumberIsPrime(){
    val number = 5
    var flag = false
    for ( i in 2 ..number/2){
        if (number % i == 0){
            flag = true
            break
        }
    }
    if (!flag){
        print("$number is a prime number")
    }else{
        print("$number is not a prime number")
    }
}

//fun getPrimeNumbers(){
////    var low = 0
////    val high = 10
////
////    while (low < high) {
////        if (checkPrimeNumber(low))
////            print(low.toString() + " ")
////
////        ++low
////    }
//}

//    for (i in 2..number/2){
//        if (number % i == 0){
//            flag = false
//             ++number
//            if (flag){
//                print(number)
//            }else{
//                print("$number is not a prime number")
//            }
//
//            break
//        }




//

fun checkPrimeNumber(num: Int): Boolean {
    var flag = true

    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }

    return flag
}

 // Arm strong number is a number in which the sum of cubes or each digit number is equal to  the number itself for example
 // 137 = 1*1*1 + 3*3*3 + 7*7*7
fun armStrong(){
     val number = 1634
     var originalNumber : Int
     var n = 0
     var  result = 0
     var remainer :Int

     originalNumber = number

     while (originalNumber != 0){
         originalNumber /= 10
         ++n
     }

     originalNumber = number

     while (originalNumber != 0){
         remainer = originalNumber % 10
         result += Math.pow(remainer.toDouble(), n.toDouble()).toInt()
         originalNumber /= 10
     }
     if (result == number){
         print("it's an armstrong number")
     }else{
         print("It's not an armstrong number")
     }
   }

fun armStrongNoBtwTwoInterval(){
    val lower = 999
    val higher = 99999


}

fun checkArmStrongNo(realnumber : Int) : Int{
    var  remainer : Int
    var myNumber = realnumber
    var n = 0
    var resu = 0
    while (realnumber != 0){
        remainer = myNumber % 10
        resu += Math.pow(remainer.toDouble(), n.toDouble()).toInt()
        myNumber /= 10
    }
    return myNumber
}

