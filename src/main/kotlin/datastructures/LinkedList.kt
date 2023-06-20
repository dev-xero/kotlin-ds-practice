package datastructures

class Node<T>(val item: T) {
    var next: Node<T>? = null

    fun setNextNode(item: Node<T>) {
        next = item
    }
}

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var listSize: Int = 0

    val size: Int
        get() = listSize

    val headNode: Node<T>?
        get() = head

    val tailNode: Node<T>?
        get() = tail


    fun addToHead(item: T): Node<T> {
        val newHead: Node<T> = Node(item)
        val currentHead: Node<T>? = head

        if (currentHead == null) {
            head = newHead
            tail = newHead

            return newHead
        }

        newHead.setNextNode(currentHead)
        head = newHead
        return newHead
    }
}