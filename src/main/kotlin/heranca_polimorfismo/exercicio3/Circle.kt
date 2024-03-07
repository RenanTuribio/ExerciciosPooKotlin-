package heranca_polimorfismo.exercicio3

class Circle(var radius:Double, color: Color):Shape(color) {
    override fun area(): Double {
        var pi = 3.14
        var area = pi * Math.pow(radius,2.0)
        return area
    }
}