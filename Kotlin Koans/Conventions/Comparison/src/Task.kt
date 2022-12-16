data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(otherDate: MyDate): Int {
        if(this.year != otherDate.year) return year - otherDate.year
        return if(this.month != otherDate.month) month - otherDate.month else
            dayOfMonth - otherDate.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
