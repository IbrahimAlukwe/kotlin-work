class `kotlin-assignment1` {
}

fun main() {

    val marks = DoubleArray(5)



    println("Input Marks->")
    for(i in marks.indices){
        print("${subjectmarks()} : ")

    }

fun subjectname(){

   /* val subjectName = "Kiswahili","English","Physics","Chemistry","Maths"*/
    var kiswahili = 70
    var english = 68
    var physics = 83
    var chemistry = 78
    var math = 84
    var agriculture = 90

    var totalmarks = kiswahili+english+physics+chemistry+math+agriculture


}

//    val total = marks.sum()

    val percentage = marks.average()

//
//    println("Total of All subjects Marks : $total")
    println("Percentage : $percentage")


    when{
        percentage>80 -> println("Grade : A")
        percentage>60 -> println("Grade : B")
        percentage>40 -> println("Grade : C")
        else -> println("Grade : D")
    }
}


