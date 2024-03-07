package enumeracoes_composicao.exercicio2

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Order(var client:Client, val moment:LocalDateTime, var status:OrderStatus) {
    var orderItem:MutableList<OrderItem> = mutableListOf()

    var momentFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(moment)

    fun getClient():String{
        return "${client.name} (${client.birthDate}) - ${client.email}"
    }


    fun addItem(item:OrderItem){
        orderItem.add(item)
    }
}