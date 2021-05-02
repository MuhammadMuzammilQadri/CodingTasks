import java.math.BigInteger

class AddTwoNumbers {
  fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val l1Val = computeNumber(l1)
    val l2Val = computeNumber(l2)
    val sum = l1Val + l2Val
    return ListNode.createListNode(sum.toString().reversed())
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
