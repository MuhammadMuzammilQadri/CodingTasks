class ContainerWithMostWater {
  fun maxArea(height: IntArray): Int {
    var max = 0
    var i = 0
    var j = height.size - 1
    while (i < j) {
      max = computeArea(height, i, j, max)
      if (height[i] < height[j]) {
        i++
      } else {
        j--
      }
    }
    return max
  }
  
  private fun computeArea(height: IntArray, i: Int, j: Int, max: Int): Int {
    var _max = max
    val height = Math.min(height[i], height[j])
    _max = Math.max(_max, height * Math.abs(i - j))
    return _max
  }
}
