fun main() {
    //While loop
    var number = 20
    while (number <= 25){
        println("Number : $number")
        number ++
    }
    var num = 5
    while (num >=0){
        println("Number : $num")
        num --
    }

    //Do while loop
    var x = 30
    do {
        println("Number is $x")
        x++
    }
        while (x <= 35)

    //For loop
    for (a in 100..105){
        println("Number is $a")

    }
    for (letter in 'a'..'d'){
    println("Letter is $letter")
    }

    //Break
    for (b in 70..75){
        if (b ==73){
            break
        }
        println("Number is $b")
    }

    //Continue
    for (character in 'd'..'h'){
        if (character == 'f'){
            continue
        }
        println("Character is $character ")
    }

}