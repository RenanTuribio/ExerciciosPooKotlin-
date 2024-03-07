package heranca_polimorfismo.exercicio4

abstract class TaxPayers(var name:String, var anualIncome:Double) {
    abstract fun taxesPaid():Double
}