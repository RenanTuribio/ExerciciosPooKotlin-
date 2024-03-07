package interfaces.exercicio2

interface OnlinePaymentService {
    fun paymentfree(amount:Double):Double
    fun interest(amount: Double,months:Int):Double
}