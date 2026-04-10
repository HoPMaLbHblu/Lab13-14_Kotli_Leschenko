package library

fun filterByYear(books: List<Book>, year: Int): List<Book> {
    return books.filter { it.year == year }
}

fun sortByTitle(items: List<LibraryItem>): List<LibraryItem> {
    return items.sortedBy { item ->
        when (item) {
            is LibraryItem.BookItem -> item.book.title
            is LibraryItem.MagazineItem -> item.magazine.title
            is LibraryItem.DVDItem -> item.dvd.title
        }
    }
}

fun groupByAuthor(books: List<Book>): Map<String, List<Book>> {
    return books.groupBy { it.author }
}

fun calculateTotalDuration(dvds: List<DVD>): Int {
    return dvds.sumOf { it.duration }
}