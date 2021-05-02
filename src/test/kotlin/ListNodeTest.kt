import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 03-May-21.
 */
internal class ListNodeTest {
  
  @BeforeEach
  fun setUp() {
  }
  
  @Test
  fun testCases() {
    assertEquals(ListNode.createListNode("1235"),
                 ListNode.createListNode("1235"))
    assertEquals(ListNode.createListNode("125"),
                 ListNode.createListNode("125"))
    assertNotEquals(ListNode.createListNode("1255"),
                    ListNode.createListNode("125"))
    assertEquals(ListNode.createListNode("1"),
                 ListNode.createListNode("1"))
    assertEquals(ListNode.createListNode(""),
                 ListNode.createListNode(""))
    assertNotEquals(ListNode.createListNode(""),
                 ListNode.createListNode("3"))
  }
  
}
