package heranca_polimorfismo.exercicio2

import enumeracoes_composicao.exercicio2.Product

class UserdProduct(name:String,price:Double, var manufacturedDate:String): Product(name, price) {
    override fun priceTag():String {
        var priceTag = "${name} (Used) R$ ${price} (Data de fabricação: ${manufacturedDate})"
        return priceTag
    }
}