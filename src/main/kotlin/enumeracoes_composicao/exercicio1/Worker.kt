package enumeracoes_composicao.exercicio1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Worker(var name:String, var level: WorkerLevel, var baseSalary:Double, var departament: Departament) {

    var contracts:MutableList<HourContract> = mutableListOf()

    fun addContract(contract: HourContract){
        contracts.add(contract)
    }

    fun removerContract(contract: HourContract){
        contracts.remove(contract)
    }

    fun income(monthAndYear: String): Double {
        var localDate = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("01/" + monthAndYear))
        var contractsFilter = contracts.filter { it.date.month == localDate.month && it.date.year == localDate.year}

        var sum = baseSalary + contractsFilter.sumOf { it.totalValue() }

        return sum
    }
}