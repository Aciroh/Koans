class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(propertyWithCounter) {
            field = propertyWithCounter
            counter++
        }
}
