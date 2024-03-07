package interfaces.exercicio1

class BrazilTaxService:TaxService {
    override fun tax(amount: Double): Double {
        if (amount <= 100) return amount * 0.2
        else return amount * 0.15
    }
}