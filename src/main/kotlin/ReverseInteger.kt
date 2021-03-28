/**
 * Created by Muzammil on 3/9/21.
 */
class ReverseInteger {
  fun reverse(x: Int): Int {
    return try {
      Math.abs(x).toString().reversed().let {
        if (x < 0) it.toInt() * -1 else it.toInt()
      }
    } catch (e: Exception) {
      0
    }
  }
}
