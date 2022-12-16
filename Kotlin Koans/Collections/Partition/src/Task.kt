// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = this.customers.filter {
    val (delivered, notDelivered) = it.orders.partition { it.isDelivered }
    delivered.count() < notDelivered.count()
}.toSet()