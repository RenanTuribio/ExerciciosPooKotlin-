package enumeracoes_composicao.exercicio1

import java.time.LocalDate

class HourContract(var date: LocalDate, var valuePerHour:Double, var hour:Int) {

    fun totalValue():Double {
        return valuePerHour * hour
    }
}