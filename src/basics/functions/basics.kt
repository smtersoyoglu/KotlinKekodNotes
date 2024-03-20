package basics.functions

/**
 * Fonksiyon cagirilirken ismi ve parametreleri kullanilir.
 * Eger bir geri donusu varsa bir degiskene aktarilir.
 */

/**
 * Bir classin fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
 */


// Basit bir toplama fonksiyonu
fun topla(a: Int, b: Int): Int {
    return a + b
}

// Parametre olarak varsayılan değerler atanmış bir fonksiyon
fun carp(a: Int, b: Int = 1): Int {
    return a * b
}

// Tek satırlık bir fonksiyon için kısaltılmış yazım (single-expression function)
fun kareAl(sayi: Int) = sayi * sayi

fun main() {
    val toplam = topla(5, 3)
    println("Toplam: $toplam") // Output: Toplam: 8

    val carpim = carp(4)
    println("Çarpım: $carpim") // Output: Çarpım: 4 (1 ile çarpıldı)

    val kare = kareAl(6)
    println("Karesi: $kare") // Output: Karesi: 36


    val result = double(6)
    println("double Fonksiyon işlemi : $result")
}

fun double(x: Int): Int {
    return 2 * x
}