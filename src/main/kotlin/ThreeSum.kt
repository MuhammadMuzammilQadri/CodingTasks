class ThreeSum {
  fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    
    nums.sort()
    
    for (i in nums.indices) {
      if (i != 0 && nums[i] == nums[i - 1]) continue
      var l = i + 1
      var r = nums.size - 1
      while (l < r) {
        val sum = nums[i] + nums[l] + nums[r]
        if (sum == 0) {
          val lastResult = result.lastOrNull()
          if (!(nums[i] == lastResult?.get(0)
                && nums[l] == lastResult.get(1)
                && nums[r] == lastResult.get(2))) {
            result.add(listOf(nums[i], nums[l], nums[r]))
          }
          l++
        } else if (sum < 0) {
          l++
        } else {
          r--
        }
      }
    }
    
    return result
  }
}
