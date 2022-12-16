class LazyProperty(val initializer: () -> Int) {
    var int: Int? = null
    val lazy: Int
        get() {
            if(int == null) {
                int = initializer()
            }
            return int!!
        }
}
