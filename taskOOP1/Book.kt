class Book(
    var title:String,
    var author:String,
    var publicationYear:Int,
    var isCheckedOut:Boolean
):LibraryItem {

    init{
        isCheckedOut = false
    }

    override fun checkOut(): Boolean {
        if (!isCheckedOut) {
            isCheckedOut = true
        }
        return isCheckedOut
    }

    override fun returnItem(): Boolean {
        if (isCheckedOut) {
            isCheckedOut = false
            return true
        }
        return false
    }

    override fun isAvailable(): Boolean {
        return !isCheckedOut
    }
}