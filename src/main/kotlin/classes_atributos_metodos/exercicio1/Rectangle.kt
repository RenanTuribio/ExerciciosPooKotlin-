package classes_atributos_metodos.exercicio1

import com.sun.jdi.DoubleValue

class Rectangle {
    var width:Double = 0.0
    var height:Double = 0.0

    fun area(width:Double, height:Double):Double{
        var area = width * height
        return area
    }

    fun perimeter(width: Double, height: Double):Double {
        var perimeter = 2 * (width + height)
        return perimeter
    }

    fun diagonal(width: Double, height: Double):Double {
        var diagonal = Math.sqrt((width * width) + (height * height))
        return diagonal
    }

}