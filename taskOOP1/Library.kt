class Library {
    val books : MutableList<Book> = mutableListOf()

    fun addBook(book :Book){
        books.add(book)
    }

    fun removeBook(book:Book){
        if (books.contains(book)) {
            books.remove(book)
        } else {
            println("${book.title} is not in the library.")
        }
    }

    fun checkOutBook(patron: Patron, book: Book): Boolean {
        if (book.isAvailable()) {
                if (book.checkOut()) {
                    patron.checkedOutBooks.add(book)
                    return true
                }
            }
        return false
    }

    fun returnBook(patron: Patron, book: Book): Boolean {
        if (patron.checkedOutBooks.contains(book)) {
            if (book.returnItem()) {
                patron.checkedOutBooks.remove(book)
                return true
            }
        }
        return false
    }
}