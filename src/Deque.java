/**
 * A Deque (prounounced "deck") is a Double Ended Queue (DEQue).
 * Items can be added to the front or back of the deque, but not in the middle.
 * No iterator is provided to access items in the middle of the queue.
 * @param <ItemType> type of the items to be stored in the deque
 */
public interface Deque<ItemType> {
    /**
     * Return the number of items in the deque
     * @return number of items in the deque
     */
    public int size();

    /**
     * Adds an item to the front of the deque.
     * @param item item to be added
     */
    public void addFirst(ItemType item);

    /**
     * Adds an item to the back of the deque.
     * @param item item to be added
     */
    public void addLast(ItemType item);

    /**
     * Remove and return the item from the front, does nothing if empty.
     * @return item at the front that was just removed, or null if empty
     */
    public ItemType removeFirst();

    /**
     * Remove and return the item from the back, does nothing if empty.
     * @return item at the back that was just removed, or null if empty
     */
    public ItemType removeLast();
}
