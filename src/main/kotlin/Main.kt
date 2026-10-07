fun main() {

    main1()
    main2()
    main3()



}
fun main1() {

    println("1 задача ")
    val amount: Double = 1000.0
    val commission = amount * 0.0075
    if (commission < 35.00) {
        val commission = 35.0
        println("Сумма перевода: $amount ₽")
        println("Комиссия: $commission ₽")
return
    }
    else

    println("Сумма перевода: $amount ₽")
    println("Комиссия: $commission ₽")



}
fun main2() {
    println(" ")
    println("2 задача ")
    val likes = 61

    val last = likes % 10
    val lastTwo = likes % 100

    if (lastTwo >= 11 && lastTwo <= 19) {

        println("Понравилось $likes людям")
    } else if (last == 1) {

        println("Понравилось $likes человеку")
    } else {

        println("Понравилось $likes людям")
    }
    println(" ")
}
fun main3() {
    println("3 задача ")

    val isRegular = true

    val purchaseAmount = 20000
    var price = purchaseAmount.toDouble()

    when {
        purchaseAmount in 0..1000 -> {

        }

        purchaseAmount in 1001..10000 -> {
            price -= 100
        }

        purchaseAmount >= 10001 -> {
            price *= 0.95
        }
    }
    if (isRegular) {
        price *= 0.99
    }

    println("Итог: ${price.toInt()} руб.")

}



