package basics.loop

fun main() {

    /**
     *  Eger bir donguye ihtiyacimiz varsa ve bu dongu sırasında if-else ile bir sartli duruma ihtiyacimiz varsa
     *  bu durumda for + if else kullanmak yerine 'while' kullanabiliriz.
     */
    // eger bir kodda for-if görüyorsak onu while'a cevirebiliriz.

    var number = 0

    while (number < 5) {
        print("${number++} ")
    }

    println()

    while (number < 5) {
        print("$number , ")
        number++
    }

    println("------- Alttaki kod ile yukarıda ki kod aynidir. ----------")

    for (value in 0..110) {
        if (value < 5) {
            print("$value , ")
        } else {
            break
        }
    }


    // for donguleri var ken while dongulerine neden ihtiyac var; for-if kullaniyorsak while kullanabiliriz bunun icin var.


}