class `kotlin-assignment1` {
}

fun main() {

    val marks = DoubleArray(5)


    println("Input Marks->")
    for(i in marks.indices){
        print("${subjectmarks()} : ")

    }

fun subject(){

    val subjectName = arrayOf<String>("Kiswahili","English","Physics","Chemistry","Maths")


}

    val total = marks.sum()

    val percentage = marks.average()


    println("Total of All subjects Marks : $total")
    println("Percentage : $percentage")


    when{
        percentage>80 -> println("Grade : A")
        percentage>60 -> println("Grade : B")
        percentage>40 -> println("Grade : C")
        else -> println("Grade : D")
    }
}


