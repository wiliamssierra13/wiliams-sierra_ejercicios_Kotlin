fun main(args: Array<String>) {
    /*1._ Hacer un programa que llene un arreglo de 10 enteros y deberá elevar al cuadrado cada elemento del arreglo.
        val MyArregloNumerico:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)

        for(inde in MyArregloNumerico.indices){
            print("El número ${MyArregloNumerico[inde]} su cuadrado es: ")
            MyArregloNumerico[inde] = MyArregloNumerico[inde] * MyArregloNumerico[inde]
            println("${MyArregloNumerico[inde]}")
        }*/

    /*2._ Hacer un programa que pida un número entre 1 y 9999 y nos diga cuantas unidades de millar, centenas, decenas
        // y unidades tiene.
    var num: Int
    print("Digita un número del 1 al 9999:")
    num = readLine()!!.toInt()

    if(num >=1 && num <= 9999){
        var unidad: Int = num/1
        var decena:Int = num/10
        var centena:Int = num/100
        var millar:Int = num/1000

        println("El número tiene la cantidad de unidad: $unidad")
        println("El número tiene la cantidad de decena: $decena")
        println("El número tiene la cantidad de centena: $centena")
        println("El número tiene la cantidad de millar: $millar")
    }else{
        println("El número digitado no esta en el rango")
    }*/

    /*3._Hacer un programa que pida un número en decimal y nos devuelva su equivalente en binario, octal y hexadecimal.

    var num:Int
    print("Digite un número: ")
    num = readLine()!!.toInt()

    val binary :String = Integer.toBinaryString(num)
    val octal : String = Integer.toOctalString(num)
    val hexa : String = Integer.toHexString(num)

    println("Equivalente a : $binary")
    println("Equivalente a : $octal")
    println("Equivalente a : $hexa")*/

    /*4._ Hacer un programa que pida una cadena y nos diga si es palíndromo o no. Una cadena es palíndroma cuando al
        // leerse de izquierda a derecha es igual a leerla de derecha a izquierda. Por ejemplo: ANITA LAVA LA TINA.

    var (igual, aux) = Pair(0, 0)
    var texto: String
    print("Ingrese la palabra que desea evaluar: ")
    texto = readLine() as String
    for (ind in texto.length - 1 downTo 0) {
        when { texto[ind] == texto[aux] -> igual++ }
        aux++
    }
    when (igual) {
        texto.length -> println("$texto es un palindromo")
        else -> println("$texto no es un palindromo")
    }*/

    /* 5._ Hacer un programa que pida el valor de los lados de un triangulo y nos diga que tipo de triangulo es.

    println("Ingrese los tres lados del triagulo:")
    print("Ingrese el primer lado: ")
    var lad1 = readLine()!!.toInt()
    print("Ingrese el segundo lado: ")
    var lad2 = readLine()!!.toInt()
    print("Ingrese el tercer lado: ")
    var lad3 = readLine()!!.toInt()

    if(lad1 == lad2 && lad2 == lad3){
        println("El triángulo es equilátero")
    }else if(lad1 == lad2 && lad2 != lad3){
        println("El triángulo es isosceles")
    }else if(lad1 == lad3 && lad3 != lad2 || lad2 == lad3 && lad3 != lad1){
        println("El triángulo es isosceles")
    } else{
        println("El triángulo es escaleno")
    }*/

    /* 6._ Hacer un programa que mediante funciones permita calcular el factorial de un número.

    print("Ingrese un número: ")
    var num = readLine()!!.toInt()

    for (i in num-1 downTo 1){
        num = num * i
    }
    print("El factorial es: $num")*/

    /*7._ Hacer un programa que llene un arreglo de cadenas de caracteres y lo imprima en el orden de la cadena más corta a la más grande.

    val arr = arrayOf("Hola","Helado","Cacahuate","Orca","Oz","Archipielago")
    arr.sortWith(Comparator.reverseOrder())
    println(arr.contentToString())*/

    /*8._ Hacer un programa que permita contar cuantas vocales tiene una cadena de caracteres. El programa deberá decir cuantas vocales son en total, así como cuantas hay por cada una de ellas.

    print("Ingrese una palabra: ")
    val frase = readLine().toString()
    var vocal_A = 0
    var vocal_E = 0
    var vocal_I = 0
    var vocal_O = 0
    var vocal_U = 0
    var vocales = 0

    for (i in 0..frase.length - 1) {
        val ch = frase[i]
        when (ch) {
            'A','a' -> ++vocal_A
            'E','e' -> ++vocal_E
            'I','i' -> ++vocal_I
            'O','o' -> ++vocal_O
            'U','u' -> ++vocal_U
        }
    }
    vocales = vocal_A + vocal_E + vocal_I + vocal_O + vocal_U
    println("Total de vocales: $vocales")
    if (vocal_A>0){
        println("La cantidad de vocales a: $vocal_A")
    }

    if (vocal_E>0){
        println("La cantidad de vocales e: $vocal_E")
    }

    if (vocal_I>0){
        println("La cantidad de vocales i: $vocal_I")
    }

    if (vocal_O>0){
        println("La cantidad de vocales o: $vocal_O")
    }

    if (vocal_U>0){
        println("La cantidad de vocales u: $vocal_U")
    }*/

}