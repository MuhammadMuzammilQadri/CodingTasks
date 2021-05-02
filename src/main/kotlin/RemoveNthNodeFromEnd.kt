class RemoveNthNodeFromEnd {
  fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var current = head
    var previous: ListNode? = null
    while (current !== null) {
      if (checkIfCurrentIsNthNodeFromLast(current, n)) {
        if (previous != null) {
          removeCurrentNode(previous, current)
        } else if (current.next != null) {
          return current.next
        }else {
          return null
        }
        break
      }
      previous = current
      current = current.next
    }
    
    return head
  }
  
  private fun removeCurrentNode(previous: ListNode, current: ListNode) {
    previous.next = current.next
  }
  
  fun checkIfCurrentIsNthNodeFromLast(node: ListNode?, n: Int): Boolean {
    var nthFromLast = n
    var currentNode = node
    while (currentNode?.next !== null) {
      nthFromLast--
      if (nthFromLast < 1) {
        return false
      }
      currentNode = currentNode.next
    }
    return nthFromLast == 1
  }
}
