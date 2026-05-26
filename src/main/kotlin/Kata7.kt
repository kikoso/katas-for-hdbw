data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    /* TODO */
    override fun compareTo(other: MyDate): Int {
        // 1. Compare Year
        if (this.year != other.year) {
            return this.year.compareTo(other.year)
        }

        // 2. Compare Month (only reached if years are equal)
        if (this.month != other.month) {
            return this.month.compareTo(other.month)
        }

        // 3. Compare Day (only reached if year and month are equal)
        return this.dayOfMonth.compareTo(other.dayOfMonth)
    }

}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}