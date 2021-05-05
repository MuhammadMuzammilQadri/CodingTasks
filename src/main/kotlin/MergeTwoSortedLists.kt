class MergeTwoSortedLists {
  lateinit var mergedList: ListNode
  lateinit var mergedListCounter: ListNode
  fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1Counter = l1
    var l2Counter = l2
    
    if (l1Counter == null) return l2Counter
    if (l2Counter == null) return l1Counter
    
    while (true) {
      var nextNode: ListNode
      if (l1Counter!!.`val` < l2Counter!!.`val`) {
        nextNode = l1Counter
        l1Counter = l1Counter.next
      } else {
        nextNode = l2Counter
        l2Counter = l2Counter.next
      }
      
      if (::mergedList.isInitialized) {
        mergedListCounter.next = ListNode(nextNode.`val`)
        mergedListCounter = mergedListCounter.next!!
      } else {
        mergedList = ListNode(nextNode.`val`)
        mergedListCounter = mergedList
      }
      
      if (l1Counter == null && l2Counter != null) {
        mergedListCounter.next = l2Counter
        return mergedList
      }
  
      if (l2Counter == null && l1Counter != null) {
        mergedListCounter.next = l1Counter
        return mergedList
      }
  
      if (l2Counter == null && l1Counter == null) {
        return mergedList
      }
    }
  }
}
