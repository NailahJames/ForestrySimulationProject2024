package week7and8;
//============================================================================================
class Kindle {
//============================================================================================
//--------------------------------------------------------------------------------------------
//----private ints data items for currentPages and totalPages in order to keep them form being changed.
    private int currentPage;
    private int totalPages;
//----"Kindle" constructor to receive number of pages in the book. Needs a "this." to stop from switching private ints
    public Kindle(int totalNumberOfPages) {
        this.totalPages = totalNumberOfPages;
        this.currentPage = 1;
    }
//----turnPages
    public void turnPages() {
        turnPages(1);
    }

    public void turnPages(int pages) { //setter method
        int newPage;
        newPage = currentPage + pages;
        if (newPage > totalPages) {
            System.out.println("Turning " + pages + " pages would take you past the last page.");
            System.out.println("You are now on page " + totalPages + " of " + totalPages + ".");
        } else {
            currentPage = newPage;
            System.out.println("You are now on page " + currentPage + " of " + totalPages + ".");
        }
    }

    @Override
    public String toString() {
        return "Page " + currentPage + " of " + totalPages + ".";
    }
}//end of Kindle class
//=================================================================================================

