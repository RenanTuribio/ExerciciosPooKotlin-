package classes_atributos_metodos.exercicio2

class Employee {

    var name:String? = null
    var grossSalary:Double = 0.0
    var tax: Double = 0.0
    var percentagemToIncrease:Double = 0.0

    fun netSalary():Double {
        return (grossSalary - tax)
    }

    fun increaseSalary():Double {
        var newSalary = (grossSalary - tax) + (grossSalary * percentagemToIncrease/100)
        return newSalary
    }

}
