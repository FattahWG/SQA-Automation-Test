@Palindrome

Feature: Palindrome Check

  Scenario Outline: Check if a word is a palindrome
    Given a word <kata>
    When I check if the word is a palindrome
    Then the result should be <Hasil>
    Examples:
      | kata              | Hasil   |
      | "kasur ini rusak" | "true"  |
      | "saya makan"      | "false" |
      | "kasur ini rusak" | "false" |
      | "saya makan"      | "true"  |