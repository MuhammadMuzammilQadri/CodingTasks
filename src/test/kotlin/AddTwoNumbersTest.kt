import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

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
    val ln = problem.createListNode("123")
    assertEquals(1, ln?.`val`)
    assertEquals(2, ln?.next?.`val`)
    assertEquals(3, ln?.next?.next?.`val`)
  }
  
  @Test
  fun computeNumberFromListNode() {
    assertEquals(321, problem.computeNumber(problem.createListNode("123")))
    assertEquals(106, problem.computeNumber(problem.createListNode("601")))
    assertEquals(900, problem.computeNumber(problem.createListNode("009")))
    assertEquals(70, problem.computeNumber(problem.createListNode("07")))
  }
  
  @Test
  fun addTwoLists() {
    assertEquals(problem.computeNumber(problem.createListNode("579")),
                 problem.computeNumber(
                   problem.addTwoNumbers(problem.createListNode("123"),
                                         problem.createListNode("456"))))
    
    
    assertEquals(problem.computeNumber(problem.createListNode("6640000000000000000000000000001")),
                 problem.computeNumber(
                   problem.addTwoNumbers(problem.createListNode("1000000000000000000000000000001"),
                                         problem.createListNode("564"))))
  }
}
