package enumeracoes_composicao.exercicio2

class OrderItem(var product:Product ,var quantity:Int) {
    fun subTotal():Double{
        return quantity * product.price
    }
}