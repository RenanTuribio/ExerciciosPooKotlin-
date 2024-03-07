package heranca_polimorfismo.exercicio4

class Company(name:String, anualIncome:Double, var numberEmployees:Int): TaxPayers(name, anualIncome) {

    override fun taxesPaid(): Double {
        var taxes:Double = 0.0
        if (numberEmployees <= 10) {
            taxes = anualIncome * 0.16
        } else {
            taxes = anualIncome * 0.14
        }
        return taxes
    }
}