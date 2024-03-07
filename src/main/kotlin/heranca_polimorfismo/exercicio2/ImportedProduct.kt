package heranca_polimorfismo.exercicio2

import enumeracoes_composicao.exercicio2.Product

class ImportedProduct(name:String,price:Double,var customFee:Double): Product(name, price) {
    override fun priceTag():String{
        var uppdatePrice = price + customFee
        var priceTag = "${name} R$ ${uppdatePrice} (Taxa alfandegaria: R$$${customFee})"
        return priceTag
    }
}