fun main(){
    val book1 = Book("Discrete Math", "rosen", 1988,false)
    val book2 = Book("c++ how to programme ", "paul", 1992,false)
    val book3 = Book("java how to programme", "mosh", 1990,false)

    val library = Library()

    val patron1 = Patron("karim")
    val patron2 = Patron("zkr")


    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    library.checkOutBook(patron1, book1)

    println("Book: ${book1.title}, Checked Out: ${book1.isCheckedOut}")

    library.checkOutBook(patron2, book1)

    library.returnBook(patron1, book1)

    println("Book: ${book1.title}, Checked Out: ${book1.isCheckedOut}")
}