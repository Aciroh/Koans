// Return true if all customers are from a given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean =
        this.customers.all { it.city == city }

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean =
        this.customers.any { it.city == city}

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int =
        this.customers.count { it.city == city }

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? =
        this.customers.find { it.city == city }