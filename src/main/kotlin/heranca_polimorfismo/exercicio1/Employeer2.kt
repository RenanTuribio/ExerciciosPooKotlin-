package heranca_polimorfismo.exercicio1

open class Employeer2(var name:String, var hours:Int, var valuePerHour:Double) {
    open fun payment(): Double {
        return valuePerHour * hours
    }
}