import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LetterCombinationOfPhoneNumberTest() {
  
  lateinit var problem: LetterCombinationOfPhoneNumber
  
  @BeforeEach
  fun setUp() {
    problem = LetterCombinationOfPhoneNumber()
  }
  
  @Test
  fun testCases() {
    assertEquals(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
                 problem.letterCombinations("23"))
    assertEquals(listOf("a", "b", "c"),
                 problem.letterCombinations("2"))
    assertEquals(listOf<String>(),
                 problem.letterCombinations(""))
  }
}
