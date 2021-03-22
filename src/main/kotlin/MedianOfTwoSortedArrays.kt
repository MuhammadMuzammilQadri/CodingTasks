import java.util.*

/**
 * Created by Muzammil on 3/9/21.
 */

class MedianOfTwoSortedArrays {
  fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    nums1.plus(nums2)
      .let {
        Arrays.sort(it)
        return computeMedian(it)
      }
    
  }
  
  private fun computeMedian(list: IntArray): Double {
    if (list.size % 2 == 0) {
      (list.size / 2).let {
        return (list[it] + list[it - 1]) / 2.0
      }
    } else {
      return list[list.size / 2].toDouble()
    }
  }
}
