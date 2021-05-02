import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class RemoveNthNodeFromEndTest() {
  
  lateinit var problem: RemoveNthNodeFromEnd
  
  @BeforeEach
  fun setUp() {
    problem = RemoveNthNodeFromEnd()
  }
  
  @Test
  fun testCases() {
    assertTrue(ListNode.createListNode("1235")
                 ?.equals(
                   problem.removeNthFromEnd(ListNode.createListNode("12345"), 2))
               ?: false)
    assertFalse(ListNode.createListNode("12")
                  ?.equals(
                    problem.removeNthFromEnd(ListNode.createListNode("123"), 2))
                ?: false)
    assertTrue(ListNode.createListNode("13")
                 ?.equals(
                   problem.removeNthFromEnd(ListNode.createListNode("123"), 2))
               ?: false)
    assertTrue(ListNode.createListNode("12")
                 ?.equals(
                   problem.removeNthFromEnd(ListNode.createListNode("123"), 1))
               ?: false)
    assertTrue(ListNode.createListNode("1")
                 ?.equals(
                   problem.removeNthFromEnd(ListNode.createListNode("12"), 1))
               ?: false)
    assertTrue(ListNode.createListNode("2")
                 ?.equals(
                   problem.removeNthFromEnd(ListNode.createListNode("12"), 2))
               ?: false)
    assertTrue(problem.removeNthFromEnd(ListNode.createListNode("5"), 1) == ListNode.createListNode(""))
  }
  
  @Test
  fun testNthFromLast() {
    assertEquals(true, problem.checkIfCurrentIsNthNodeFromLast(
      ListNode.createListNode(arrayOf(1, 2, 3, 4, 5)), 5))
    assertEquals(true, problem.checkIfCurrentIsNthNodeFromLast(
      ListNode.createListNode(arrayOf(1, 5)), 2))
    assertEquals(true, problem.checkIfCurrentIsNthNodeFromLast(
      ListNode.createListNode(arrayOf(1)), 1))
    assertEquals(true, problem.checkIfCurrentIsNthNodeFromLast(
      ListNode.createListNode(arrayOf(1, 2, 3, 4, 5, 9, 10)), 7))
  }
}
