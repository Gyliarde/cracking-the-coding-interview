package Ch01.Arrays_and_Strings.Q1_02_CheckPermutation

import eq

/** Give two Strings, write a method to decide if one is a permutation of other */

fun isPermutation(first: String, second: String): Boolean {
    if (first.length != second.length) return false

    val sortedFirst = first.toCharArray().sorted().joinToString(separator = "")
    val sortedSecond = second.toCharArray().sorted().joinToString(separator = "")

    return sortedFirst == sortedSecond
}

fun main() {
    isPermutation("abc", "abc") eq true
    isPermutation("acb", "abc") eq true
    isPermutation("cba", "acb") eq true
    isPermutation("aab", "baa") eq true

    isPermutation("abc", "aab") eq false
    isPermutation("abc", "aac") eq false
}


