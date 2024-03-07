package interfaces.exercicio3

class InterestCalculation(var interestService: InterestService) {
    fun calculation(loan: Loan){
        loan.totalPayment = interestService.payment(loan.amount,loan.months)
    }
}