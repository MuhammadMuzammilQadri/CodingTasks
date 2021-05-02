/**
 * Created by Muzammil on 19-Apr-21.
 */
class LetterCombinationOfPhoneNumber {
  val numpad = mutableMapOf<String, List<Char>>().also {
    it.put("2", listOf('a', 'b', 'c'))
    it.put("3", listOf('d', 'e', 'f'))
    it.put("4", listOf('g', 'h', 'i'))
    it.put("5", listOf('j', 'k', 'l'))
    it.put("6", listOf('m', 'n', 'o'))
    it.put("7", listOf('p', 'q', 'r', 's'))
    it.put("8", listOf('t', 'u', 'v'))
    it.put("9", listOf('w', 'x', 'y', 'z'))
  }
  
  fun letterCombinations(digits: String): List<String> {
    val charactersList = mutableListOf<List<Char>>()
    digits.split("").toTypedArray().filter { it.isNotEmpty() }.forEach { digit ->
      charactersList.add(numpad[digit]!!)
    }
    
    var result = charactersList
                   .getOrNull(0)
                   ?.map { it.toString() }
                 ?: run {
                   return mutableListOf()
                 }
    for (i in 1 until charactersList.size) {
      val list = charactersList[i]
      val updatedResult = mutableListOf<String>()
      for (k in result.indices) {
        for (j in list.indices) {
          updatedResult.add(result[k] + list[j])
        }
      }
      result = updatedResult
    }
    
    return result
  }
}
