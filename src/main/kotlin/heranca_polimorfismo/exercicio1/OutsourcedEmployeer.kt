package heranca_polimorfismo.exercicio1

class OutsourcedEmployeer(var additionalCharge:Double,name:String, hours:Int, valuePerHours:Double) : Employeer2(name,hours,valuePerHours) {
    override fun payment(): Double {
        super.payment()
        return (valuePerHour * hours) + (additionalCharge * 1.1)
    }
}