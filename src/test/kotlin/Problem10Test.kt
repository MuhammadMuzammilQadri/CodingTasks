import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.TestInstance.Lifecycle

/**
 * Created by Muzammil on 22-Aug-20.
 */
@TestInstance(Lifecycle.PER_CLASS)
internal class Problem10Test() {
  
  lateinit var problem10: Problem10
  
  @BeforeAll
  fun setUp() {
    val start = System.currentTimeMillis()
    problem10 = Problem10()
    val initializingEndTime = System.currentTimeMillis()
    if (initializingEndTime - start > 500) {
      fail("Too much time taken in initializing, time take: " +
           "${initializingEndTime - start} milliseconds")
    }
  }
  
  @Test
  fun maximumConstraintTest() {
    val start = System.currentTimeMillis()
    
    var input = 1000_000
    for (i in 1..10000) {
      problem10.solve(input--)
    }
    
    val testsEndTime = System.currentTimeMillis()
    if (testsEndTime - start >= 2000) {
      fail("Too much time taken in completing tests, time take: " +
           "${testsEndTime - start} milliseconds")
    } else {
      assert(true)
    }
  }
  
  @Test
  fun createPrimesList() {
    assertEquals("2", problem10.PRIMES_LIST[0].toString())
    assertEquals("3", problem10.PRIMES_LIST[1].toString())
    assertEquals("5", problem10.PRIMES_LIST[2].toString())
    assertEquals("7", problem10.PRIMES_LIST[3].toString())
    assertEquals("11", problem10.PRIMES_LIST[4].toString())
    assertEquals("13", problem10.PRIMES_LIST[5].toString())
    assertEquals("17", problem10.PRIMES_LIST[6].toString())
    assertEquals("19", problem10.PRIMES_LIST[7].toString())
    assertEquals("23", problem10.PRIMES_LIST[8].toString())
    assertEquals("29", problem10.PRIMES_LIST[9].toString())
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
}
