package interfaces.exercicio2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Contract(var number:Int, var date:LocalDate, var totalValue:Double){

    var installment = mutableListOf<Installment>()

    fun dateString():String{
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.date)
    }

}
