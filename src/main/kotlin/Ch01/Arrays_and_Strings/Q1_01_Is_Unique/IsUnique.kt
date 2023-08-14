package Ch01.Arrays_and_Strings.Q1_01_Is_Unique

/** Determine a function if string has all a unique character */

fun isUniqueChars(str: String): Boolean {
    if (str.length > 128) return false

    val charSet = BooleanArray(128)
    for (element in str) {
        val strVal = element.code
        if (charSet[strVal]) return false
        charSet[strVal] = true
    }
    return true
}

fun main() {
    val words = arrayOf("abcde", "hello", "apple", "kite", "padle")

    for (word in words) {
        println(" $word  : ${isUniqueChars(word)} ")
    }
}