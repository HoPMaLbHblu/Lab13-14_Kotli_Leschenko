package library

fun main() {
    println("=== БИБЛИОТЕЧНАЯ СИСТЕМА ===\n")

    val library = Library<LibraryItem>()

    val book1 = Book("Война и мир", "Лев Толстой", 1869, "978-5-17-123456-7")
    val book2 = Book("Анна Каренина", "Лев Толстой", 1877, "978-5-17-234567-8")
    val book3 = Book("Преступление и наказание", "Фёдор Достоевский", 1866, "978-5-17-345678-9")
    val book4 = Book("Идиот", "Фёдор Достоевский", 1869, "978-5-17-456789-0")
    val magazine1 = Magazine("Наука и жизнь", 750, "Январь")
    val magazine2 = Magazine("Вокруг света", 500, "Март")

    val dvd1 = DVD("Побег из Шоушенка", "Фрэнк Дарабонт", 142)
    val dvd2 = DVD("Крёстный отец", "Фрэнсис Форд Коппола", 175)

    library.add(LibraryItem.BookItem(book1))
    library.add(LibraryItem.BookItem(book2))
    library.add(LibraryItem.BookItem(book3))
    library.add(LibraryItem.BookItem(book4))
    library.add(LibraryItem.MagazineItem(magazine1))
    library.add(LibraryItem.MagazineItem(magazine2))
    library.add(LibraryItem.DVDItem(dvd1))
    library.add(LibraryItem.DVDItem(dvd2))

    println("Всего элементов в библиотеке: ${library.size()}")

    val allBooks = listOf(book1, book2, book3, book4)

    println("\n--- filterByYear (1869) ---")
    val books1869 = filterByYear(allBooks, 1869)
    books1869.forEach { println("${it.title} - ${it.year}") }

    println("\n--- groupByAuthor ---")
    val grouped = groupByAuthor(allBooks)
    grouped.forEach { (author, books) ->
        println("$author:")
        books.forEach { println("  - ${it.title}") }
    }

    println("\n--- sortByTitle ---")
    val sorted = sortByTitle(library.getAll())
    sorted.forEach { item ->
        when (item) {
            is LibraryItem.BookItem -> println("Книга: ${item.book.title}")
            is LibraryItem.MagazineItem -> println("Журнал: ${item.magazine.title}")
            is LibraryItem.DVDItem -> println("DVD: ${item.dvd.title}")
        }
    }

    println("\n--- calculateTotalDuration ---")
    val allDVDs = listOf(dvd1, dvd2)
    val totalDuration = calculateTotalDuration(allDVDs)
    println("Общая продолжительность DVD: $totalDuration минут")
}