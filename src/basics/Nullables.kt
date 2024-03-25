package basics

fun main() {

    /**
     *  Null -> Değişkenin veya nesnenin bellekte bulunmaması olayıdır. Eğer bir değişken null ise Kotlin NullPointerException hatası fırlatır.
     *  Bu hatayı engellemek amacıyla Null Safety özelliğini kullanmıştır
     *  Değişkenlerin null olabilmesine izin vermek istiyorsak değişken tipini belirttirken sonra “?” işareti koyarız. (bir değişkenin null değer alabileceğini belirtmek için kullanırız.)
     *
     * */

    /**
    var a: String = "abc" // varsayılan olarak null olmayan anlamına gelir
    a = null // derleme hatası
    */

    var b: String? = "abc" // null olarak ayarlanabilir
    b = null // ok
    print(b)


    /**
     *  Eger bir degiskene tip verilmez ve direk null deger atamasi yapilirsa,IDE tip cikarimi yaparken
     *  o degiskenin degerini Nothing? olarak isaretler.Cunku hangi tipe karsilik geldigini bilemez.
     * */
    val number = null // Nothing?



    /**
     *  Elvis operator: ?:
     *  Elvis operaörü atanmak istenen değer null olduğunda onun yerine default bir değer atmak için kullanılır.
     *
     *  val name = nullableName ?: "Guest"
     *  Elvis operatörü iki değer alır eğer ilk değer null değilse ilkini null ise de aldığı ikinci değeri geriye döndürür.(return)
     *
     * */

    /**
     *  Not null assertion : !! Operator
     *  Bu operatör null olabilen bir değişkenin null kontrolü yapılmadan çağrılmasını sağlar. Hatalı kullanımda NullPointerException hatası almamız olasıdır.
     *
     *
     * */
    val nullableName: String? = null
    nullableName!!.uppercase() // Çalışma zamanında
    //NullPointerException Hatası döndürür.
}