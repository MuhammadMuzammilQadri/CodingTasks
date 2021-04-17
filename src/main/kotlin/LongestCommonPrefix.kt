class LongestCommonPrefix {
  fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    
    val firstWord = strs[0]
    var end = firstWord.length
    
    while (end > 0) {
      var commonPrefix = firstWord.slice(0 until end)
      var isExist = true
      for (i in strs.indices) {
        if (!strs[i].startsWith(commonPrefix)) {
          isExist = false
        }
      }
      if (isExist) {
        return commonPrefix
      }
      end--
    }
    return ""
  }
}
