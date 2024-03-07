package interfaces.exercicio1

import kotlin.time.Duration


class RentalService(var pricePerHour:Double, var pricePerDay:Double, var taxService: TaxService) {

    fun processingInvoice(carRental: CarRental){
        var hours = Math.ceil((((java.time.Duration.between(carRental.getStart(),carRental.getFinish())).toMinutes())/60).toDouble())
        var basicPayment = 0.0
        if (hours <= 12){
            basicPayment = pricePerHour * hours
        } else {
            basicPayment = pricePerDay * (hours/24)
        }

        var tax = taxService.tax(basicPayment)
        carRental.invoice = Invoice(basicPayment,tax)
    }


}