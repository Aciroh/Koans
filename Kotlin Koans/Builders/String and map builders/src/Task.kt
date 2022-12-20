import java.util.HashMap

fun<K, V> buildMutableMap(build: HashMap<K, V>.() -> Unit): HashMap<K, V> {
    var hashMap: HashMap<K, V> = HashMap()
    hashMap.build()
    return hashMap
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
