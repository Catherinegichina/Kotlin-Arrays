import java.lang.ProcessBuilder.Redirect.to
import java.util.*

//fun main(){
  //  var numArray=arrayOf(10,20,30,40)
   // println(numArray[0])
  //  var namesArray=arrayOf("kate","joy","liz","kish","tin")
   // namesArray.forEach { name->
     //   println(name)
   //     var namesArray2=namesArray.plus("cow")
   //     println(namesArray2[5])
    //    var index=namesArray.indexOf("tin")
    //    println(index)
//    }
  //  println(namesArray)
//    namesArray.set(2,"sam")
//    println(namesArray.get(2))
   // println(namesArray)

     //println(namesArray[2])
  //  var name=namesArray.get(0)
//println(name)
//}
import java.util.*
fun main(){
println(Arrays.toString(createArray()))
towns()
         println(num())
         println(Arrays.toString(words("cat","cow","camel")))
     }
fun createArray():Array<String>{
  return  arrayOf("Kenya","Rwanda","Uganda","Burundi")
}
fun towns(){
    var cities = arrayOf("harae", "mumbai", "dodoma", "jakata")
    for (city in cities){
    println(city.capitalize())}
}
fun num():Int{
    var numbersArray=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var number=numbersArray.get(1) + numbersArray.get(4)
    return number
    var index=numbersArray.indexOf(158)
    println(index)
    var sortedNums=numbersArray.sortedArray()
    println(Arrays.toString(sortedNums))
    }
fun words(animals1:String ,animals2:String ,animals3:String):Array<String>{
    return arrayOf(animals1 ,animals2 ,animals3)

}