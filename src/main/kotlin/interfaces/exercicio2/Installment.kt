package interfaces.exercicio2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Installment(var dueDate:LocalDate, var amount:Double){
    fun getDueDate():String{
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.dueDate)
    }
}