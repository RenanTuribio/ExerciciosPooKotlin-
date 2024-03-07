package classes_atributos_metodos.exercicio3

class Student(var name:String, var nota1:Double, var nota2:Double, var nota3:Double) {

    constructor(name: String) :this (name, nota1 = 0.0, nota2 = 0.0, nota3 = 0.0)

    fun finalGrade():Double{
        return (nota1 + nota2 + nota3)/3
    }

    fun situationStudenty():String {
        if (finalGrade()>= 60) return "PASS"
        else {
            return "FALIDED \nMISSING: ${60 - finalGrade()} POINTS"

        }
    }

}
