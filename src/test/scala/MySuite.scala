// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html

import days01.Elf

class MySuite extends munit.FunSuite {
  test("Elf.sumCalories test that succeeds") {
    val obtained = Elf(List(1,2,3)).sumCalories
    val expected = 6
    assertEquals(obtained, expected)
  }
}
