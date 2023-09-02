package Ch01.Arrays_and_Strings.Q1_02_CheckPermutation

import eq

/** Give two Strings, write a method to decide if one is a permutation of other */

fun isPermutationBySorting(first: String, second: String): Boolean {
    if (first.length != second.length) return false

    val sortedFirst = first.toCharArray().sorted().joinToString(separator = "")
    val sortedSecond = second.toCharArray().sorted().joinToString(separator = "")

    return sortedFirst == sortedSecond
}


/**
 *  In this approach first in create a IntArray for 128
 *  After do loop by first string and increment one by each char code position
 *  Loop by second array and decrement one by char code position
 *  if position of first array was less the zero, the permutation is false
 * */
fun isPermutationByIdenticalCounts(first: String, second: String) :Boolean {
    if (first.length != second.length) return false

    val letters = IntArray(128) //

    first.toCharArray().forEach {
        letters[it.code]++
    }

    second.toCharArray().forEach {
        letters[it.code]--
        if (letters[it.code] < 0) return false
    }

    return true
}

fun main() {
    isPermutationBySorting("abc", "abc") eq true
    isPermutationBySorting("acb", "abc") eq true
    isPermutationBySorting("cba", "acb") eq true
    isPermutationBySorting("aab", "baa") eq true
    isPermutationBySorting("abc", "aab") eq false
    isPermutationBySorting("abc", "aac") eq false

    isPermutationByIdenticalCounts("abc", "abc") eq true
    isPermutationByIdenticalCounts("acb", "abc") eq true
    isPermutationByIdenticalCounts("cba", "acb") eq true
    isPermutationByIdenticalCounts("aab", "baa") eq true
    isPermutationByIdenticalCounts("abc", "aab") eq false
    isPermutationByIdenticalCounts("abc", "aac") eq false
}


