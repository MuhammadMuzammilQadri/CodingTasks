/**
 * Created by Muzammil on 3/9/21.
 */
class TwoSum {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { indexOfI, i ->
      nums.forEachIndexed { indexOfJ, j ->
        if (i + j == target && indexOfI != indexOfJ)
          return intArrayOf(indexOfI, indexOfJ)
      }
    }
    return intArrayOf()
  }
}
