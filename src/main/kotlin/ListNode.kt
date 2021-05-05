import java.lang.StringBuilder

/**
 * Created by Muzammil on 3/9/21.
 */

class ListNode(var `val`: Int) {
  var next: ListNode? = null
  
  override fun equals(other: Any?): Boolean {
    if (other == null || other !is ListNode) {
      return false
    }
    
    var current: ListNode? = this
    var _other: ListNode? = other
    while (true) {
      if (current?.`val` != _other?.`val`) return false
      current = current?.next
      _other = _other?.next
      
      if (current == null && _other == null) return true
    }
  }
  
  override fun toString(): String {
    StringBuilder().let { sb ->
      var node: ListNode? = this
      while (node != null) {
        sb.append(node.`val`)
        node = node.next
        if (node != null) {
          sb.append(", ")
        }
      }
      return sb.toString()
    }
  }
  
  companion object {
    fun createListNode(nodeItemsAsString: String): ListNode? {
      if (nodeItemsAsString.trim().isEmpty()) {
        return null
      }
      val numberAsAnArray = nodeItemsAsString.toCharArray().map { it.toString() }.toTypedArray()
      var node = ListNode(numberAsAnArray[0].toInt())
      var rootNode = node
      numberAsAnArray.slice(1 until numberAsAnArray.size).forEach { c ->
        val newNode = ListNode(c.toInt())
        node.next = newNode;
        node = newNode
      }
      return rootNode
    }
    
    fun createListNode(nodeItems: Array<Int>): ListNode? {
      if (nodeItems.isEmpty()) {
        return null
      }
      var node = ListNode(nodeItems[0])
      var rootNode = node
      nodeItems.slice(1 until nodeItems.size).forEach { c ->
        val newNode = ListNode(c)
        node.next = newNode;
        node = newNode
      }
      return rootNode
    }
    
  }
}
