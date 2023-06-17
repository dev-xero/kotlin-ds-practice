package datastructures

private class Node<T>(val item: T) {
    var next: Node<T>? = null
}

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun addNode(item: T) {
        val newNode = Node(item)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }

        size += 1
    }

    fun removeNode(): T? {
        if (head != null) {
            val oldLastItem = tail?.item
            tail?.next = null
            size -= 1

            return oldLastItem
        }

        return null
    }

    fun getSize(): Int {
        return size
    }

    fun iterateList(): Boolean {
        var curr = head

        while (curr != null) {
            println(curr.item)
            curr = curr.next
        }

        return true
    }
}