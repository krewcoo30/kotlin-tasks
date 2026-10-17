fun main() {

    main1()
    main2()




}
fun main1() {

    fun agoToText(val a, val b, val d, val c) {
        val c = "f";
        when {

            a in 0..60 -> {
                val b = println("Пользователь ${с} был(а) только что")
            }

            a in 61..60 * 60 -> {
                val b = println("Пользователь ${с} был(а) ")
                when {
                    a % 2 -> {
                        val b = println("${a / 60} минуту назад")
                    }

                    a in 120..299 -> {
                        val b = println("${a / 60} минуты назад")
                    }

                    a -> {
                        val b = println("${a / 60} минут назад")
                    }

                }

            }

            a in 60 * 60..24 * 60 * 60 -> {
                val b = println("Пользователь ${с} был(а) ")
                when {

                    a < 18000 -> {
                        val b = println("${(a / 60) / 60} часа назад")
                    }

                    a > 18000 -> {
                        val b = println("${(a / 60) / 60} часов назад")
                    }
                }
            }

            a in 24 * 60 * 60..48 * 60 * 60 -> {
                val b = println("Пользователь ${с} был(а) вчера")
            }

            a in 48 * 60 * 60..72 * 60 * 60 -> {
                val b = println("Пользователь ${с} был(а) позавчера")
            }

            a > 72 * 60 * 60 -> {
                val b = println("Пользователь ${с} был(а) давно")
            }
        }

        println("1 задача ")
        val alex = 30 //секунды
        val vasya = 58 * 60
        val zhenya = 60 * 60
        val oleg = 24 * 60 * 60
        val grigoriy = 48 * 60 * 60
        val henry = 96 * 60 * 60


    }

    fun main2() {
        println(" ")
        println("2 задача ")
        fun process(choise: Int = 5,amount: Double = 0.0,amountMonth: Double = 0.0,commissio: Double = 0.0) {
    println("Выберите тип карты/счёта:")//по умолчанию VK Pay
    println("1. MasterCard")
    println("2. Maestro")
    println("3. Visa")
    println("4. Мир")
    println("5. VK Pay")

     when {
        choise in 1..2 -> { 
            if (amount >=300.0 && amountMonth <= 75000.0)
            {
                commissio = 0.0
                amountMonth += amount
        }
        else {
            commissio = amount* 0.006 + 20
            amountMonth += amount
        }
        }
        choise in 3..4 ->{
            commissio = amount * 0.75
            if (commissio < 35.0){
                commissio += 35
                amountMonth += amount
            }
            else{
                amountMonth += amount
            }
        }
        choise in 5 -> {
            commissio = 0
            amountMonth += amount
        }
     }
     println("Сумма перевода: ${amount}")
     println("Коммисия: ${commissio}")
     println("Сумма переводов за месяц: ${amountMonth}")
}
val choise:Int = 5;
val amount:Double = 40.0;

process(choise,amount)

    }
}

