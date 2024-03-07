import classes_atributos_metodos.exercicio1.Rectangle
import classes_atributos_metodos.exercicio2.Employee
import classes_atributos_metodos.exercicio3.Student
import construtores_sobrecarga_encapsulamento.BankAccount
import enumeracoes_composicao.exercicio1.Departament
import enumeracoes_composicao.exercicio1.HourContract
import enumeracoes_composicao.exercicio1.Worker
import enumeracoes_composicao.exercicio1.WorkerLevel
import enumeracoes_composicao.exercicio2.*
import heranca_polimorfismo.exercicio1.Employeer2
import heranca_polimorfismo.exercicio1.OutsourcedEmployeer
import heranca_polimorfismo.exercicio2.ImportedProduct
import heranca_polimorfismo.exercicio2.UserdProduct
import heranca_polimorfismo.exercicio3.Circle
import heranca_polimorfismo.exercicio3.Color
import heranca_polimorfismo.exercicio3.Rectangle2
import heranca_polimorfismo.exercicio3.Shape
import heranca_polimorfismo.exercicio4.Company
import heranca_polimorfismo.exercicio4.Individual
import heranca_polimorfismo.exercicio4.TaxPayers
import interfaces.exercicio1.BrazilTaxService
import interfaces.exercicio1.CarRental
import interfaces.exercicio1.RentalService
import interfaces.exercicio1.Vehicle
import interfaces.exercicio2.Contract
import interfaces.exercicio2.ContractService
import interfaces.exercicio2.Installment
import interfaces.exercicio2.PaypalService
import interfaces.exercicio3.BrazilInterestService
import interfaces.exercicio3.InterestCalculation
import interfaces.exercicio3.Loan
import interfaces.exercicio3.UsaInterestService
import tratamentoDeExecoes.exercicio1.Reservation
import tratamentoDeExecoes.exercicio2.Account
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.Date
import kotlin.math.sign

fun main() {
    //repostas:
    q30()
}

//----------------------------
//FUNÇÕES ATRIBUTOS E MÉTODOS
//Q1
//Fazer um programa para ler os valores da largura e altura
//de um retângulo. Em seguida, mostrar na tela o valor de
//sua área, perímetro e diagonal. Usar uma classe como
//mostrado no projeto ao lado.
fun q1() {
    var rectangle = Rectangle()
    println("Enter rectangle width and height:")
    var width = readln().toDouble()
    var height = readln().toDouble()

    rectangle.width = width
    rectangle.height = height

    println("Area = ${rectangle.area(rectangle.width, rectangle.height)}")
    println("Perimeter = ${rectangle.perimeter(rectangle.width, rectangle.height)}")
    println("Diagonal = ${rectangle.diagonal(rectangle.width, rectangle.height)}")
}

//Q2
//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
//projetada abaixo
fun q2() {
    print("Name: ")
    var name = readln()
    print("Gross salary: ")
    var grossSalary = readln().toDouble()
    print("Tax: ")
    var tax = readln().toDouble()

    var employee = Employee()
    employee.name = name
    employee.grossSalary = grossSalary
    employee.tax = tax

    println("Employee: ${employee.name}, $${employee.netSalary()}")
    print("Which percentage to increase salary?")
    var percentageToIncrease = readln().toDouble()
    employee.percentagemToIncrease = percentageToIncrease
    println("Updated data: ${employee.name}, $${employee.increaseSalary()}")
}

//Q3
//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//resolver este problema.
fun q3(){
    var name = readln()
    var note1 = readln().toDouble()
    var note2 = readln().toDouble()
    var note3 = readln().toDouble()

    var studenty1 = Student(name,note1,note2,note3)

    println("FINAL GRADE: ${studenty1.finalGrade()}")
    println(studenty1.situationStudenty())
}

//CONTRUTORES, SOBRECARGA E ENCAPSULAMENTO
//Q4
//Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
//titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
//inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
//conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
//Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
//o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
//exemplo).
//Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
//isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
//realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
//suficiente para realizar o saque e/ou pagar a taxa.
//Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
//informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
//mostrando os dados da conta após cada operação.
fun q4() {
    print("Numero da conta: ")
    var numberAccount = readln().toInt()
    var account1 = BankAccount(numberAccount)

    print("Titular da conta: ")
    var accountHolder = readln()
    account1.setHolderAccount(accountHolder)

    print("Deseja realizar um deposito inicial? (s/n)? ")
    var simOuNao = readln()[0].lowercase()
    if (simOuNao == "s"){
        print("Entre com um deposito inicial: ")
        var initialDeposit = readln().toDouble()
        account1.deposit(initialDeposit)
    }

    println()

    println("Datos da conta:")
    println("Numero da conta: ${account1.getNumberAccount()}, Titular: ${account1.getHolderAccount()}, Saldo: R$${account1.getInitialSaldo()}")

    println()

    print("Deposito: ")
    var deposit = readln().toDouble()
    account1.deposit(deposit)
    println("Datos atualizados:")
    println("Numero da conta: ${account1.getNumberAccount()}, Titular: ${account1.getHolderAccount()}, Saldo: R$${account1.getInitialSaldo()}")

    println()

    print("Saque: ")
    var whitdraw = readln().toDouble()
    account1.withdraw(whitdraw)
    println("Datos atualizados:")
    println("Numero da conta: ${account1.getNumberAccount()}, Titular: ${account1.getHolderAccount()}, Saldo: R$${account1.getInitialSaldo()}")


    account1.setHolderAccount("Maria Brown Silva")
}

//VETORES
//Q5
//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
fun q5(){
    print("Quantos numeros você irá digitar? ")
    var amount = readln().toInt()

    var listOfNumbers = mutableListOf<Int>()

    for (i in 0..amount-1){
        print("Digite um numero: ")
        var number = readln().toInt()
        listOfNumbers.add(number)
    }
    println("NUMEROS NEGATIVOS: ")

    var listOfNumberNegatives = mutableListOf<Int>()
    for (i in listOfNumbers) {
        if (i < 0) listOfNumberNegatives.add(i)
    }

    for (i in listOfNumberNegatives) println(i)
}
//Q6
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
fun q6(){
    print("Quantos numeros você vai digitar? ")
    var amount = readln().toInt()

    var numbers = mutableListOf<Int>()
    for (i in 0..amount-1){
        print("Digite um numero: ")
        var number = readln().toInt()
        numbers.add(number)
    }

    println("VALORES: ${numbers}")
    println("SOMA: ${numbers.sum()}")
    println("MÉDIA: ${numbers.sum()/numbers.size}")
}
//Q7
//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
fun q7() {
    print("Quantas pessoas serão digitadas?")
    var amount = readln().toInt()

    var people = mutableListOf<People>()
    for (i in 0..amount-1){
        println("Dados da ${i+1}º pessoa:")
        print("Nome: ")
        var name = readln()
        print("Idade: ")
        var age = readln().toInt()
        print("Altura: ")
        var height = readln().toDouble()

        people.add(People(name,age, height))
    }

    print("Altura média: ")
    var heigths = mutableListOf<Double>()
    for (person in people){
        heigths.add(person.height)
    }
    println("%.2f".format(heigths.sum()/heigths.size))

    print("Pessoas com menos de 16 anos: ")
    var udner16 = mutableListOf<People>()
    for (i in people){
        if (i.age < 16) udner16.add(People(i.name, i.age, i.height))
    }
    println("${((udner16.size).toDouble()/(people.size).toDouble())*100}%")
    for (i in udner16){
        println(i.name)
    }
}
class People (var name:String, var age:Int, var height:Double, var sexo:String) {
    constructor(name: String, age: Int,height: Double): this(name,age, height, sexo = "")
    constructor(height: Double,sexo: String): this (name = "",age = 0,height, sexo)
}
// classe aproveitada na questão 15 da lista de vetores
//---------------------------------------------------

//Q8
//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
fun q8(){
    print("Quantos numeros você irá digitar? ")
    var amount = readln().toInt()

    var numbers = mutableListOf<Int>()

    for (i in 1..amount){
        print("digite um numero: ")
        var number = readln().toInt()
        numbers.add(number)
    }

    var numbersOfpair = mutableListOf<Int>()
    for (i in numbers){
        if (i % 2 == 0){
           numbersOfpair.add(i)
        }
    }

    println("NUMEROS PARES: ${numbersOfpair}")
    println("QUANTIDADE DE PARES: ${numbersOfpair.size}")
}

//Q9
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).
fun q9(){
    print("Quantos numeros você vai digitar? ")
    var amount = readln().toInt()

    var numbers = mutableListOf<Int>()
    for (i in 1..amount){
        print("Digite um numero: ")
        var number = readln().toInt()
        numbers.add(number)
    }

    var maxNumber = numbers.max()
    println("MAIOR VALOR = $maxNumber")
    print("POSICAO DO MAIOR VALOR = ${numbers.indexOf(maxNumber)}")
}

//Q10
//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
fun q10(){
    print("Quantos valores vai ter cada vetor? ")
    var amount = readln().toInt()

    var vectorA = mutableListOf<Int>()
    var vectorB = mutableListOf<Int>()

    println("Digite os valor do vetor A:")
    for (i in 1..amount){
        var number = readln().toInt()
        vectorA.add(number)
    }

    println("Digite os valor do vetor B:")
    for (i in 1..amount){
        var number = readln().toInt()
        vectorB.add(number)
    }

    var vectorC = mutableListOf<Int>()
    for (i in 0..amount-1){
        vectorC.add(vectorA[i]+vectorB[i])
    }

    println("VETOR RESULTANTE:")
    for (i in vectorC) println(i)
}
//Q11
//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
fun q11() {
    print("Quantos elementos vai ter o vetor? ")
    var amount = readln().toInt()

    var numbers = mutableListOf<Double>()

    for(i in 1..amount){
        print("Digite um numero: ")
        var number = readln().toDouble()
        numbers.add(number)
    }

    var average = numbers.sum()/numbers.size
    println("MEDIA DO VETOR = ${"%.3f".format(average)}")
    println("ELEMENTOS ABAIXO DA MEDIA:")

    for (i in numbers){
        if (i < average) println(i)
    }
}
//Q12
//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
fun q12(){
    print("Quantos elementos vai ter o vetor? ")
    var amount = readln().toInt()

    var numbers = mutableListOf<Int>()

    for (i in 1..amount){
        print("Digite um numero: ")
        var number = readln().toInt()
        numbers.add(number)
    }

    var numbersPair = mutableListOf<Int>()

    for (i in numbers){
        if (i % 2 == 0) numbersPair.add(i)
    }

    if (numbersPair.isEmpty()) println("NENHUM NUMERO PAR")
    else println("MEDIA DOS PARES = ${"%.1f".format((numbersPair.sum()/numbersPair.size).toDouble())}")
}
//Q13
//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
fun q13(){
    print("Quanras pessoas você vai digitar?")
    var amount = readln().toInt()

    var names = mutableListOf<String>()
    var ages = mutableListOf<Int>()

    for (i in 1..amount){
        println("Dados da ${i}º pessoa")
        print("Nome:")
        var name = readln()
        print("Idade:")
        var age = readln().toInt()

        names.add(name)
        ages.add(age)
    }

    var oldPerson = ages.indexOf(ages.max())
    println("PESSOA MAIS VELHA: ${names[oldPerson]}")
}
//Q14
//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
fun q14() {
    print("Quantos alunos serão digitados? ")
    var amount = readln().toInt()

    var students = mutableListOf<Student>()
    for (i in 1..amount){
        println("Digite nome, primeira e segunda nota do ${i}º aluno: ")
        var name = readln()
        var note1 = readln().toDouble()
        var note2 = readln().toDouble()
        var note3 = readln().toDouble()

        students.add(Student(name, note1,note2,note3))
    }

    println("Alunos aprovados: ")
    for (i in students){
        if (i.finalGrade() >= 6){
            println(i.name)
        }
    }
}
//Q15
//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
fun q15(){
    print("Quantas pessoas serão digitadas? ")
    var amount = readln().toInt()

    var peoples = mutableListOf<People>()

    for (i in 1..amount){
        print("Altura da ${i}º pessoa: ")
        var height = readln().toDouble()
        print("Genero da ${i}º pessoa: ")
        var gender = readln()[0].lowercase()

        peoples.add(People(height,gender))
    }

    // Aqui retorna um objeto, não altura
    var smallestPerson = peoples.minBy { it.height }
    var greatestPerson = peoples.maxBy { it.height }

    println("Menor altura = ${smallestPerson.height}")
    println("Maior altura = ${greatestPerson.height}")

    //ISSO:
    var women = mutableListOf<People>()
    for (i in peoples){
        if (i.sexo == "f") women.add(i)
    }
    //MESMA COISA DISSO:
    var men = peoples.filter { it.sexo == "m" }

    var averageHeightWomen = (women.sumOf { it.height })/women.size
    println("Media das alturas das mulheres = ${"%.2f".format(averageHeightWomen)}")
    println("Numero de homens = ${men.size}")
}

//ENUMERACAO E COMPOSICAO
fun q16(){
    print("Nome do departamento: ")
    var departament = readln()
    println("Dados do funcionario: ")
    print("Nome: ")
    var name = readln()
    print("Level:")
    var level = readln().uppercase()
    print("Salario base: ")
    var salaryBase = readln().toDouble()

    var employee = Worker(name, WorkerLevel.valueOf(level),salaryBase,Departament(departament))

    print("Quantos contratos para esse trabalhador: ")
    var numberOfContracts = readln().toInt()

    for (i in 1..numberOfContracts){
        println("Contrato $i: ")
        print("Data(DD/MM/AAAA): ")
        var dateContract = readln()
        print("Valor por hora: ")
        var valueOfHour = readln().toDouble()
        print("Duração(horas): ")
        var hours = readln().toInt()

        var stringForHous = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyy").parse(dateContract))

        employee.contracts.add(HourContract(stringForHous,valueOfHour,hours))
    }

    print("Entre com mes e ano para calcular a renda (MM/AAAA: ) ")
    var monthAndYear = readln()

    println("Name: ${employee.name}")
    println("Department: ${employee.departament.name}")
    println("Renda do periodo ${monthAndYear}: ${employee.income(monthAndYear)} ")
}

//Q17
//Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
//sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
//o instante do sistema: new Date()
fun q17(){
    println("ENTRE COM OS DADOS DO CLIENTE:")
    print("Nome: ")
    var name = readln()
    print("E-mail: ")
    var email = readln()
    print("Data de aniversário: ")
    var birthDateString = readln()
    var birthDate = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(birthDateString))
    println("ENTRE COM OS DADOS DO PEDIDO:")
    print("Status: ")
    var status = readln().uppercase()
    print("Quantos item serão pedidos: ")

    var order1 = Order(Client(name, email, birthDate), LocalDateTime.now(), OrderStatus.valueOf(status))

    var quantity = readln().toInt()
    for (i in 1..quantity){
        println("Dados do ${i}º pedido:")
        print("Nome do produto: ")
        var productName = readln()
        print("Preço do produto: ")
        var productPrice = readln().toDouble()
        print("Quantidade: ")
        var productQuantity = readln().toInt()

        order1.orderItem.add(OrderItem(Product(productName,productPrice),productQuantity))
    }

    println("RESUMO DO PEDIDO:")
    println("Momento do pedido: ${order1.momentFormat}")
    println("Status do pedido: ${order1.status}")
    println("Cliente: ${order1.getClient()}")
    println("Itens do pedido:")
    for (i in order1.orderItem){
        println("${i.product.name}, Quantidade: ${i.quantity}, Subtotal: ${i.subTotal()}")
    }
    print("Valor total: R$${order1.orderItem.sumOf { it.subTotal() }}")
}

// HERANÇA E POLIMORFISMO
//Q18
//Uma empresa possui funcionários próprios e terceirizados.
//Para cada funcionário, deseja-se registrar nome, horas
//trabalhadas e valor por hora. Funcionários terceirizado
//possuem ainda uma despesa adicional.
//O pagamento dos funcionários corresponde ao valor da hora
//multiplicado pelas horas trabalhadas, sendo que os
//funcionários terceirizados ainda recebem um bônus
//correspondente a 110% de sua despesa adicional.
//Fazer um programa para ler os dados de N funcionários (N
//fornecido pelo usuário) e armazená-los em uma lista. Depois
//de ler todos os dados, mostrar nome e pagamento de cada
//funcionário na mesma ordem em que foram digitados.
//Construa o programa conforme projeto ao lado. Veja
//exemplo na próxima página.
fun q18(){
    print("Numero de funcionarios: ")
    var amount = readln().toInt()

    var listEmployeer = mutableListOf<Employeer2>()

    for (i in 1..amount){
        println("DADOS DO FUNCIONARIO #${i}:")
        print("Terceirizado (s/n)? ")
        var yesOurNot = readln()[0].lowercase()
        print("Name: ")
        var name = readln()
        print("Horas: ")
        var hours = readln().toInt()
        print("Valor por hora: ")
        var valuePerHours = readln().toDouble()
        if (yesOurNot == "s"){
            print("Despesas adicionais: ")
            var additionalCharge = readln().toDouble()
            listEmployeer.add(OutsourcedEmployeer(additionalCharge,name,hours,valuePerHours))
        } else if (yesOurNot == "n"){
            listEmployeer.add(Employeer2(name,hours,valuePerHours))
        }
    }

    println("PAGAMENTOS:")
    for (i in listEmployeer){
        println("${i.name} - R$${i.payment()}")
    }
}
//Q19
//Fazer um programa para ler os dados de N
//produtos (N fornecido pelo usuário). Ao final,
//mostrar a etiqueta de preço de cada produto na
//mesma ordem em que foram digitados.
//Todos produto possui nome e preço. Produtos
//importados possuem uma taxa de alfândega, e
//produtos usados possuem data de fabricação.
//Estes dados específicos devem ser
//acrescentados na etiqueta de preço conforme
//exemplo (próxima página). Para produtos
//importados, a taxa e alfândega deve ser
//acrescentada ao preço final do produto.
//Favor implementar o programa conforme
//projeto ao lado.
fun q19(){
    print("Numero de produtos: ")
    var amount = readln().toInt()

    var productList = mutableListOf<Product>()

    for (i in 1..amount){
        println("DADOS DO PRODUTO #${i}")
        print("Comum, usado ou importado?(c/u/i)? ")
        var productclassification = readln()[0].lowercase()
        print("Nome: ")
        var name = readln()
        print("Preço: ")
        var price = readln().toDouble()

        if (productclassification == "c"){
            productList.add(Product(name, price))
        } else if (productclassification == "u"){
            print("Data de fabricação(dd/mm/aaa): ")
            var manufacturedDate = readln()
            productList.add(UserdProduct(name,price, manufacturedDate))
        } else if (productclassification == "i"){
            print("Taxa alfandegaria: ")
            var cunstomsFee = readln().toDouble()
            productList.add(ImportedProduct(name,price,cunstomsFee))
        }
    }
    println()
    println("ETIQUETA DE PREÇOS:")
    for (i in productList){
        println("${i.priceTag()}")
    }
}
//Q20
//Fazer um programa para ler os dados de N figuras (N fornecido
//pelo usuário), e depois mostrar as áreas destas figuras na
//mesma ordem em que foram digitadas.
fun q20(){
    print("Quantas formas serão digitadas: ")
    var amount = readln().toInt()

    var listShape = mutableListOf<Shape>()

    for (i in 1..amount){
        println("DADOS DA ${i}º FORMA:")
        print("Retangulo ou circulo (r/c)? ")
        var shape = readln()[0].lowercase()
        print("Cor (BLACK/BLUE/RED): ")
        var color = readln()
        if (shape == "r"){
            print("Base: ")
            var width = readln().toDouble()
            print("Altura: ")
            var height = readln().toDouble()
            listShape.add(Rectangle2(width,height, Color.valueOf(color)))
        } else if (shape == "c"){
            print("Raio: ")
            var radiun = readln().toDouble()
            listShape.add(Circle(radiun,Color.valueOf(color)))
        }
    }
    println()
    println("AREA DAS FORMAS:")
    for (i in listShape){
        println("${"%.2f".format(i.area())}")
    }
}
//Q21
//Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
//podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
//bem como o total de imposto arrecadado.
//Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
//são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
//seguintes:
//Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
//renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
//destes gastos são abatidos no imposto.
//Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
//fica: (50000 * 25%) - (2000 * 50%) = 11500.00
//Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
//funcionários, ela paga 14% de imposto.
//Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
//400000 * 14% = 56000.00
fun q21(){
    print("Entre com o numero de contribuintes: ")
    var amount = readln().toInt()

    var taxesPayers = mutableListOf<TaxPayers>()

    for (i in 1..amount){
        println("DADOS DO ${i}º CONTRIBUINTE:")
        print("Pessoa fisica ou juridica (f/j)? ")
        var individualOrCompany = readln()[0].lowercase()

        if (individualOrCompany == "f") {
            print("Nome: ")
            var name = readln()
            print("Gastos anuais: ")
            var anualIncomme = readln().toDouble()
            print("Gastos com saude: ")
            var healthExpeditures = readln().toDouble()

            taxesPayers.add(Individual(name,anualIncomme,healthExpeditures))
        } else if (individualOrCompany == "j"){
            print("Nome: ")
            var name = readln()
            print("Gastos anuais: ")
            var anualIncomme = readln().toDouble()
            print("Numero de funcionarios: ")
            var numberOfEmplyees = readln().toInt()

            taxesPayers.add(Company(name,anualIncomme,numberOfEmplyees))
        }
    }
    println()
    println("IMPOSTOS PAGOS: ")
    for (i in taxesPayers){
        println("${i.name}: R$ ${"%.2f".format(i.taxesPaid())}")
    }
    println()
    print("IMPOSTOS TOTAIS: R$ ${taxesPayers.sumOf { it.taxesPaid() }} ")
}

//TRATAMENTO DE EXEÇÕES
//Q22
//Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
//de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
//dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
//novamente a reserva com os dados atualizados. O programa não deve aceitar dados
//inválidos para a reserva, conforme as seguintes regras:
//- Alterações de reserva só podem ocorrer para datas futuras
//- A data de saída deve ser maior que a data de entrada
fun q22(){
    try {
        print("Quarto: ")
        var room = readln().toInt()
        print("Data de entrada (dd/mm/aaaa): ")
        var checkInString = readln()
        print("Data de saida (dd/mm/aaaa): ")
        var checkOutString = readln()

        //conversções:
        fun stringForLocalDate(stringDate: String):LocalDate{
            var localDate = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(stringDate))
            return localDate
        }
        //-----------

        var checkIn = stringForLocalDate(checkInString)
        var checkOut = stringForLocalDate(checkOutString)

        var reservation = Reservation(room,checkIn,checkOut)

        println(reservation.reservationDetails())

        println()

        println("Atualização da reserva:")
        print("Data de entrada (dd/mm/aaaa): ")
        checkInString = readln()
        print("Data de saida (dd/mm/aaaa): ")
        checkOutString = readln()

        checkIn = stringForLocalDate(checkInString)
        checkOut = stringForLocalDate(checkOutString)

        reservation.upDates(checkIn,checkOut)

        println(reservation.reservationDetails())
    } catch (e:DateTimeParseException){
        println("Modelo de data incorreto, por favor escreva: dd/mm/aaaa")
    } catch (e: IllegalArgumentException){
        println(e.message)
    }
}

//Q23
//Fazer um programa para ler os dados de uma conta bancária e depois realizar um
//saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
//ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
//saque da conta. Implemente a conta bancária conforme projeto abaixo:
fun q23(){
    try {
        println("Entre com os dados da conta:")
        print("Numero: ")
        var number = readln().toInt()
        print("Titular: ")
        var holder = readln()
        print("Saldo inicial: ")
        var initialBalance = readln().toDouble()
        print("Limite de saque: ")
        var withdrawLimit = readln().toDouble()

        var account1 = Account(number,holder,initialBalance,withdrawLimit)
        println()
        print("Valor para sacar: ")
        var withdraw = readln().toDouble()
        account1.withdraw(withdraw)

        print("Saldo atual: ${account1.getBalance()}")
    } catch (e:IllegalArgumentException){
        println(e.message)
    }
}

//INTERFACES
//Q24
//Uma locadora brasileira de carros cobra um valor por hora para locações de até
//12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
//cobrada com base em um valor diário. Além do valor da locação, é acrescido no
//preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
//para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
//programa que lê os dados da locação (modelo do carro, instante inicial e final da
//locação), bem como o valor por hora e o valor diário de locação. O programa
//deve então gerar a nota de pagamento (contendo valor da locação, valor do
//imposto e valor total do pagamento) e informar os dados na tela.
fun q24(){
    //stringForDate
    fun stringForDate(stringDate:String):LocalDateTime{
        return LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse(stringDate))
    }

    println("Entre com so dados do aluguel")

    print("Modelo do carro:")
    var vehicle = readln()

    print("Retirada (dd/MM/yyyy hh:mm): ")
    var stringWithdrawal = readln()
    var start = stringForDate(stringWithdrawal)

    println("Retorno (dd/MM/yyyy hh:mm): ")
    var stringReturn = readln()
    var finish = stringForDate(stringReturn)

    var carRental = CarRental(Vehicle(vehicle),start,finish)

    print("Entre com o preço por hora: ")
    var pricePerHours = readln().toDouble()
    print("Entre com o preço por dia: ")
    var pricePerDay = readln().toDouble()

    var rentalService = RentalService(pricePerHours,pricePerDay,BrazilTaxService())

    rentalService.processingInvoice(carRental)

    println()

    println("FATURA:")
    println("Pagamento basico: ${carRental.invoice.basicPayment}")
    println("Imposto: ${carRental.invoice.tax}")
    println("Pagamento total: ${carRental.invoice.totalPayment()}")
}

//Q25
//Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
//um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
//número de meses desejado.
//A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
//Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
//por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
//juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
//Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
//e valor total do contrato). Em seguida, o programa deve ler o número de meses para
//parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
//sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
//meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.
//Veja exemplo na próxima página.
fun q25(){
    fun stringForDate(stringDate:String):LocalDate{
        return LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(stringDate))
    }

    println("Entre com os dados do contrato:")
    print("Numero: ")
    var numberContract = readln().toInt()
    print("Data(dd/mm/aaaa): ")
    var stringDate = readln()
    var date = stringForDate(stringDate)
    print("Valor do contrato: ")
    var contractValue = readln().toDouble()
    print("Numero de parcelas: ")
    var months = readln().toInt()

    //testes
    println()
    var contract1 = Contract(numberContract,date,contractValue)
    //contrato montado:
    println("${contract1.number}, ${contract1.dateString()}, R$${contract1.totalValue}")

    var contractService = ContractService(PaypalService())
    contractService.processContract(contract1,months)
    //contratos baseado nos meses:
    for (i in contract1.installment){
        println("${i.amount},${i.dueDate}")
    }
    println()
    //-------------------

    println("Parcelas:")
    for (i in contract1.installment){
        println("${i.getDueDate()} - ${i.amount}")
    }
}

//Q26
//Problema exemplo
//Fazer um programa para ler uma quantia e a duração em meses de um
//empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
//empréstimo, conforme regras de juros do Brasil. A regra de cálculo de
//juros do Brasil é juro composto padrão de 2% ao mês.
fun q26(){
    print("Quantia: ")
    var amount = readln().toDouble()
    print("Meses: ")
    var months = readln().toInt()

    var loan1 = Loan(amount,months)
    var interestCalculation = InterestCalculation(BrazilInterestService())
    interestCalculation.calculation(loan1)
    println("Pagament apos 3 meses:")
    println("R$ ${"%.2f".format(loan1.totalPayment)}")
}

//SET E MAP
//Q27
//Em um portal de cursos online, cada usuário possui um código único, representado por
//um número inteiro.
//Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
//matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
//é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
//alunos repetidos em mais de um curso.
//O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
//Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
//quantidade total e alunos dele, conforme exemplo
fun q27(){
    var totalStudenty = mutableSetOf<Int>()

    print("Alunos no curso A: ")
    var amountCourse = readln().toInt()
    for (i in 1..amountCourse){
        totalStudenty.add(readln().toInt())
    }
    print("Alunos no curso B: ")
    amountCourse = readln().toInt()
    for (i in 1..amountCourse){
        totalStudenty.add(readln().toInt())
    }
    print("Alunos no curso C: ")
    amountCourse = readln().toInt()
    for (i in 1..amountCourse){
        totalStudenty.add(readln().toInt())
    }

    println("Total de estudantes: ${totalStudenty.size}")
}

//Q28
//Na contagem de votos de uma eleição, são gerados vários registros
//de votação contendo o nome do candidato e a quantidade de votos
//(formato .csv) que ele obteve em uma urna de votação. Você deve
//fazer um programa para ler os registros de votação a partir de um
//arquivo, e daí gerar um relatório consolidado com os totais de cada
//candidato.
fun q28(){
    //Um map escrito dessa meneira não pode ter valores repetidos:
    // var exemplo = mapOf(chave to valor)

//    var votos = mapOf(
//        "Alex Blue" to 15,
//        "Maria Green" to 22,
//        "Bob brown" to 21,
//        "Alex Blue" to 30,
//        "Bob brown" to 15,
//        "Maria Green" to 27,
//        "Maria Green" to 22,
//        "Bob brown" to 25,
//        "Alex Blue" to 31
//    )

    //Dessa maneira pode:
    //var exemplo = listOf(Pair(first, second))
    var wishes = listOf(
        Pair("Alex Blue",15),
        Pair("Maria Green",22,),
        Pair("Bob brown", 21,),
        Pair("Alex Blue", 30,),
        Pair("Bob brown", 15,),
        Pair("Maria Green", 27,),
        Pair("Maria Green", 22,),
        Pair("Bob brown", 25),
        Pair("Alex Blue", 31)
    )

    var alexBlue = wishes.filter { it.first == "Alex Blue" }
    var mariaGreen = wishes.filter { it.first == "Maria Green" }
    var bobBrown = wishes.filter { it.first == "Bob brown" }

    println("Alex blue: ${alexBlue.sumOf { it.second }}")
    println("Maria Green: ${mariaGreen.sumOf { it.second }}")
    println("Bob brown: ${bobBrown.sumOf { it.second }}")
}

//Funções lambdas
//Q29
//Fazer um programa para ler um conjunto de produtos a partir de um
//arquivo em formato .csv (suponha que exista pelo menos um produto).
//Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
//nomes, em ordem decrescente, dos produtos que possuem preço
//inferior ao preço médio.
fun q29(){
    var products = listOf(
        Pair("TV", 900.0),
        Pair("Mouse", 50.0),
        Pair("Tablet", 350.0),
        Pair("HD Case ", 80.90),
        Pair("Computer", 850.0),
        Pair("Monitor", 290.0),
    )

    println("Média de preço dos produtos: ${"%.2f".format(products.sumOf { it.second }/products.size)}")
    var productInOrderDecres = products.sortedByDescending { it.second }

    for (i in productInOrderDecres){
        if (i.second < (products.sumOf { it.second }/products.size)) println(i.first)
    }
}

//Q30
//Fazer um programa para ler os dados (nome, email e salário)
//de funcionários a partir de um arquivo em formato .csv.
//Em seguida mostrar, em ordem alfabética, o email dos
//funcionários cujo salário seja superior a um dado valor
//fornecido pelo usuário.
//Mostrar também a soma dos salários dos funcionários cujo
//nome começa com a letra 'M'.

fun q30(){
    var emplooyers = listOf<Employeer3>(
        Employeer3("maria","maria@gmail.com",3200.0),
        Employeer3("alex","alex@gmail.com",1900.0),
        Employeer3("marcos","marco@gmail.com",1700.0),
        Employeer3("bob","bob@gmail.com",3500.0),
        Employeer3("ana","ana@gmail.com",2800.0)
    )

    print("Insira o salario: ")
    var salary = readln().toDouble()

    println("E-mail de pessoas cujo salário é superior a R$${salary}: ")
    var higherSalary = emplooyers.filter { it.salary > salary }
    var higherSalaryOrdened = higherSalary.sortedBy { it.name }
    for (i in higherSalaryOrdened) println(i.email)

    print("Soma dos salários das pessoas cujo nome começa com 'M': ")
    var nameStartM = emplooyers.filter { it.name.startsWith("m")}
    print(nameStartM.sumOf { it.salary })

}
//class para a resolução do exercicio 30
class Employeer3(var name:String, var email:String, var salary:Double)