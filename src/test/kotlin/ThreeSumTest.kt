import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ThreeSumTest() {
  
  lateinit var problem: ThreeSum
  
  @BeforeEach
  fun setUp() {
    problem = ThreeSum()
  }
  
  @Test
  fun testCases() {
    assertEquals(listOf(listOf(-2,-1,3), listOf(-2, 0, 2), listOf(-1, 0, 1)),
                 problem.threeSum(intArrayOf(3,0,-2,-1,1,2)))
    
    assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)),
                 problem.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    
    assertEquals(listOf(listOf(0, 0, 0)),
                 problem.threeSum(intArrayOf(0, 0, 0, 0)))
    
    assertEquals(listOf<List<Int>>(),
                 problem.threeSum(intArrayOf()))
    
    assertEquals(listOf<List<Int>>(),
                 problem.threeSum(intArrayOf(0)))
  }
}
