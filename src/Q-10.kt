class Car(val type: String, val model: Int, val price: Double, val owner: String, val milesDriven: Int) {

    init {
        println("\nObject of class is created and Init is called.")
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentCarPrice(): Double {
        return price - (milesDriven * 10.0)
    }

    fun displayInfo() {
        println("\n---------")
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("---------")
    }
}

fun main() {
    println("\nCreating Car Class Object car1 in next line.")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.displayInfo()

    println("\nCreating Car Class Object car2 in next line.")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.displayInfo()

    println("\n******* ArrayList of Car ***********")
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 400000.0, "NPP", 200))

    for (car in carList) {
        car.displayInfo()
    }
}