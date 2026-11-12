fun algoritmo81() {
    println("--{ALGORITMO 81}--")
    print("Digite conta de tres digitos: ")
    val conta = readln().toInt()
    var d1 = conta / 100
    var d2 = (conta % 100) / 10
    var d3 = (conta % 100) % 10
    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv
    d1 = (soma / 100) * 1
    d2 = ((soma % 100) / 10) * 2
    d3 = ((soma % 100) % 10) * 3
    val digito = (d1 + d2 + d3) % 10
    println("digito verificador: $digito")
}

fun algoritmo82() {
    println("--{ALGORITMO 82}--")
    print("digite numero: ")
    val numero = readln().toDouble()
    if (numero > 20.0) {
        println("metade: ${numero / 2}")
    }
}

fun algoritmo83() {
    println("--{ALGORITMO 83}--")
    print("digite numero: ")
    val numero = readln().toDouble()
    if (numero > 0.0) {
        println("inverso: ${1 / numero}")
    } else {
        println("absoluto: ${numero * -1}")
    }
}

fun algoritmo84() {
    println("--{ALGORITMO 84}--")
    print("Digite numero: ")
    val a = readln().toInt()
    if (a % 2 == 0) {
        println("PAR")
    } else {
        println("IMPAR")
    }
}

fun algoritmo85() {
    println("--{ALGORITMO 85}--")
    print("digite 1 numero: ")
    val a = readln().toDouble()
    print("digite 2 numero: ")
    val b = readln().toDouble()
    print("digite 3 numero: ")
    val c = readln().toDouble()
    val max = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println(max)
}

fun algoritmo86() {
    println("--{ALGORITMO 86}--")
    print("Digite numero: ")
    val num = readln().toDouble()
    if (num > 0.0) {
        println("POSITIVO")
    } else if (num < 0.0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}

fun algoritmo87() {
    println("--{ALGORITMO 87}--")
    print("Qual a capital do Brasil? ")
    val resp = readln()
    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("PARABÉNS!")
    } else if (resp == "brasília" || resp == "BRAZÍLIA" || resp == "Brazília" || resp == "brazília") {
        println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}

fun algoritmo88() {
    println("--{ALGORITMO 88}--")
    println("*************")
    println("*CALCULADORA*")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")
    print("Digite opcao: ")
    val resp = readln()
    if (resp == "+") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDouble()
        print("Digite 2 numero com ponto: ")
        val b = readln().toDouble()
        println("SOMA: ${a + b}")
    } else if (resp == "-") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDouble()
        print("Digite 2 numero com ponto: ")
        val b = readln().toDouble()
        println("SUBTRACAO: ${a - b}")
    } else if (resp == "*") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDouble()
        print("Digite 2 numero com ponto: ")
        val b = readln().toDouble()
        println("MULTIPLICACAO: ${a * b}")
    } else if (resp == "/") {
        print("Digite 1 numero com ponto: ")
        val a = readln().toDouble()
        print("Digite 2 numero com ponto: ")
        val b = readln().toDouble()
        println("DIVISAO: ${a / b}")
    } else {
        println("OPCAO NAO DISPONIVEL!")
    }
}

fun algoritmo89() {
    println("--{ALGORITMO 89}--")
    println("Planetas: 1-Mercurio | 2-Venus | 3-Marte | 4-Jupiter | 5-Saturno | 6-Urano")
    print("Escolha o planeta a ser analisado: ")
    val op = readln().toInt()
    print("Entre com um peso na terra: ")
    val pterra = readln().toDouble()
    when (op) {
        1 -> println("Seu peso no planeta é: ${(pterra / 10) * 0.37}")
        2 -> println("Seu peso no planeta é: ${(pterra / 10) * 0.88}")
        3 -> println("Seu peso no planeta é: ${(pterra / 10) * 0.38}")
        4 -> println("Seu peso no planeta é: ${(pterra / 10) * 2.64}")
        5 -> println("Seu peso no planeta é: ${(pterra / 10) * 1.15}")
        6 -> println("Seu peso no planeta é: ${(pterra / 10) * 1.17}")
        else -> println("Este planeta não pode ser analisado")
    }
}

fun algoritmo90() {
    println("--{ALGORITMO 90}--")
    print("digite numero: ")
    val numero = readln().toDouble()
    if (numero > 20.0) {
        println(numero)
    }
}

fun algoritmo91() {
    println("--{ALGORITMO 91}--")
    print("digite 1 numero: ")
    val num1 = readln().toInt()
    print("digite 2 numero: ")
    val num2 = readln().toInt()
    val soma = num1 + num2
    if (soma > 10) {
        println("soma: $soma")
    }
}

fun algoritmo92() {
    println("--{ALGORITMO 92}--")
    print("digite 1 numero: ")
    val num1 = readln().toDouble()
    print("digite 2 numero: ")
    val num2 = readln().toDouble()
    val soma = num1 + num2
    if (soma > 20.0) {
        println("soma: ${soma + 8}")
    } else {
        println("soma: ${soma - 5}")
    }
}

fun algoritmo93() {
    println("--{ALGORITMO 93}--")
    print("digite numero: ")
    val numero = readln().toDouble()
    if (numero > 0.0) {
        println("raiz: ${Math.sqrt(numero)}")
    } else if (numero < 0.0) {
        println("quadrado: ${numero * numero}")
    }
}

fun algoritmo94() {
    println("--{ALGORITMO 94}--")
    print("digite numero: ")
    val numero = readln().toInt()
    if (numero % 3 == 0) {
        println("multiplo de 3")
    } else {
        println("nao e multiplo de 3")
    }
}

fun algoritmo95() {
    println("--{ALGORITMO 95}--")
    print("digite numero: ")
    val numero = readln().toInt()
    if (numero % 5 == 0) {
        println("e divisivel por 5")
    } else {
        println("nao e divisivel por 5")
    }
}

fun algoritmo96() {
    println("--{ALGORITMO 96}--")
    print("digite numero: ")
    val numero = readln().toInt()
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("divisível por 3 e por 7")
    } else {
        println("não e divisível por 3 e por 7")
    }
}

fun algoritmo97() {
    println("--{ALGORITMO 97}--")
    print("digite numero: ")
    val numero = readln().toInt()
    if (numero % 10 == 0) {
        println("múltiplo de 10")
    } else if (numero % 2 == 0) {
        println("múltiplo de 2")
    } else if (numero % 5 == 0) {
        println("múltiplo de 5")
    } else {
        println("não é múltiplo de 2 nem de 5")
    }
}

fun algoritmo98() {
    println("--{ALGORITMO 98}--")
    print("digite o salario: ")
    val sb = readln().toDouble()
    print("digite o valor da prestacao: ")
    val vp = readln().toDouble()
    if (vp <= 0.3 * sb) {
        println("emprestimo concedido")
    } else {
        println("emprestimo negado")
    }
}

fun algoritmo99() {
    println("--{ALGORITMO 99}--")
    print("numero de 3 algarismos: ")
    val num = readln().toInt()
    val c = num / 100
    if (c % 2 == 0) {
        println("o algarismo das centenas e par: $c")
    } else {
        println("o algarismo das centenas e impar: $c")
    }
}

fun algoritmo100() {
    println("--{ALGORITMO 100}--")
    print("numero de 4 algarismos: ")
    val num = readln().toInt()
    val c = num / 100
    if (c % 4 == 0) {
        println("o numero e multiplo de 4: $c")
    } else {
        println("o numero nao e multiplo de 4: $c")
    }
}

fun algoritmo101() {
    println("--{ALGORITMO 101}--")
    print("digite numero: ")
    val num = readln().toDouble()
    if (num > 20.0 && num < 90.0) {
        println("o número está na faixa de 20 a 90, exclusive")
    } else {
        println("o número está fora da faixa de 20 a 90")
    }
}

fun algoritmo102() {
    println("--{ALGORITMO 102}--")
    print("digite numero: ")
    val numero = readln().toDouble()
    if (numero > 20.0) {
        println("maior que 20")
    } else if (numero < 20.0) {
        println("menor que 20")
    } else {
        println("igual a 20")
    }
}

fun algoritmo103() {
    println("--{ALGORITMO 103}--")
    print("Entre com ano atual: ")
    val anoa = readln().toInt()
    print("Entre com ano de nascimento: ")
    val anon = readln().toInt()
    if (anon > anoa) {
        println("Ano de Nascimento Invalido")
    } else {
        println("Idade: ${anoa - anon}")
    }
}

fun algoritmo104() {
    println("--{ALGORITMO 104}--")
    print("digite nome: ")
    val nome = readln()
    print("digite sexo: ")
    val sexo = readln()
    print("digite idade: ")
    val idade = readln().toInt()
    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NAO ACEITA")
    }
}

fun algoritmo105() {
    println("--{ALGORITMO 105}--")
    print("digite sigla: ")
    val sigla = readln()
    if (sigla == "RJ" || sigla == "rj") {
        println("carioca")
    } else if (sigla == "SP" || sigla == "sp") {
        println("paulista")
    } else if (sigla == "MG" || sigla == "mg") {
        println("mineiro")
    } else {
        println("outros estados")
    }
}

fun algoritmo106() {
    println("--{ALGORITMO 106}--")
    print("digite nome: ")
    val nome = readln()
    val letra = nome.first().toString()
    if (letra == "A" || letra == "a") {
        println(nome)
    }
}

fun algoritmo107() {
    println("--{ALGORITMO 107}--")
    print("digite nome: ")
    val nome = readln()
    if (nome.take(5) == "JOSÉ " || nome == "JOSÉ") {
        println(nome)
    }
}

fun algoritmo108() {
    println("--{ALGORITMO 108}--")
    print("digite nome: ")
    val nome = readln()
    val prenome = nome.take(5)
    if (prenome == "JOSÉ " || prenome == "José " || prenome == "josé " ||
        nome == "jose" || nome == "José" || nome == "JOSE" || nome == "JOSÉ"
    ) {
        println(nome)
    }
}

fun algoritmo109() {
    println("--{ALGORITMO 109}--")
    print("digite 1º nome: ")
    val nome1 = readln()
    print("digite 2º nome: ")
    val nome2 = readln()
    if (nome1 < nome2) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}

fun algoritmo110() {
    println("--{ALGORITMO 110}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    if (a == b) {
        println("iguais")
    } else {
        println("diferentes")
    }
}

fun algoritmo111() {
    println("--{ALGORITMO 111}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    if (a > b) {
        println("maior: $a")
    } else {
        println("maior: $b")
    }
}

fun algoritmo112() {
    println("--{ALGORITMO 112}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    if (a < b) {
        println("menor: $a")
    } else {
        println("menor: $b")
    }
}

fun algoritmo113() {
    println("--{ALGORITMO 113}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    if (a < b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

fun algoritmo114() {
    println("--{ALGORITMO 114}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

fun algoritmo115() {
    println("--{ALGORITMO 115}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    if (a < b) {
        println("quadrado do menor = ${a * a}")
        if (b >= 0) {
            println("raiz quadrada do maior = ${Math.sqrt(b)}")
        } else {
            println("nao existe raiz real do maior")
        }
    } else {
        println("quadrado do menor = ${b * b}")
        if (a >= 0) {
            println("raiz quadrada do maior = ${Math.sqrt(a)}")
        } else {
            println("nao existe raiz real do maior")
        }
    }
}

fun algoritmo116() {
    println("--{ALGORITMO 116}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    print("digite 3º numero: ")
    val c = readln().toDouble()
    if (a > b) {
        if (a > c) println("maior: $a") else println("maior: $c")
    } else {
        if (b > c) println("maior: $b") else println("maior: $c")
    }
}

fun algoritmo117() {
    println("--{ALGORITMO 117}--")
    print("digite 1º numero: ")
    val a = readln().toDouble()
    print("digite 2º numero: ")
    val b = readln().toDouble()
    print("digite 3º numero: ")
    val c = readln().toDouble()
    val maior = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println("maior: $maior")
}

fun algoritmo118() {
    println("--{ALGORITMO 118}--")
    print("digite 1º numero: ")
    var a = readln().toDouble()
    print("digite 2º numero: ")
    var b = readln().toDouble()
    print("digite 3º numero: ")
    var c = readln().toDouble()
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    println("$a $b $c")
}

fun algoritmo119() {
    println("--{ALGORITMO 119}--")
    print("digite 1º numero: ")
    var a = readln().toDouble()
    print("digite 2º numero: ")
    var b = readln().toDouble()
    print("digite 3º numero: ")
    var c = readln().toDouble()
    var aux: Double
    if (a < b) { aux = a; a = b; b = aux }
    if (a < c) { aux = a; a = c; c = aux }
    if (b < c) { aux = b; b = c; c = aux }
    println("$a $b $c")
}

fun algoritmo120() {
    println("--{ALGORITMO 120}--")
    print("digite 1º numero: ")
    var a = readln().toDouble()
    print("digite 2º numero: ")
    var b = readln().toDouble()
    print("digite 3º numero: ")
    var c = readln().toDouble()
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    val menor = a
    val intermediario = b
    val maior = c
    println("menor: $menor | intermediario: $intermediario | maior: $maior")
}

fun algoritmo121() {
    println("--{ALGORITMO 121}--")
    print("digite 1º numero: ")
    val n1 = readln().toInt()
    print("digite 2º numero: ")
    val n2 = readln().toInt()
    print("digite 3º numero: ")
    val n3 = readln().toInt()
    print("digite 4º numero: ")
    val n4 = readln().toInt()
    print("digite 5º numero: ")
    val n5 = readln().toInt()
    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 &&
        n2 != n3 && n2 != n4 && n2 != n5 &&
        n3 != n4 && n3 != n5 && n4 != n5) {
        var maior = n1
        var menor = n1
        if (n2 > maior) maior = n2
        if (n3 > maior) maior = n3
        if (n4 > maior) maior = n4
        if (n5 > maior) maior = n5
        if (n2 < menor) menor = n2
        if (n3 < menor) menor = n3
        if (n4 < menor) menor = n4
        if (n5 < menor) menor = n5
        println("maior = $maior")
        println("menor = $menor")
    } else {
        println("os valores devem ser diferentes")
    }
}

fun algoritmo122() {
    println("--{ALGORITMO 122}--")
    print("digite 1º lado: ")
    val a = readln().toDouble()
    print("digite 2º lado: ")
    val b = readln().toDouble()
    print("digite 3º lado: ")
    val c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triangulo")
    } else {
        println("Nao podem ser lados de um triangulo")
    }
}

fun algoritmo123() {
    println("--{ALGORITMO 123}--")
    print("digite 1º lado: ")
    val a = readln().toDouble()
    print("digite 2º lado: ")
    val b = readln().toDouble()
    print("digite 3º lado: ")
    val c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("Triangulo equilatero")
        } else if (a == b || a == c || b == c) {
            println("Triangulo isosceles")
        } else {
            println("Triangulo escaleno")
        }
    } else {
        println("As medidas nao formam um triangulo")
    }
}

fun algoritmo124() {
    println("--{ALGORITMO 124}--")
    print("digite 1º lado: ")
    val a = readln().toDouble()
    print("digite 2º lado: ")
    val b = readln().toDouble()
    print("digite 3º lado: ")
    val c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val lados: Double
        if (a > b && a > c) {
            maior = a * a
            lados = (b * b) + (c * c)
        } else if (b > c) {
            maior = b * b
            lados = (a * a) + (c * c)
        } else {
            maior = c * c
            lados = (a * a) + (b * b)
        }
        if (maior == lados) {
            println("Triangulo Retangulo")
        } else if (maior > lados) {
            println("Triangulo Obtusangulo")
        } else {
            println("Triangulo Acutangulo")
        }
    } else {
        println("As medidas nao formam um triangulo")
    }
}

fun algoritmo125() {
    println("--{ALGORITMO 125}--")
    print("digite idade: ")
    val idade = readln().toInt()
    if (idade >= 65) {
        println("maior de 65")
    } else if (idade >= 18) {
        println("maior de idade")
    } else {
        println("menor de idade")
    }
}

fun algoritmo126() {
    println("--{ALGORITMO 126}--")
    print("digite numero: ")
    val x = readln().toDouble()
    if (x == 5.0) {
        println("o numero e 5")
    } else if (x == 200.0) {
        println("o numero e 200")
    } else if (x == 400.0) {
        println("o numero e 400")
    } else if (x >= 500.0 && x <= 1000.0) {
        println("intervalo 500-1000")
    } else {
        println("fora do escopo")
    }
}

fun algoritmo127() {
    println("--{ALGORITMO 127}--")
    print("digite nome: ")
    val nome = readln()
    print("digite nota 1: ")
    val n1 = readln().toDouble()
    print("digite nota 2: ")
    val n2 = readln().toDouble()
    val media = (n1 + n2) / 2
    println("Nome: $nome | Media: $media")
    if (media >= 7.0) {
        println("Aprovado")
    } else if (media < 3.0) {
        println("Reprovado")
    } else {
        println("Prova Final")
    }
}

fun algoritmo128() {
    println("--{ALGORITMO 128}--")
    print("digite verbo no infinitivo: ")
    val verbo = readln()
    val tam = verbo.length
    val ultima = verbo.last().toString()
    val penultima = verbo[tam - 2].toString()
    if (ultima == "R" || ultima == "r") {
        when (penultima.lowercase()) {
            "a" -> println("1a conjugacao")
            "e", "o" -> println("2a conjugacao")
            "i" -> println("3a conjugacao")
            else -> println("nao existe verbo com terminacao ${penultima}r")
        }
    } else {
        println("nao e verbo no infinitivo")
    }
}

fun algoritmo129() {
    println("--{ALGORITMO 129}--")
    print("digite salario: ")
    val salario = readln().toDouble()
    val desconto = when {
        salario <= 600.0 -> 0.0
        salario <= 1200.0 -> salario * 0.20
        salario <= 2000.0 -> salario * 0.25
        else -> salario * 0.30
    }
    println("desconto do INSS: $desconto")
}

fun algoritmo130() {
    println("--{ALGORITMO 130}--")
    print("digite valor do produto: ")
    val valor = readln().toDouble()
    val venda = if (valor < 20.0) valor * 1.45 else valor * 1.30
    println("valor da venda: $venda")
}

fun algoritmo131() {
    println("--{ALGORITMO 131}--")
    print("digite nome: ")
    val nome = readln()
    val letra = nome.first().uppercase()
    if (letra >= "A" && letra <= "K") {
        println("$nome : D1")
    } else if (letra >= "L" && letra <= "N") {
        println("$nome : D2")
    } else if (letra >= "O" && letra <= "Z") {
        println("$nome : D3")
    } else {
        println("nome invalido")
    }
}

fun algoritmo132() {
    println("--{ALGORITMO 132}--")
    print("digite o valor em reais: ")
    val real = readln().toDouble()
    print("digite a moeda (F-franco suico / L-libra / D-dolar / M-marco alemao): ")
    val moeda = readln().uppercase()
    val conv = when (moeda) {
        "F" -> real / 1.15
        "L" -> real / 2.75
        "D" -> real / 1.80
        "M" -> real / 0.85
        else -> -1.0
    }
    if (conv >= 0) println("Valor convertido: $conv") else println("Moeda invalida")
}

fun algoritmo133() {
    println("--{ALGORITMO 133}--")
    print("digite altura: ")
    val h = readln().toDouble()
    print("digite sexo (M/F): ")
    val sexo = readln().uppercase()
    if (sexo == "M") {
        println("peso ideal: ${(72.7 * h) - 58}")
    } else if (sexo == "F") {
        println("peso ideal: ${(62.1 * h) - 44.7}")
    } else {
        println("sexo invalido")
    }
}

fun algoritmo134() {
    println("--{ALGORITMO 134}--")
    print("digite idade: ")
    val idade = readln().toInt()
    when {
        idade < 5 -> println("nao existe categoria")
        idade <= 7 -> println("Infantil A")
        idade <= 10 -> println("Infantil B")
        idade <= 13 -> println("Juvenil A")
        idade <= 17 -> println("Juvenil B")
        else -> println("Senior")
    }
}

fun algoritmo135() {
    println("--{ALGORITMO 135}--")
    print("digite idade: ")
    val idade = readln().toInt()
    when {
        idade < 16 -> println("nao-eleitor")
        idade >= 18 && idade <= 65 -> println("eleitor obrigatorio")
        else -> println("eleitor facultativo")
    }
}

fun algoritmo136() {
    println("--{ALGORITMO 136}--")
    print("digite nome: ")
    val nome = readln()
    print("digite idade: ")
    val idade = readln().toInt()
    val valor = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }
    println("$nome pagara R$ $valor")
}

fun algoritmo137() {
    println("--{ALGORITMO 137}--")
    print("digite a: ")
    val a = readln().toDouble()
    print("digite b: ")
    val b = readln().toDouble()
    print("digite c: ")
    val c = readln().toDouble()
    if (a == 0.0) {
        println("Nao e equacao do 2o grau")
    } else {
        val d = (b * b) - 4 * a * c
        if (d >= 0) {
            val x1 = (-b + Math.sqrt(d)) / (2 * a)
            val x2 = (-b - Math.sqrt(d)) / (2 * a)
            println("x1 = $x1 | x2 = $x2")
        } else {
            println("Nao ha raizes reais")
        }
    }
}

fun algoritmo138() {
    println("--{ALGORITMO 138}--")
    print("digite numero do mes (1 a 12): ")
    val mes = readln().toInt()
    val nomeMes = when (mes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Marco"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mes invalido"
    }
    println(nomeMes)
}

fun algoritmo139() {
    println("--{ALGORITMO 139}--")
    print("digite nome do municipio: ")
    val nome = readln()
    print("digite quantidade de eleitores aptos: ")
    val eleitores = readln().toInt()
    print("digite numero de votos do candidato mais votado: ")
    val votos = readln().toInt()
    if (eleitores > 20000 && votos <= eleitores / 2) {
        println("$nome tera segundo turno")
    } else {
        println("$nome nao tera segundo turno")
    }
}

fun algoritmo140() {
    println("--{ALGORITMO 140}--")
    print("digite nome: ")
    val nome = readln()
    print("digite valor da conta: ")
    val conta = readln().toDouble()
    val letra = nome.first().uppercase()
    if (letra == "A" || letra == "D" || letra == "M" || letra == "S") {
        println("Valor a pagar com desconto: ${conta * 0.70}")
    } else {
        println("Que pena. Nesta semana o desconto nao e para seu nome; mas continue nos prestigiando que sua vez chegara")
    }
}

fun algoritmo141() {
    println("--{ALGORITMO 141}--")
    print("digite nome 1: ")
    val n1 = readln()
    print("digite pontos 1: ")
    val p1 = readln().toInt()
    print("digite nome 2: ")
    val n2 = readln()
    print("digite pontos 2: ")
    val p2 = readln().toInt()
    print("digite nome 3: ")
    val n3 = readln()
    print("digite pontos 3: ")
    val p3 = readln().toInt()

    val lista = listOf(Pair(n1, p1), Pair(n2, p2), Pair(n3, p3)).sortedByDescending { it.second }
    println("Vencedor: ${lista[0].first} (${lista[0].second} pts)")
    println("Segundo: ${lista[1].first} (${lista[1].second} pts)")
    println("Terceiro: ${lista[2].first} (${lista[2].second} pts)")
}

fun algoritmo142() {
    println("--{ALGORITMO 142}--")
    print("digite pontos jogador 1: ")
    var p1 = readln().toInt()
    print("digite pontos jogador 2: ")
    var p2 = readln().toInt()
    print("digite pontos jogador 3: ")
    var p3 = readln().toInt()
    var aux: Int
    if (p1 > p2) { aux = p1; p1 = p2; p2 = aux }
    if (p1 > p3) { aux = p1; p1 = p3; p3 = aux }
    if (p2 > p3) { aux = p2; p2 = p3; p3 = aux }
    println("$p1 $p2 $p3")
    val soma = p1 + p2 + p3
    if (soma > 100) {
        println("media: ${soma / 3.0}")
    } else {
        println("Equipe desclassificada")
    }
}

fun algoritmo143() {
    println("--{ALGORITMO 143}--")
    print("digite palavra: ")
    val pal = readln()
    val tam = pal.length
    if (tam % 2 != 0) {
        val meio = pal[tam / 2].lowercase()
        if (meio == "a" || meio == "e" || meio == "i" || meio == "o" || meio == "u") {
            println("e vogal: $meio")
        } else {
            println("nao e vogal: $meio")
        }
    } else {
        println("numero de caracteres par")
    }
}

fun algoritmo144() {
    println("--{ALGORITMO 144}--")
    print("digite saldo medio: ")
    val saldo = readln().toDouble()
    val credito = when {
        saldo <= 500.0 -> 0.0
        saldo <= 1000.0 -> saldo * 0.30
        saldo <= 3000.0 -> saldo * 0.40
        else -> saldo * 0.50
    }
    println("Como seu saldo era de $saldo, seu credito sera de $credito")
}

fun algoritmo145() {
    println("--{ALGORITMO 145}--")
    print("digite nome do livro: ")
    val livro = readln()
    print("digite tipo de usuario (professor / aluno): ")
    val tipo = readln().lowercase()
    println("Nome do livro: $livro")
    println("Tipo de usuario: $tipo")
    if (tipo == "professor") {
        println("Total de dias: 10")
    } else if (tipo == "aluno") {
        println("Total de dias: 3")
    } else {
        println("Tipo de usuario invalido")
    }
}

fun algoritmo146() {
    println("--{ALGORITMO 146}--")
    print("digite percurso em quilometros: ")
    val percurso = readln().toDouble()
    print("digite tipo do carro (A / B / C): ")
    val tipo = readln().uppercase()
    val consumo = when (tipo) {
        "C" -> percurso / 12.0
        "B" -> percurso / 9.0
        "A" -> percurso / 8.0
        else -> -1.0
    }
    if (consumo >= 0) println("Consumo estimado em litros: $consumo") else println("Modelo inexistente")
}

fun algoritmo147() {
    println("--{ALGORITMO 147}--")
    print("Prato (1-Vegetariano 2-Peixe 3-Frango 4-Carne): ")
    val prato = readln().toInt()
    print("Sobremesa (1-Abacaxi 2-Sorvete diet 3-Mouse diet 4-Mouse chocolate): ")
    val sob = readln().toInt()
    print("Bebida (1-Cha 2-Suco laranja 3-Suco melao 4-Refrigerante diet): ")
    val beb = readln().toInt()

    var cal = 0
    cal += when (prato) { 1 -> 180; 2 -> 230; 3 -> 250; 4 -> 350; else -> 0 }
    cal += when (sob) { 1 -> 75; 2 -> 110; 3 -> 170; 4 -> 200; else -> 0 }
    cal += when (beb) { 1 -> 20; 2 -> 70; 3 -> 100; 4 -> 65; else -> 0 }
    println("Total de calorias: $cal")
}

fun algoritmo148() {
    println("--{ALGORITMO 148}--")
    println("Regiao: 1-Norte | 2-Nordeste | 3-Centro-Oeste | 4-Sul")
    print("Digite codigo da regiao: ")
    val reg = readln().toInt()
    print("Digite 1-Ida ou 2-Ida e Volta: ")
    val tipo = readln().toInt()
    val valor = when (reg) {
        1 -> if (tipo == 1) 500.0 else 900.0
        2 -> if (tipo == 1) 350.0 else 650.0
        3 -> if (tipo == 1) 350.0 else 600.0
        4 -> if (tipo == 1) 300.0 else 550.0
        else -> -1.0
    }
    if (valor >= 0) println("Valor da passagem: R$ $valor") else println("Regiao inexistente")
}

fun algoritmo149() {
    println("--{ALGORITMO 149}--")
    print("digite nome do produto: ")
    val nome = readln()
    print("digite valor de compra: ")
    val compra = readln().toDouble()
    val venda = when {
        compra < 10.0 -> compra * 1.70
        compra < 30.0 -> compra * 1.50
        compra < 50.0 -> compra * 1.40
        else -> compra * 1.30
    }
    println("Produto: $nome | Valor de venda: R$ $venda")
}

fun algoritmo150() {
    println("--{ALGORITMO 150}--")
    print("digite angulo em graus: ")
    val ang = readln().toDouble()
    val rang = ang * Math.PI / 180.0
    if ((rang > Math.PI / 2 && rang <= Math.PI) || (rang > 3 * Math.PI / 2 && rang <= 2 * Math.PI)) {
        println("seno: ${Math.sin(rang)}")
    } else {
        println("co-seno: ${Math.cos(rang)}")
    }
}

fun algoritmo151() {
    println("--{ALGORITMO 151}--")
    print("digite peso (kg): ")
    val peso = readln().toDouble()
    print("digite altura (m): ")
    val altura = readln().toDouble()
    val imc = peso / (altura * altura)
    when {
        imc < 20.0 -> println("abaixo do peso")
        imc <= 25.0 -> println("normal")
        imc <= 30.0 -> println("excesso de peso")
        imc <= 35.0 -> println("obesidade")
        else -> println("obesidade morbida")
    }
}

fun algoritmo152() {
    println("--{ALGORITMO 152}--")
    print("digite idade: ")
    val idade = readln().toInt()
    print("digite peso: ")
    val peso = readln().toDouble()
    val mg = if (idade >= 12) {
        if (peso >= 60.0) 1000 else 875
    } else {
        when {
            peso <= 9.0 -> 125
            peso <= 16.0 -> 250
            peso <= 24.0 -> 375
            peso <= 30.0 -> 500
            else -> 750
        }
    }
    val gotas = (mg / 500.0) * 20
    println("Tomar ${gotas.toInt()} gotas")
}

fun algoritmo153() {
    println("--{ALGORITMO 153}--")
    print("digite indice de poluicao: ")
    val indice = readln().toDouble()
    when {
        indice >= 0.5 -> println("suspender atividades de todos os grupos")
        indice >= 0.4 -> println("suspender atividades grupos 1 e 2")
        indice >= 0.3 -> println("suspender atividades grupo 1")
        else -> println("indice de poluicao aceitavel")
    }
}

fun algoritmo154() {
    println("--{ALGORITMO 154}--")
    print("digite placa do carro (ex: ABC1234): ")
    val placa = readln()
    val ultimo = placa.last()
    val mes = when (ultimo) {
        '1' -> "Janeiro"
        '2' -> "Fevereiro"
        '3' -> "Marco"
        '4' -> "Abril"
        '5' -> "Maio"
        '6' -> "Junho"
        '7' -> "Julho"
        '8' -> "Agosto"
        '9' -> "Setembro"
        '0' -> "Outubro"
        else -> "Placa invalida"
    }
    println("Mes de emplacamento: $mes")
}

fun algoritmo155() {
    println("--{ALGORITMO 155}--")
    print("digite palavra: ")
    val pal = readln()
    val letra = pal.first().uppercase()
    if (letra == "L" || letra == "D") {
        println("${pal.take(2)}${pal.last()}")
    } else {
        println(pal.drop(1))
    }
}

fun algoritmo156() {
    println("--{ALGORITMO 156}--")
    print("digite dia: ")
    val dia = readln().toInt()
    print("digite mes: ")
    val mes = readln().toInt()
    print("digite ano: ")
    val ano = readln().toInt()

    var valida = false
    if (ano >= 1 && mes in 1..12) {
        val maxDias = when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) 29 else 28
            else -> 0
        }
        if (dia in 1..maxDias) valida = true
    }
    if (valida) println("Data valida") else println("Data invalida")
}

fun algoritmo157() {
    println("--{ALGORITMO 157}--")
    print("digite data no formato ddmmaaaa: ")
    val data = readln().toInt()
    val dia = data / 1000000
    val mes = (data % 1000000) / 10000
    val ano = data % 10000

    var valida = false
    if (ano >= 1 && mes in 1..12) {
        val maxDias = when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) 29 else 28
            else -> 0
        }
        if (dia in 1..maxDias) valida = true
    }
    if (valida) println("Data valida") else println("Data invalida")
}

fun algoritmo158() {
    println("--{ALGORITMO 158}--")
    print("digite valor de x: ")
    val x = readln().toDouble()
    if (x != 2.0) {
        println("f(x) = ${8.0 / (2.0 - x)}")
    } else {
        println("nao pode ser feita divisao por zero")
    }
}

fun algoritmo159() {
    println("--{ALGORITMO 159}--")
    print("digite valor de x: ")
    val x = readln().toDouble()
    if (x > 4.0 || x < -4.0) {
        val fx = (5 * x + 3) / Math.sqrt((x * x) - 16)
        println("f(x) = $fx")
    } else {
        println("nao pode ser feita")
    }
}

fun algoritmo160() {
    println("--{ALGORITMO 160}--")
    print("digite valor de x: ")
    val x = readln().toDouble()
    val y = when {
        x <= 1.0 -> 1.0
        x <= 2.0 -> 2.0
        x <= 3.0 -> x * x
        else -> x * x * x
    }
    println("valor de f(x): $y")
}


