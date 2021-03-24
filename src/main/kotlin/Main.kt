

fun main() {
    val x = isEven(5)
    println(x)

}

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

fun print10Numbers() {
    for(i in 1..10){
        println(i)
    }
}
