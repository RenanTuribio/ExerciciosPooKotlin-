package tratamentoDeExecoes.exercicio1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Reservation(var roomNumber:Int, var checkin:LocalDate, var checkout:LocalDate) {

    fun reservationDetails():String{
        var nigths = checkout.dayOfYear - checkin.dayOfYear
        //exception
        if (nigths < 0){
            throw IllegalArgumentException("Erro na reserva: Data de saida menor que a de entrada.")
        }

        return "Detalhes da reserva: Quantos, ${roomNumber}, " +
                "Check-in: ${DateTimeFormatter.ofPattern("dd/MM/yyyy").format(checkin)}, " +
                "Check-out ${DateTimeFormatter.ofPattern("dd/MM/yyyy").format(checkout)}, " +
                "${nigths} noites."
    }

    fun upDates(checkin: LocalDate,checkout: LocalDate){
        //exception
        if (checkout.dayOfYear < checkin.dayOfYear || checkout.dayOfYear < this.checkout.dayOfYear || checkin.dayOfYear < this.checkin.dayOfYear){
            throw IllegalArgumentException("Erro na reserva: Data de saida menor que a de entrada.")
        } else if (checkin.year < this.checkin.year || checkout.year < this.checkout.year){
            throw IllegalArgumentException("Erro na reserva: As datas de reserva para atualização devem ser datas futuras")
        }
        this.checkin = checkin
        this.checkout = checkout
    }
}
