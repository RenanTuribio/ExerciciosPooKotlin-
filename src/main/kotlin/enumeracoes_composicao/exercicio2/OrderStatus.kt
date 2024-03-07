package enumeracoes_composicao.exercicio2

enum class OrderStatus(var number: Number) {
    PENDING_PAYMENT(1),
    PROCESSING(2),
    SHPEED(3),
    DELIVERED(4)
}