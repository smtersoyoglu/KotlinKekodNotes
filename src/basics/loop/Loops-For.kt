package basics.loop


fun main() {
    /**
     *  3 farklı şekilde for tanımlayabiliriz
     *  value in list                           şeklinde value değerlerini alabiliriz.
     *  index in list.indices                   şeklinde index değelerini alabiliriz.
     *  (index, value) in list.withIndex()      şeklinde index,value değelerini alabiliriz.
     * **/

    /**
     *      repeat(size) şeklinde herhangi bir listeye ihtiyaç duymadan tekrarlayan işşlemler yapabiliriz.
     **/

    repeat(10) {
        print("\nDaha çok blog yazmam lazım!")
    }

    // continue da belirtilen sayıya geldiğinde o sayıyı atlar devam eder, break de direk döngüden çıkar belirtilen sayıya kadar yazar ve break olduğunda direk çıkıp döngüye devam etmez.

    // iç içe for döngülerinde continue kullanıp en başta ki for döngüsüne dönmek istiyorsak returnLabel@ kullanırız.

    returnLabel@for (value in 1 .. 50) {
        for (value2 in 0 .. 10) {
            if (value2  == 5) {
                continue@returnLabel
            }

            print("continue2 : $value2")
        }
    }


    /** *********************   while   ***************************************/

    var number = 0

    while (number < 5) {
        //   print("${number++} , ") bu ve alttaki gibi döngüde sayıyı arttırmalıyız yoksa sonsuz bir döngü olur.
        print("$number , ")
        number++
    }

    /**  Eğer kodumuzu yazarken for if görüyorsak kodun içerisinde onu while a çevirebiliriz. (while bu işlem için var for if varsa while kullanırız.)  **/


    for (value in 0 .. 50) {
        if (value % 2 == 1) {
            break
        }
        print("\n$value")
    }
    // for if yerine while ile de aynı işlemi yapabiliriz


    var number1 = 0
    while (number1 % 2 == 0) {
        print("\n${number1++}")
    }
















}

