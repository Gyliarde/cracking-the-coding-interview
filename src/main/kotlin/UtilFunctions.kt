
infix fun <T> T.eq(other: T)  {
    if (this == other) {
        println("OK")
    } else {
        println("the value $other is different to $this ")
    }
}