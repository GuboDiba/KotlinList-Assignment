fun main() {
    val nams= names( listOf("Buraje","Serah","Joan","Grace","Joy","Masian","Akech"))
    println(nams)

    val heights= mutableListOf(32.0,77.0,21.0,86.0,95.0,43.0,32.0,22.0)
    val averageheight= heights.average()
    val totalheight=heights.sum()
    println(averageheight)
    println(totalheight)

    createhuman()

    val avgmileage= listOf(
        Cars("kdg456f",324.3),
        Cars("kdf324.2",234.2),
        Cars("kdf56g",342.1)
    )
    val averagemileage=getAverage(avgmileage)
    println("the average is $averagemileage")

    val get = (listOf("Gubo","Ruth","Maria","Grace","Buraje","Masian","Luct","Winny","sing","Eliza"))
    println(get)

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun names(name:List<String>):List<String>{
    val even = mutableListOf<String>()
    for (n in name.indices step 2){
        even.add(name[n])
    }
return even

}




//No 2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun detail(heights:List<Double>):List<Double> {
   val averageheight= heights.average()
    val totalheight=heights.sum()
    return heights
}
//No 3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)

data class person(var name:String,var age:Int,var height:Double,var weigt:Double)
fun createhuman(){
    val person1= person("Maria",22,23.2,56.4)
    val person2=person("Clarine",43,32.2,45.4)
    val person3=person("Ruth",31,45.3,54.3)
    val person4=person("Alice",12,62.1,67.3)

    val people= listOf(person1,person2,person3,person4)
    val sorted = people.sortedByDescending { person->person.age }
    println(sorted)
}

//NO 4
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.


//No 5
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Cars(var registration:String,var mileage:Double)
fun getAverage(avgmileage:List<Cars>):Double{
    var sum =0.0
    for(car in avgmileage){
        sum +=car.mileage
    }
    return sum /avgmileage.size

}
