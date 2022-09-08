package UnitTests

import sample._

class SumTests extends UnitTestSpec {
  "Sum" should "return 3 when calling with 1 and 2 parameters" in {
    assert (Sum(1, 2) == 3)
  }
}
