package datastructures

class Node<T>(val item: T) {
    var next: Node<T>? = null

    fun setNextNode(item: Node<T>) {
        next = item
    }
}

class LinkedList<T> {

}