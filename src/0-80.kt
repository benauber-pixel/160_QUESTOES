import kotlin.math.*
fun algoritmo1 (){
    val item1 = "frigideira"
    val item2 = "ovo"
    val item3 = "oleo"
    val item4 = "sal"

    println("--{ALGORITMO 01}--")

    println("1 -pegar $item1,$item2,$item3,$item4")
    println("2 -colocar $item3 na $item1")
    println("3 -acender o fogo")
    println("4 -colocar a $item1 no fogo")
    println("5 -esperar o $item2 esquentar")
    println("6 -colocar o $item2")
    println("7 -retirar quando pronto")
}

fun algoritmo2 (){
    val item1 ="chiclete"
    val item2 = "papel"

    println("--{ALGORITMO 02}--")

    println("1 -pegar o $item1")
    println("2 -retirar o $item2")
    println("3 -mastigar")
    println("4 -jogar o $item2 no lixo")
}
fun algoritmo3 (){
    val item1 = "lâmpada"
    val item2 = "escada"
    val item3 = "pano"
    var lampadaquente = true
    var visaoalcance = 50.0
    var distancialampada = 75.0

    println("--{ALGORITMO 03}--")

    if (distancialampada > visaoalcance) {
        println("1 -pegar a $item2")
        println("2 -pegar a $item1")
    }
    if (lampadaquente == true) {
        println("3 -pegar $item3")
    }
    println("4 -Tirar $item1 queimada")
    println("5 -Colocar $item1 nova")
}
fun algoritmo4 (){
    var previsaotempo = listOf("sol","chuva","nublado")
    var tempohoje = previsaotempo[0]

    println("--{ALGORITMO 04}--")

    println("1 -vejo a previsão do tempo")
    if(tempohoje == previsaotempo[0]){
    println("2 -vou a praia")
    }else{
        println("2 -vou estudar")
    }
    println("3 -almoçar")
    println("4 -ver televisão")
    println("5 -dormir")

}
fun algoritmo5 (){
    val ingrediente1 = "massa"
    val item1 = "forma"
    val resultado1 = "bolo"
    var roupabranca = true
    var batedeira = false

    println("--{ALGORITMO 05}--")

    println("1 -pegar os ingredientes")
    if(roupabranca){
    println("2 -colocar avental")
        }
    if (batedeira){
        println("3 -bater os ingredientes na batedeira")
    }else{
        println("3 -bater os ingredientes à mão")
    }
    println("4 -colocar a $ingrediente1 na $item1")
    println("5 -colocar a $item1 no forno")
    println("6 -aguardar o tempo necessário")
    println("7 -retirar o $resultado1")
}
fun algoritmo6 (){
    var item1 = "faca"
    var item2 = "bacia"
    var comida1 = "batatas"
    var qtdbatatas = 5 //imagina que temos 5 batatas

    println("--{ALGORITMO 06}--")

    println("1 -pegar a $item1, $item2 e $comida1")
    println("2 -colocar água na $item2")
    println("3 -descascar batatas")
    for(i in 1..qtdbatatas) {
        println("descascando batatas")
    }

}
fun algoritmo7 () {
    var horadeprova = 5.00
    val questoesdaprova = 90
    var questoesquefaltam = 65
    var saberesolver = true

    println("--{ALGORITMO 07}--")

    println("1 -ler a prova")
    println("2 -pegar a caneta")
    while ((questoesquefaltam > 0) && horadeprova >= 0.30) {
        if (saberesolver){
        println("3 -resolver a questão")
        }else{
            println("3 -pular para outra questão")
        }
        questoesquefaltam--
        horadeprova -= .15
    }
    println("4 -entregar a prova")
}
fun algoritmo8() {
    var houverLacunasVazias = true
    var corpoIncompleto = true
    var acertarLetra = true

    println("--{ALGORITMO 08}--")

    println("1 -escolher a palavra")
    println("2 -montar o diagrama do jogo")

    while (houverLacunasVazias && corpoIncompleto) {
        if (acertarLetra) {
            println("3 -escrever na lacuna correspondente")
        } else {
            println("3 -desenhar uma parte do corpo na forca")
        }
        houverLacunasVazias = false
    }
}
fun algoritmo9() {
    var existirQuadradoLivre = true
    var ninguemGanhouOuPerdeu = true
    var centroLivre = true
    var adversarioAmeaca = false
    var haAlgumCantoLivre = true

    println("--{ALGORITMO 09}--")

    while (existirQuadradoLivre && ninguemGanhouOuPerdeu) {
        println("1 -espere a jogada do adversário, continue depois")

        if (existirQuadradoLivre) {
            if (centroLivre) {
                println("2 - jogue no centro")
            } else {
                if (adversarioAmeaca) {
                    println("2 -jogue neste quadrado desocupado")
                } else {
                    if (haAlgumCantoLivre) {
                        println("2 -jogue neste canto")
                    }
                }
            }
        }

        existirQuadradoLivre = false
    }
}
fun algoritmo10 () {
    println("--{ALGORITMO 10}--")
    println("1 -Levar a grama e o leão")
    println("2 - Voltar com o leão")
    println("3 - Deixar o leão")
    println("4 - Levar a cabra ")
    println("5 - Deixar a cabra")
    println("6 - Voltar com a grama")
    println("7 - Levar o leão e a grama")
}





fun algoritmo11() {
    println("--{ALGORITMO 11}--")
    println("Aprendendo Algoritmo!!!")
}

fun algoritmo12() {
    println("--{ALGORITMO 12}--")
    print("Aprendendo Algoritmo !!!")
    println("Com Anita e Guto")
}

fun algoritmo13() {
    println("--{ALGORITMO 13}--")
    print("Aprendendo Algoritmo!!!")
    println("\nCom Anita e Guto")
}

fun algoritmo14() {
    println("--{ALGORITMO 14}--")
    print("Aprendendo Algoritmo !!!\n")
    println("Com Anita e Guto")
}

fun algoritmo15() {
    println("--{ALGORITMO 15}--")
    println("Aprendendo Algoritmo \n Com Anita e Guto\n\n E implementando no UAL\n Fica muito mais fácil!! ")
}

fun algoritmo16() {
    println("--{ALGORITMO 16}--")
    val x: Int = 10
    println(x)
}

fun algoritmo17() {
    println("--{ALGORITMO 17}--")
    val x: Int = 10
    println("Valor de X = $x")
}

fun algoritmo18() {
    println("--{ALGORITMO 18}--")
    val x: Int = 10
    println("Valor de x = ${x + 1}")
}

fun algoritmo19() {
    println("--{ALGORITMO 19}--")
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${exp(0.5 * ln(64.0)).roundToInt()}")
    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")
    println(String.format("%.3f", sin(45.0 * PI / 180.0) + 0.0001))
    println("potencia com exp e log e formatar: ${String.format("%.3f", exp(3.0 * ln(8.0)) + 0.001)}")
    println("potencia com exp e log sem formatar: ${exp(3.0 * ln(8.0))}")
    println("potencia com operador ** e formatar: ${String.format("%.3f", 8.0.pow(3))}")
    println("raiz cubica: ${exp((1.0 / 3.0) * ln(8.0))}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${5.5.roundToInt()}")
    println("convertendo para inteiro 6.5: ${6.5.roundToInt()}")
    println("convertendo para inteiro 6.5 + 0.0001: ${(6.5 + 0.0001).roundToInt()}")
    println("convertendo para inteiro 5.45: ${5.45.roundToInt()}")
    println("convertendo para inteiro 5.51: ${5.51.roundToInt()}")
    println("convertendo para real 87: ${87.toDouble()}")
    println("convertendo para int 3/4: ${(3.0 / 4.0).roundToInt()}")
}

fun algoritmo20() {
    println("--{ALGORITMO 20}--")
    print("digite palavra 1: ")
    val c = readln()
    print("digite palavra 2: ")
    val c1 = readln()
    println(c.length)
    println("concatenando: ${c + c1}")
    val d = c
    println("E O CONTEUDO DE D: $d")
    val d1 = c + c1
    println("concatenacao: $d1")
    println("primeiro caractere: ${c.first()}")
    println("ultimo caractere: ${c.last()}")
    println("todos menos o primeiro: ${c.drop(1)}")
    println("o terceiro elemento (pos 3): ${c[3]}")
    println("os tres primeiros elementos: ${c.take(3)}")
    println("os tres ultimos elementos: ${c.drop(3)}")
}

fun algoritmo21() {
    println("--{ALGORITMO 21}--")
    println("TESTANDO HIERARQUIA")
    println("12 + 5/2 é igual a: ${12 + 5.0 / 2.0}")
    println("É DIFERENTE DE (12 + 5)/2 que é igual a: ${(12 + 5) / 2.0}")
    println("64**1/4 é igual a: ${64.0.pow(1) / 4}")
    println("É DIFERENTE de 64**(1/4) que é igual a: ${64.0.pow(1.0 / 4.0)}")
    println("3*7 % 5 é igual a: ${3 * (7 % 5)}")
    println("É DIFERENTE de (3*7) % 5 que é igual a: ${(3 * 7) % 5}")
    println("3*7 div 5 é igual a: ${(3 * 7) / 5}")
}

fun algoritmo22() {
    println("--{ALGORITMO 22}--")
    println("TESTANDO HIERARQUIA")
    println("20 / 4 div 2 é igual a: ${(20 / 4) / 2}")
    println("30 / 4 div 2 é igual a: ${(30.0 / 4.0).roundToInt() / 2}")
    println("7. div 4: ${7.0.roundToInt() / 4}")
    println("7 div 4: ${7 / 4}")
    println("6. div 4: ${6.0.roundToInt() / 4}")
    println("6 div 4: ${6 / 4}")
}

fun algoritmo23() {
    println("--{ALGORITMO 23}--")
    print("Digite numero de tres casas: ")
    val a = readln().toInt()
    val d = (a % 100) / 10
    println("algarismo da casa das dezenas: $d")
}

fun algoritmo24() {
    println("--{ALGORITMO 24}--")
    print("Digite numero de tres casas: ")
    val a = readln().toInt()
    val d = (a / 10) % 10
    println("algarismo da casa das dezenas: $d")
}

fun algoritmo25() {
    println("--{ALGORITMO 25}--")
    print("Digite data no formato ddmmaa: ")
    val data = readln().toInt()
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}

fun algoritmo26() {
    println("--{ALGORITMO 26}--")
    print("Digite data no formato DDMMAA: ")
    val data = readln().toInt()
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    val ndata = mes * 10000 + dia * 100 + ano
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("DATA NO FORMATO MMDDAA: $ndata")
}

fun algoritmo27() {
    println("--{ALGORITMO 27}--")
    var x = 2
    var y = 5
    println("x = $x")
    x++
    println("y = $y")
    y--
    println("novo valor de x = $x")
    println("novo valor de y = $y")
}


fun algoritmo28() {
    println("--{ALGORITMO 28}--")
    println("E PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER")
}

fun algoritmo29() {
    println("--{ALGORITMO 29}--")
    println("<seu nome>")
}

fun algoritmo30() {
    println("--{ALGORITMO 30}--")
    val produto = 28 * 43
    println("O produto entre os dois e: $produto")
}

fun algoritmo31() {
    println("--{ALGORITMO 31}--")
    val ma = (8 + 9 + 7) / 3.0
    println("A media aritmetica e: $ma")
}

fun algoritmo32() {
    println("--{ALGORITMO 32}--")
    print("entre com um numero: ")
    val num = readln().toInt()
    println("numero: $num")
}

fun algoritmo33() {
    println("--{ALGORITMO 33}--")
    print("entre com um numero: ")
    val num1 = readln().toInt()
    print("entre com outro numero: ")
    val num2 = readln().toInt()
    println("numero 1: $num1")
    println("numero 2: $num2")
}

fun algoritmo34() {
    println("--{ALGORITMO 34}--")
    print("entre com um numero: ")
    val numero = readln().toInt()
    val ant = numero - 1
    val suc = numero + 1
    println("o sucessor e $suc o antecessor e $ant")
}

fun algoritmo35() {
    println("--{ALGORITMO 35}--")
    print("entre com nome: ")
    val nome = readln()
    print("entre com endereco: ")
    val endereco = readln()
    print("entre com telefone: ")
    val telefone = readln()
    println("\nNome: $nome")
    println("Endereco: $endereco")
    println("Telefone: $telefone")
}

fun algoritmo36() {
    println("--{ALGORITMO 36}--")
    print("entre com um numero: ")
    val num1 = readln().toInt()
    print("entre com outro numero: ")
    val num2 = readln().toInt()
    val soma = num1 + num2
    println("Soma: $soma")
}

fun algoritmo37() {
    println("--{ALGORITMO 37}--")
    print("entre com um numero: ")
    val num1 = readln().toInt()
    print("entre com outro numero: ")
    val num2 = readln().toInt()
    val prod = num1 * num2
    println("produto: $prod")
}

fun algoritmo38() {
    println("--{ALGORITMO 38}--")
    print("entre com um numero com ponto: ")
    val num = readln().toDouble()
    println("a terça parte e: ${num / 3}")
}

fun algoritmo39() {
    println("--{ALGORITMO 39}--")
    print("digite 1a nota: ")
    val nota1 = readln().toDouble()
    print("digite 2a nota: ")
    val nota2 = readln().toDouble()
    val media = (nota1 + nota2) / 2
    println("media: $media")
}

fun algoritmo40() {
    println("--{ALGORITMO 40}--")
    print("entre com o dividendo: ")
    val val1 = readln().toInt()
    print("entre com divisor: ")
    val val2 = readln().toInt()
    val quoc = val1 / val2
    val rest = val1 % val2
    println("\ndividendo: $val1")
    println("divisor: $val2")
    println("quociente: $quoc")
    println("resto: $rest")
}

fun algoritmo41() {
    println("--{ALGORITMO 41}--")
    print("entre com 1 numero: ")
    val a = readln().toDouble()
    print("entre com 2 numero: ")
    val b = readln().toDouble()
    print("entre com 3 numero: ")
    val c = readln().toDouble()
    print("entre com 4 numero: ")
    val d = readln().toDouble()
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("media ponderada: $mp")
}

fun algoritmo42() {
    println("--{ALGORITMO 42}--")
    print("digite um angulo em graus: ")
    val angulo = readln().toDouble()
    val rang = angulo * PI / 180
    println("seno: ${sin(rang)}")
    println("co-seno: ${cos(rang)}")
    println("tangente: ${tan(rang)}")
    println("co-secante: ${1 / sin(rang)}")
    println("secante: ${1 / cos(rang)}")
    println("cotangente: ${1 / tan(rang)}")
}

fun algoritmo43() {
    println("--{ALGORITMO 43}--")
    print("entre com o logaritmando: ")
    val num = readln().toDouble()
    val logaritmo = log10(num)
    println("logaritmo: $logaritmo")
}

fun algoritmo44() {
    println("--{ALGORITMO 44}--")
    print("entre com o logaritmando: ")
    val num = readln().toDouble()
    print("entre com a base: ")
    val base = readln().toDouble()
    val logaritmo = ln(num) / ln(base)
    println("o logaritmo de $num na base $base e: $logaritmo")
}

fun algoritmo45() {
    println("--{ALGORITMO 45}--")
    print("digite numero: ")
    val num = readln().toDouble()
    val quad = num.pow(2)
    val raizquad = sqrt(num)
    println("numero: $num")
    println("quadrado: $quad")
    println("raiz quadrada: $raizquad")
}

fun algoritmo46() {
    println("--{ALGORITMO 46}--")
    print("digite saldo: ")
    val saldo = readln().toDouble()
    val nsaldo = saldo * 1.01
    println("novo saldo: $nsaldo")
}

fun algoritmo47() {
    println("--{ALGORITMO 47}--")
    print("entre com um número de 3 dígitos: ")
    val num = readln().toInt()
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("número: $num")
    println("invertido: $num1")
}

fun algoritmo48() {
    println("--{ALGORITMO 48}--")
    print("entre com o salário mínimo: ")
    val sm = readln().toDouble()
    print("entre com a quantidade em quilowatt: ")
    val qtdade = readln().toDouble()
    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("preço do quilowatt: $preco\nvalor a ser pago: $vp\nvalor com desconto: $vd")
}

fun algoritmo49() {
    println("--{ALGORITMO 49}--")
    print("entre com nome: ")
    val nome = readln()
    println("todo nome: $nome")
    println("primeiro caractere: ${nome.first()}")
    println("ultimo caractere: ${nome.last()}")
    println("primeiro ao terceiro caractere: ${nome.take(3)}")
    println("quarto caractere: ${nome[3]}")
    println("todos menos o primeiro: ${nome.drop(1)}")
    val n = nome.length - 2
    println("os dois ultimos: ${nome.drop(n)}")
}

fun algoritmo50() {
    println("--{ALGORITMO 50}--")
    print("digite base: ")
    val base = readln().toDouble()
    print("digite altura: ")
    val altura = readln().toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2) + altura.pow(2))
    println("perimetro = $perimetro")
    println("area = $area")
    println("diagonal = $diagonal")
}

fun algoritmo51() {
    println("--{ALGORITMO 51}--")
    print("digite raio: ")
    val raio = readln().toDouble()
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2)
    println("perimetro: $perimetro")
    println("area: $area")
}

fun algoritmo52() {
    println("--{ALGORITMO 52}--")
    print("digite o lado do quadrado: ")
    val lado = readln().toDouble()
    val perimetro = 4 * lado
    val area = lado.pow(2)
    val diagonal = lado * sqrt(2.0)
    println("perimetro: $perimetro")
    println("area: $area")
    println("diagonal: $diagonal")
}

fun algoritmo53() {
    println("--{ALGORITMO 53}--")
    print("entre com a base: ")
    val a = readln().toDouble()
    print("entre com a altura: ")
    val b = readln().toDouble()
    print("entre com a profundidade: ")
    val c = readln().toDouble()
    val diagonal = sqrt(a.pow(2) + b.pow(2) + c.pow(2))
    println("diagonal: $diagonal")
}

fun algoritmo54() {
    println("--{ALGORITMO 54}--")
    print("Entre com a base: ")
    val a = readln().toDouble()
    print("Entre a altura do triângulo: ")
    val b = readln().toDouble()
    println("Area: ${(a * b) / 2}")
}

fun algoritmo55() {
    println("--{ALGORITMO 55}--")
    print("medida da diagonal maior: ")
    val diagmaior = readln().toDouble()
    print("medida da diagonal menor: ")
    val diagmenor = readln().toDouble()
    val area = (diagmaior * diagmenor) / 2
    println("area = $area")
}

fun algoritmo56() {
    println("--{ALGORITMO 56}--")
    print("digite nome: ")
    val nome = readln()
    print("digite idade: ")
    val idade = readln().toInt()
    println("\nnome = $nome")
    println("idade = $idade")
}

fun algoritmo57() {
    println("--{ALGORITMO 57}--")
    print("digite pr1: ")
    val pr1 = readln().toDouble()
    print("digite pr2: ")
    val pr2 = readln().toDouble()
    val mf = (pr1 + pr2) / 2
    println("media truncada = ${mf.toInt()}")
    println("media arredondada = ${(mf + 0.001).roundToInt()}")
}

fun algoritmo58() {
    println("--{ALGORITMO 58}--")
    print("Entrar com 1 valor: ")
    val xnum1 = readln().toDouble()
    print("Entrar com 2 valor: ")
    val xnum2 = readln().toDouble()
    print("Entrar com 3 valor: ")
    val xnum3 = readln().toDouble()
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X = $x")
}

fun algoritmo59() {
    println("--{ALGORITMO 59}--")
    print("Entrar com 1 cateto: ")
    val b = readln().toDouble()
    print("Entrar com 2 cateto: ")
    val c = readln().toDouble()
    val a = sqrt(b.pow(2) + c.pow(2))
    println("A hipotenusa e: $a")
}

fun algoritmo60() {
    println("--{ALGORITMO 60}--")
    print("Entrar com o 1o termo: ")
    val termo = readln().toInt()
    print("Entrar com a razao: ")
    val razao = readln().toInt()
    val dec = termo + 9 * razao
    println("o 10 termo desta P.A. e: $dec")
}

fun algoritmo61() {
    println("--{ALGORITMO 61}--")
    print("Entre com o 1o termo: ")
    val termo = readln().toInt()
    print("Entre com a razao: ")
    val razao = readln().toInt()
    val quinto = termo * (razao * razao * razao * razao)
    println("o 5o termo desta P.G. e: $quinto")
}

fun algoritmo62() {
    println("--{ALGORITMO 62}--")
    print("digite valor do produto: ")
    val preco = readln().toDouble()
    val npreco = preco * 0.91
    println("preco com desconto: $npreco")
}

fun algoritmo63() {
    println("--{ALGORITMO 63}--")
    print("horas trabalhadas: ")
    val na = readln().toInt()
    print("valor da hora-aula: ")
    val vha = readln().toDouble()
    print("percentual de desconto: ")
    val pd = readln().toDouble()
    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td
    println("salario liquido: $sl")
}

fun algoritmo64() {
    println("--{ALGORITMO 64}--")
    print("digite o valor da temperatura em graus centigrados: ")
    val c = readln().toDouble()
    val f = (9 * c + 160) / 5
    println("o valor da temperatura em graus fahrenheit e = $f")
}

fun algoritmo65() {
    println("--{ALGORITMO 65}--")
    print("digite a altura da lata: ")
    val altura = readln().toDouble()
    print("digite o raio da lata: ")
    val raio = readln().toDouble()
    val volume = Math.PI * (raio * raio) * altura
    println("o volume da lata e = $volume")
}

fun algoritmo66() {
    println("--{ALGORITMO 66}--")
    print("digite o tempo gasto: ")
    val tempo = readln().toDouble()
    print("digite a velocidade media: ")
    val vel = readln().toDouble()
    val dist = tempo * vel
    val litros = dist / 12
    println("velocidade = $vel\ntempo = $tempo\ndistancia = $dist\nlitros = $litros")
}

fun algoritmo67() {
    println("--{ALGORITMO 67}--")
    print("digite o valor da prestação: ")
    val valor = readln().toDouble()
    print("digite a taxa: ")
    val taxa = readln().toDouble()
    print("digite o tempo (numero de meses): ")
    val tempo = readln().toInt()
    val prest = valor + (valor * (taxa / 100) * tempo)
    println("o valor da prestacao em atraso e = $prest")
}

fun algoritmo68() {
    println("--{ALGORITMO 68}--")
    print("digite 1 numero com ponto: ")
    var a = readln().toDouble()
    print("digite 2 numero com ponto: ")
    var b = readln().toDouble()
    val aux = a
    a = b
    b = aux
    println("a = $a, b = $b")
}

fun algoritmo69() {
    println("--{ALGORITMO 69}--")
    print("digite numerador: ")
    val num = readln().toInt()
    print("digite denominador: ")
    val denom = readln().toInt()
    println("decimal: ${num.toDouble() / denom}")
}

fun algoritmo70() {
    println("--{ALGORITMO 70}--")
    print("Entre com o valor da conta: ")
    val cres = readln().toDouble()
    val cgorj = cres * 1.1
    println("o valor da conta com a gorjeta sera: ${String.format("%.2f", cgorj)}")
}

fun algoritmo71() {
    println("--{ALGORITMO 71}--")
    print("entre com hora atual: ")
    val hora = readln().toInt()
    print("entre com minutos: ")
    val minuto = readln().toInt()
    val tminuto = hora * 60 + minuto
    println("Ate agora se passaram: $tminuto minutos")
}

fun algoritmo72() {
    println("--{ALGORITMO 72}--")
    print("entre com depósito: ")
    val deposito = readln().toDouble()
    print("entre com a taxa de juros: ")
    val taxa = readln().toDouble()
    val valor = deposito * taxa / 100
    val total = deposito + valor
    println("Rendimentos: $valor\nTotal: $total")
}

fun algoritmo73() {
    println("--{ALGORITMO 73}--")
    print("entre com um numero com parte fracionaria: ")
    val num = readln().toDouble()
    val numi = num.toInt()
    val numfrac = num - numi
    val numa = Math.round(num + 0.00001)
    println("parte inteira: $numi")
    println("parte fracionaria: ${String.format("%.3f", numfrac + 0.00001)}")
    println("numero arredondado: $numa")
}

fun algoritmo74() {
    println("--{ALGORITMO 74}--")
    print("entre com o salario minimo: ")
    val salmin = readln().toDouble()
    print("entre com o salario da pessoa: ")
    val salpe = readln().toDouble()
    val num = salpe / salmin
    println("a pessoa ganha $num salarios minimos")
}

fun algoritmo75() {
    println("--{ALGORITMO 75}--")
    print("entre com seu peso, so a parte inteira: ")
    val peso = readln().toInt()
    val pesogramas = peso * 1000
    val novopeso = (pesogramas * 1.12).toInt()
    println("peso em gramas: $pesogramas")
    println("novo peso: $novopeso")
}

fun algoritmo76() {
    println("--{ALGORITMO 76}--")
    print("digite numero: ")
    val num = readln().toInt()
    println("sucessor: ${(num + 1) % 61}")
}

fun algoritmo77() {
    println("--{ALGORITMO 77}--")
    print("digite 1 numero: ")
    val a = readln().toDouble()
    print("digite 2 numero: ")
    val b = readln().toDouble()
    val d = (a - b) * (a - b)
    val q = (a * a) - (b * b)
    println("o quadrado da diferenca = $d\ndiferenca dos quadrados = $q")
}

fun algoritmo78() {
    println("--{ALGORITMO 78}--")
    print("digite o numero de lados do poligono: ")
    val n = readln().toInt()
    val nd = n * (n - 3) / 2.0
    println("numero de diagonais: $nd")
}

fun algoritmo79() {
    println("--{ALGORITMO 79}--")
    print("digite o valor da aplicacao: ")
    val p = readln().toDouble()
    print("digite a taxa (0 - 1): ")
    val i = readln().toDouble()
    print("digite o numero de meses: ")
    val n = readln().toInt()
    val va = p * (Math.pow(1 + i, n.toDouble()) - 1) / i
    println("O valor acumulado: $va")
}

fun algoritmo80() {
    println("--{ALGORITMO 80}--")
    print("Digite a quantidade de fitas: ")
    val quant = readln().toInt()
    print("Digite o valor do aluguel: ")
    val valAluguel = readln().toDouble()
    val fatAnual = (quant / 3.0) * valAluguel * 12
    println("Faturamento anual: $fatAnual")
    val multas = valAluguel * 0.1 * ((quant / 3.0) / 10)
    println("Multas mensais: $multas")
    val quantFinal = quant - (quant * 0.02) + (quant / 10.0)
    println("Quantidade de fitas no final do ano: $quantFinal")
}