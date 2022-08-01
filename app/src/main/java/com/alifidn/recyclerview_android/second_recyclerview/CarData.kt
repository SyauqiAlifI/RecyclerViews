package com.alifidn.recyclerview_android.second_recyclerview

object CarData {
    private val carBrands : Array<String> = arrayOf(
        "Tesla",
        "BMW",
        "Ferrari",
        "Ford",
        "Porsche",
        "Honda",
        "Lamborghini",
        "Toyota",
        "Bentley",
        "Maserati"
    )
    private val carImages : Array<String> = arrayOf(
        "https://www.carlogos.org/car-logos/tesla-logo.png",
        "https://www.carlogos.org/car-logos/bmw-logo.png",
        "https://www.carlogos.org/car-logos/ferrari-logo.png",
        "https://www.carlogos.org/car-logos/ford-logo.png",
        "https://www.carlogos.org/car-logos/porsche-logo.png",
        "https://www.carlogos.org/car-logos/honda-logo.png",
        "https://www.carlogos.org/car-logos/lamborghini-logo.png",
        "https://www.carlogos.org/car-logos/toyota-logo.png",
        "https://www.carlogos.org/car-logos/bentley-logo.png",
        "https://www.carlogos.org/car-logos/maserati-logo.png"
    )

    val listAllCar: ArrayList<CarModel> get() {
        val listCars = arrayListOf<CarModel>()
        for (pos in carBrands.indices) {
            val cars = CarModel(carBrands[pos], carImages[pos])
            listCars.add(cars)
        }
        return listCars
    }
}