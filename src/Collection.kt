val rockPlanets= arrayOf<String>("Mercury","Venus","Earth","Mars")
val gasPlanets=arrayOf("Jupiter","Saturn","Uranus","Neptune")
val solarSystem=rockPlanets+gasPlanets
val newSolarSystem=arrayOf(
    "Mercury",
    "Venus",
    "Earth",
    "Mars",
    "Jupiter",
    "Saturn",
    "Uranus",
    "Neptune",
    "Pluto",

)
fun main() {
    println(solarSystem[7])
    val solarSystem = mutableListOf(
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Jupiter",
        "Saturn",
        "Uranus",
        "Neptune"
    )
    solarSystem.add("Pluto")
    solarSystem.add(3,"Theia")
    solarSystem[3]="Future Moon"
    //    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))

//    println("Pluto" in solarSystem)
//    solarSystem.add("Pluto")
//    println(solarSystem.size)

//    println(solarSystem.size)
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))



//    println(solarSystem[7])
//    solarSystem.add("Pluto")
//    solarSystem.add(3,"Theia")
//    solarSystem[3]="Future Moon"
//    println(solarSystem[3])
//    println(solarSystem[9])
//    solarSystem.removeAt(9)
//    println(solarSystem.size)
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
    //    println(solarSystem.contains("Pluto"))
//    println("Future Moon" in solarSystem)
//  for (planet in solarSystem){
//      println(planet)
//  }
}