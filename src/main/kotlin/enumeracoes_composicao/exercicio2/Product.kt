package enumeracoes_composicao.exercicio2
//class reaproveitada no exercicio 2 da lista de herança e polimorfismo
open class Product(var name:String, var price:Double){
    open fun priceTag():String{
        var pricetag = "${name} R$ ${price}"
        return pricetag
    }
}