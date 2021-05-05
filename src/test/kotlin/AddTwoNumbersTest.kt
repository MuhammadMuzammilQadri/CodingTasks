import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigInteger

/**
 * Created by Muzammil on 3/9/21.
 */
internal class AddTwoNumbersTest {
  
  lateinit var problem: AddTwoNumbers
  
  @BeforeEach
  fun setUp() {
    problem = AddTwoNumbers()
  }
  
  @Test
  fun createValidListNode() {
    val ln = ListNode.createListNode("123")
    assertEquals(1, ln?.`val`)
    assertEquals(2, ln?.next?.`val`)
    assertEquals(3, ln?.next?.next?.`val`)
  }
  
  @Test
  fun computeNumberFromListNode() {
    assertEquals(BigInteger.valueOf(321), problem.computeNumber(ListNode.createListNode("123")))
    assertEquals(BigInteger.valueOf(106), problem.computeNumber(ListNode.createListNode("601")))
    assertEquals(BigInteger.valueOf(900), problem.computeNumber(ListNode.createListNode("009")))
    assertEquals(BigInteger.valueOf(70), problem.computeNumber(ListNode.createListNode("07")))
  }
  
  @Test
  fun addTwoLists() {
    assertEquals(problem.computeNumber(ListNode.createListNode("579")),
                 problem.computeNumber(
                   problem.addTwoNumbers(ListNode.createListNode("123"),
                                         ListNode.createListNode("456"))))
    
    
    assertEquals(problem.computeNumber(ListNode.createListNode("6640000000000000000000000000001")),
                 problem.computeNumber(
                   problem.addTwoNumbers(ListNode.createListNode("1000000000000000000000000000001"),
                                         ListNode.createListNode("564"))))
  }
}
