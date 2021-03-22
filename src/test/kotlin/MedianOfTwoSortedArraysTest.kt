import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class MedianOfTwoSortedArraysTest() {
  
  lateinit var problem: MedianOfTwoSortedArrays
  
  @BeforeEach
  fun setUp() {
    problem = MedianOfTwoSortedArrays()
  }
  
  @Test
  fun testCases() {
    assertEquals(2.0,
                 problem.findMedianSortedArrays(intArrayOf(1, 3),
                                                intArrayOf(2)))
    assertEquals(2.5,
                 problem.findMedianSortedArrays(intArrayOf(1, 2),
                                                intArrayOf(3, 4)))
    assertEquals(0.0,
                 problem.findMedianSortedArrays(intArrayOf(0, 0),
                                                intArrayOf(0, 0)))
    assertEquals(1.0,
                 problem.findMedianSortedArrays(intArrayOf(),
                                                intArrayOf(1)))
    assertEquals(2.0,
                 problem.findMedianSortedArrays(intArrayOf(2),
                                                intArrayOf()))
  }
}
