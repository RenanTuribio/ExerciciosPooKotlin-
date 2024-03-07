package interfaces.exercicio3

interface InterestService {
    fun getInterestRate():Double
    fun payment(amount:Double,months:Int):Double
}