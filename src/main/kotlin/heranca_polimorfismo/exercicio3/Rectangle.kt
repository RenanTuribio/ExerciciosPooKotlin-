package heranca_polimorfismo.exercicio3

class Rectangle2 (var width:Double, var height:Double, color: Color):Shape(color){
    override fun area(): Double {
        return width * height
    }
}