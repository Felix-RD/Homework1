fun main(args: Array<String>) {
    println("Hello World!")
    // Программа для вычисления площади эллипса ( S = π * a * b)

    var pi = 3.14
    println("Введите большую полуось эллипса (м) ")
    var majorSemiAxis = readln().toDouble()
    println("Введите меньшую полуось эллипса(м) ")
    var minorSemiAxis = readln().toDouble()
    val  area = pi * majorSemiAxis * minorSemiAxis
    println("Площадь вашего эллипса составляет:\n"+area + "(м)2")

}