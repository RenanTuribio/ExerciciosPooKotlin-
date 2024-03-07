package construtores_sobrecarga_encapsulamento

class BankAccount (private var numberAccount:Int, private var holderAccount:String = "", private var initialSaldo:Double = 0.0) {
    // vizualizar numero da conta:
    fun getNumberAccount():Int{
        return numberAccount
    }

    //vizualizar titular da conta
    fun getHolderAccount():String{
        return holderAccount
    }
    //alterar no do titular da conta
    fun setHolderAccount(newHolder:String){
        this.holderAccount = newHolder
    }

    //vizualizar saldo da conta
    fun getInitialSaldo():Double{
        return initialSaldo
    }

    //depositar
    fun deposit(value:Double){
        this.initialSaldo = this.initialSaldo + value
    }
    //salcar
    fun withdraw(value:Double){
        this.initialSaldo = this.initialSaldo - (value + 5)
    }
}