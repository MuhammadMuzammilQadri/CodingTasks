import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle

/**
 * Created by Muzammil on 22-Aug-20.
 */
@TestInstance(Lifecycle.PER_CLASS)
internal class Problem10Test() {
  
  lateinit var problem10: Problem10
  
  @BeforeAll
  fun setUp() {
    problem10 = Problem10()
  }
  
  @Test
  fun createPrimesList() {
    assertEquals("2, 3, 5, 7, 11, 13, 17, 19, 23, 29",
                 problem10.PRIMES_LIST.subList(0, 10).joinToString())
  }
  
  @Test
  fun createSumOfPrimesList() {
    assertEquals("2, 5, 10, 17, 28",
                 problem10.SUM_OF_PRIMES_LIST.subList(0, 5).joinToString())
  }
  
  @Test
  fun testCases() {
    assertEquals(10, problem10.solve(5))
    assertEquals(17, problem10.solve(10))
    assertEquals(2, problem10.solve(2))
    assertEquals(5, problem10.solve(3))
    assertEquals(0, problem10.solve(1))
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
