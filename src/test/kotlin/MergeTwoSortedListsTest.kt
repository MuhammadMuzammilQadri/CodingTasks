import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MergeTwoSortedListsTest() {
  
  lateinit var problem: MergeTwoSortedLists
  
  @BeforeEach
  fun setUp() {
    problem = MergeTwoSortedLists()
  }
  
  @Test
  fun testCases() {
    
    assertEquals(ListNode.createListNode(arrayOf(1, 2, 3, 4, 5)).toString(),
                 problem.mergeTwoLists(
                   ListNode.createListNode(arrayOf(1, 2, 3)),
                   ListNode.createListNode(arrayOf(4, 5))).toString())
    assertEquals(ListNode.createListNode(arrayOf(1, 1, 2, 3, 4)).toString(),
                 problem.mergeTwoLists(
                   ListNode.createListNode(arrayOf(1, 2, 4)),
                   ListNode.createListNode(arrayOf(1, 3, 4))).toString())
    assertEquals(ListNode.createListNode(arrayOf()).toString(),
                 problem.mergeTwoLists(
                   ListNode.createListNode(arrayOf()),
                   ListNode.createListNode(arrayOf())).toString())
    assertEquals(ListNode.createListNode(arrayOf(0)).toString(),
                 problem.mergeTwoLists(
                   ListNode.createListNode(arrayOf()),
                   ListNode.createListNode(arrayOf(0))).toString())
  }
}
