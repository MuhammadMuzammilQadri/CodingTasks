/**
 * Created by Muzammil on 3/9/21.
 */
class Atoi {
  fun myAtoi(s: String): Int {
    var isNegative: Boolean? = null
    StringBuilder().append(0).let { sb ->
      s.trim().let { trimmed ->
        var startFrom = 0
        if (trimmed.isNotEmpty() && (trimmed[0] == '-' || trimmed[0] == '+')) {
          isNegative = trimmed[0] == '-'
          startFrom++
        }
        
        for (i in startFrom until trimmed.length) {
          if (trimmed[i].isDigit()) {
            sb.append(trimmed[i])
          } else {
            break
          }
        }
        
        return try {
          sb.toString().toInt().let {
            if (isNegative == true) {
              it * -1
            } else {
              it
            }
          }
        } catch (e: NumberFormatException) {
          if (isNegative == true) {
            Int.MIN_VALUE
          } else {
            Int.MAX_VALUE
          }
        }
      }
    }
  }
}
