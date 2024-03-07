package heranca_polimorfismo.exercicio4

class Individual(name:String,anualIncome:Double, var healthExpeditures:Double): TaxPayers(name,anualIncome) {

    override fun taxesPaid():Double {
        var taxes:Double = 0.0
        if (anualIncome < 20000) {
            taxes = (anualIncome * 0.15) - (healthExpeditures * 0.5)
        } else {
            taxes = (anualIncome * 0.25) - (healthExpeditures * 0.5)
        }
        return taxes
    }
}