package tratamentoDeExecoes.exercicio2

class Account(private var number:Int, private var holder:String, private var balance:Double, private var withdrawLimit:Double) {
    //get
    fun getNumber():Int{
        return number
    }
    fun getHolder():String{
        return holder
    }
    fun getBalance():Double{
        return balance
    }
    fun getWithdrawLimit():Double{
        return withdrawLimit
    }
    //--------

    fun deposit(valueDeposit:Double){
        this.balance += valueDeposit
    }

    fun withdraw(valueWithdraw:Double){
        if (valueWithdraw > withdrawLimit){
            throw IllegalArgumentException("Erro: O valor excede o limite de retirada")
        } else if (valueWithdraw > this.balance){
            throw  IllegalArgumentException("Erro: Saldo insuficiente")
        }

        this.balance -= valueWithdraw
    }
}