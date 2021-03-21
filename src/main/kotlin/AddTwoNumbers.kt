import java.math.BigInteger

/**
 * Created by Muzammil on 3/9/21.
 */

class ListNode(var `val`: Int) {
  var next: ListNode? = null
}

class AddTwoNumbers {
  fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val l1Val = computeNumber(l1)
    val l2Val = computeNumber(l2)
    val sum = l1Val + l2Val
    return createListNode(sum.toString().reversed())
  }
  
  fun createListNode(reversed: String): ListNode? {
    val numberAsAnArray = reversed.toCharArray().map { it.toString() }.toTypedArray()
    var node = ListNode(numberAsAnArray[0].toInt())
    var rootNode = node
    numberAsAnArray.slice(1 until numberAsAnArray.size).forEach { c ->
      val newNode = ListNode(c.toInt())
      node.next = newNode;
      node = newNode
    }
    return rootNode
  }
  
  fun computeNumber(ln: ListNode?): BigInteger {
    var copiedLn = ln
    var num = ""
    while (copiedLn != null) {
      num += copiedLn.`val`
      copiedLn = copiedLn.next
    }
    return num.reversed().toBigInteger()
  }
}
