package paginator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    List<I> collection;
    ArrayList<I>[] pages;
    int numberOfPages;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;

        //Creating an array of ArrayLists
        if (collection.size() % itemsPerPage == 0) {
            numberOfPages = collection.size()/itemsPerPage;
            pages = new ArrayList[numberOfPages];
        }   else {
            numberOfPages = collection.size()/itemsPerPage + 1;
            pages = new ArrayList[numberOfPages];
        }

        //Initializing them
        for (int i = 0; i < pages.length; i++) {
            pages[i] = new ArrayList<I>();
        }

        //Using iteraton and pagesIndex to iterate
        Iterator<I> it = collection.iterator();
        int pagesIndex = 0;
        while (it.hasNext()) {
            int count = itemsPerPage;
            while (count-- > 0 && it.hasNext()) {
                pages[pagesIndex].add(it.next());
            }
            pagesIndex++;
        }
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return numberOfPages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex > pages.length-1 || pageIndex < 0) {
            return -1;
        }

        return pages[pageIndex].size();
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        //Increasing value because it is zero based by default. Otherwise, calculation will be messy
        itemIndex++;

        if (itemIndex > collection.size() || itemIndex <= 0) {
            return -1;
        }

        if (itemIndex % (itemsPerPage) == 0) {
            return itemIndex/(itemsPerPage) - 1;
        }

        return itemIndex/(itemsPerPage);

    }
}
