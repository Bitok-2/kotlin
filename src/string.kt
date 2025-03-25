fun main() {
    var firstname = "Enock"
    var lastname = "Bitok"
    var school = "eMobilis"

    println(firstname)
    println(lastname)
    println(firstname + " " + lastname) //String concatenation
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println(school + " is a coding school")
    println("My fullname is $firstname $lastname")
}