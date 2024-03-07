package interfaces.exercicio1

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CarRental(var vehicle: Vehicle, private var start:LocalDateTime, private var finish:LocalDateTime, var invoice: Invoice) {

    constructor(vehicle: Vehicle,start: LocalDateTime,finish: LocalDateTime) : this(vehicle, start, finish, invoice = Invoice(0.0,0.0))

    //conversão
    fun dateForString(localDateTime: LocalDateTime):String{
        return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(localDateTime)
    }

    fun getStart():LocalDateTime{
        return start
    }
    fun getStringStart():String{
        return dateForString(start)
    }

    fun getFinish():LocalDateTime{
        return finish
    }
    fun getStringFinish():String{
        return dateForString(finish)
    }
}