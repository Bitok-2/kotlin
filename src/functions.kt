fun main() {
    //Standard-Library functions/Predefined functions
    var output = Math.sqrt(144.0)
    println("The square root of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    student("Mark","Male",22)
    student("Ann","Female",24)
    employee("Allan",1000,false)
    employee("Karen",3000,true)


}
//User-Defined functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x = 3
    var y = 5
    println(x + y)
}

//Parameters/variables and Arguments/Values
fun student(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")
}

fun employee(name: String,salary:Int,disability:Boolean){
    println("$name earns $salary  Disability:$disability")

}