fun main() {
    val str = "Hello, World!"
    val len = str.length
    println("Длина строки = $len")

    val a = "Cat"
    val b = "Dog"
    if (a > b) {
        println("Cat")
    } else println("Dog")

    println(a.compareTo(b))

    if (a == b) {
        println("равны")
    }

    val catName = "Барсик"
    println("Привет, $catName! Как дела?")

    println("\$a")

    catName.forEachIndexed { index, char -> println("Index: $index - Character: $char") }

    val s0 = ""
    println(s0.length)

    val s1 = " "
    println(s1.length)

    val s2 = "   \n     \t "
    println(s2.length)

    println(s0.isBlank())
    println(s1.isBlank())
    println(s2.isBlank())

    println("hello, World!".capitalize())

    val cName = "МММурзиМук"
    val t = cName.dropWhile {
        it=='М' || it=='у'
    }
    println(t)

    val multiLine = "abc\ndef\nghi"
    println(multiLine.lines())

    println("abcdefghijk".zipWithNext())

    val string = "Кот, который гуляет сам по себе"
    val result1 = string.removeRange(3..28)
    println(result1)

    val result2 = string.removePrefix("Кот")
    println(result2)

    val result3 = string.removeSuffix("себе")
    println(result3)

    val st =
        "Какой-то длинный текст, \nсостоящий из имён котов: \nВаська\nБарсик\nРыжик"
    val result = st.prependIndent("     ")
    println(result)

    val cats = "Кот Васька и кот Мурзик - Друзья!"
    val (big, small) = cats.partition {
        it.isUpperCase()
    }
    println("$big : $small")

    val threeCats = " cats"
    val a3 = threeCats.all {
        it.isLetter()
    }
    println(a3)

    val text1 = "КІт Кішка"
    val r1 = text1.replace('і','о', true)
    println(r1)

    println(toDragonSpeak("Hello, World!"))

    
}

fun toDragonSpeak(phrase: String) = phrase.replace(Regex("[aeiou]")) {
    when (it.value) {
        "a" -> "4"
        "e" -> "3"
        "i" -> "1"
        "o" -> "0"
        "u" -> "|_|"
        else -> it.value
    }
}
