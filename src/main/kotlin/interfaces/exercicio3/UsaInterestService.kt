package interfaces.exercicio3

class UsaInterestService:InterestService {
    //obter taxa de juros
    override fun getInterestRate(): Double {
        return 0.01
    }

    //pagamento
    override fun payment(amount: Double, months: Int): Double {
        var totalPayment = 0.0
        for (i in 1..months){
            totalPayment = amount * Math.pow((1 + getInterestRate()),months.toDouble())
        }
        return totalPayment
    }
}