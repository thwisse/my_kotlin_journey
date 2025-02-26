package notes_1_

fun main() {
    println("Hello World!")

    print("Learn ")
    println("Kotlin")

    println(35 + 34)
    println("69")

    // * asteris operatoru ile carpim yapariz
    println(3 * 5)

    ////////////////////
    // var - val
    // var: degisen degisken (mutable)
    // val: degismeyen degisken (immutable)

    var number1 = 15
    number1 = 16
    var name1 = "oguzhan"

    val city1 = "hatay"
    // val degiskenlerin degeri daha sonra degistirilemez
    //city1 = "maras"

    ////////////////////////
    // int float double

    val a:Int = 5
    // float'in sonunda F gelmek zorunda. double ile ayirt edilebilmesi icin. F yoksa double'dir.
    val b:Float = 6.14F
    // float double'in aksine kusuratli olmak zorunda degildir.
    val b2:Float = 6F
    // double floattan daha hassas degerleri tutmak icin vardir.
    val c:Double = 7.567

    /////////////////////

    var today: String  // declaration
    today = "Sunday"  // initialization
    var tomorrow: String = "Monday"  // declaration and initializaton

    /////////////////////
    // type inferance

    // degiskenden sonra degiskenin tipini yazmasak da kotlin o degerin hangi tipte oldugunu anlayabilir.
    var name2 = "Aziz Vefa"  ///String
    var age2 = 39            ///Int
    var maritalStatus = true ///Boolean

    /////////////////////
    // string templates

    val plant = "orchid"
    val potSize = 6 // in inches
    val dayNum = 7

    // $ isareti ile o stringin icine bir degiskeni inject etmesini sagladik.
    println("An $plant in a $potSize inch pot must be watered every $dayNum days.")

    //////////////////
    // variableName.capitalize() function

    var word = "supercalifragilisticexpialidocious"

    word = word.capitalize() // stringin ilk harfini buyuk harfe donusturur.

    // .length property

    var wordSize = word.length

    println("$word has $wordSize letters.")

    ////////////////////////////
    // character escape sequences

    println("Soylenir turkumuz \ndaglardan daglara")
    println("Benim adim \"Ersan Kuneri\"")

    ///////////////////////
    // Math library

    // ussunu almak (power=kuvvet)
    Math.pow(5.0, 3.0)  ///125.0
    // iki deger arasindan min olan degeri dondurmek
    Math.min(5, 3)      ///3
    // tam tersi
    Math.max(5, 3)      ///5
    // 0 ile 1 arasinda random bir sayi uretmek
    Math.random()       ///0.3335735290527727
    // en yakin integer degere yuvarlamak. asagi ya da yukari. (round up=yuvarlamak)
    Math.round(15.7)    ///16
    // tavana yuvarlamak (ceil)
    Math.ceil(3.5)      ///4.0
    // tabana yuvarlamak (floor)
    Math.floor(6.9)     ///6.0
    // karekokunu almak (square root)
    Math.sqrt(25.0)     ///5.0
    // mutlak degerini almak (absolute value)
    Math.abs(-20)       ///20

    ///////////////////
    // when expression
    // switch case'e benziyor. zaten kotlinde switch case yok. onun yerine kullaniliyor.

    var lightColor = "red"

    when (lightColor) {
        "green" -> println("Go.")
        "yellow" -> println("Slow down.")
        "red" -> println("Stop.")
        else -> println("Not a valid traffic light color.")
    }

    // baska bir ornek:
    var num = 19
    when {
        num < 0 -> println("$num is negative.")
        num == 0 -> println("$num is zero.")
        num > 0 -> println("$num is positive.")
        else -> println("Not a valid number.")
    }

    ///////////////////
    // range (aralik) (x..y)

    var num_ = 5

    if (num_ in 1..10) {
        println("This value is between 1 and 10.")
    }

    // baska bir ornek:
    var letter = 'c'

    // boyle karakterlerde de araliga bakilabiliyor. ascii siralamasina gore bakiliyor
    when (letter) {
        in 'a'..'m' -> {
            println("Letter is in 1st half of alphabet.")
            // bla bla bla
        }
        in 'n'..'z' -> println("Letter is in 2nd half of alphabet.")
        else -> println("Not a valid value")
    }
}