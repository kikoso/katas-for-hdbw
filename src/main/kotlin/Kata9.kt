fun Shop.getSetOfCustomers(): Set<Customer> =
    customers.toSet()

fun Shop.getCustomersSortedByOrdersSize(): List<Customer> =
    customers.sortedByDescending { it.orders.size }

data class Shop(val name: String, val customers: List<Customer>)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString() = "$name from ${city.name}"
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}

data class City(val name: String) {
    override fun toString() = name
}

fun main() {
    val city = City(name = "Munich")
    val product = Product(name = "Laptop", price = 120.34)
    val order1 = Order(products = listOf(product), isDelivered = true)
    val customer = Customer(name = "Allen", city = city, orders = listOf(order1,order1,order1))
    val secondCustomer = Customer("Max", city, orders = listOf(order1, order1))
    val shop = Shop(name = "amazon", customers = listOf(customer, secondCustomer))
    val setOfCustomers = shop.getSetOfCustomers()


    println(shop.getCustomersSortedByOrdersSize())


}