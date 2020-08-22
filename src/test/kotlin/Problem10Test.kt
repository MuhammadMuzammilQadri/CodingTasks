import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class Problem10Test() {
  
  lateinit var problem10: Problem10
  
  @BeforeEach
  fun setUp() {
    problem10 = Problem10()
  }
  
  @Test
  fun testCases() {
    assertEquals(10, problem10.solve(5))
    assertEquals(17, problem10.solve(10))
    assertEquals(2, problem10.solve(2))
    assertEquals(0, problem10.solve(1))
    assertEquals(142913828922, problem10.solve(2000000))
    assertEquals(3203324994356, problem10.solve(9999999))
  }
  
  @Test
  fun isPrime() {
    assertEquals(true, problem10.isPrime(2))
    assertEquals(true, problem10.isPrime(3))
    assertEquals(true, problem10.isPrime(5))
    assertEquals(true, problem10.isPrime(11))
    assertEquals(true, problem10.isPrime(43))
    
    assertEquals(false, problem10.isPrime(1))
    assertEquals(false, problem10.isPrime(9))
    assertEquals(false, problem10.isPrime(6))
    assertEquals(false, problem10.isPrime(39))
  }
}
