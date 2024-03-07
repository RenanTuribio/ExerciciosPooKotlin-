package interfaces.exercicio2

class PaypalService:OnlinePaymentService {
    //juros
    override fun interest(amount: Double, months: Int):Double {
        return (amount * 0.01) * months
    }

    //taxa
    override fun paymentfree(amount: Double):Double {
        return amount * 0.02
    }
}