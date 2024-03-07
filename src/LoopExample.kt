
/**
fun main() {
    val treeHeight = 10 // Ağacın yüksekliği

    // Ağacın gövdesini oluştur
    for (i in 1..treeHeight) {
        print(" ".repeat(treeHeight - i)) // Boşlukları ekle
        print("*".repeat(i * 2 - 1)) // Yıldızları ekle
        println() // Satırı değiştir
    }

    // Ağacın gövdesi altındaki kısmı oluştur
    for (i in 1..2) {
        print(" ".repeat(treeHeight - 1))
        println("*")
    }
}
 */

fun main() {
    val treeHeight = 10 // Ağacın yüksekliği

    // Ağacın gövdesini oluştur
    for (i in 1..treeHeight) {
        // Boşlukları eklemek için bir döngü
        for (j in 1..treeHeight - i) {
            print(" ") // Her bir boşluk karakterini yazdır
        }
        // Yıldızları eklemek için bir döngü
        for (k in 1..i * 2 - 1) {
            print("*") // Her bir yıldız karakterini yazdır
        }
        println() // Her satırın sonunda satırı değiştir
    }

    // Ağacın gövdesinin altındaki kısmı oluştur
    for (i in 1..2) {
        // Boşlukları eklemek için bir döngü
        for (j in 1..treeHeight - 1) {
            print(" ") // Her bir boşluk karakterini yazdır
        }
        println("*") // Alt kısımdaki yıldızı yazdır ve satırı değiştir
    }
}


