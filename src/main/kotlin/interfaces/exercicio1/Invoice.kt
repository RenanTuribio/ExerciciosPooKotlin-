package interfaces.exercicio1

class Invoice(var basicPayment:Double, var tax:Double) {
    fun totalPayment():Double {
        return basicPayment + tax
    }
}