package interfaces.exercicio2

import java.time.LocalDate

class ContractService(var paymentService: OnlinePaymentService) {
    fun processContract(contract: Contract,months:Int){
        var basicValue = contract.totalValue / months
        var valueProcessed = mutableListOf<Double>()
        var subsequentMonths = mutableListOf<LocalDate>()

        for (i in 0..months){
            subsequentMonths.add(contract.date.plusMonths(i.toLong()))
        }

        for (i in subsequentMonths.indices){
            valueProcessed.add(basicValue + paymentService.interest(basicValue,i) + paymentService.paymentfree(basicValue + paymentService.interest(basicValue,i)))
        }

        for (i in 1..months){
            contract.installment.add(Installment(subsequentMonths[i],valueProcessed[i]))
        }
    }
}