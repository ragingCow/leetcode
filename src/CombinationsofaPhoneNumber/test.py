import unittest
import solution


class Test(unittest.TestCase):

    def setUp(self):
        self.solution = solution.Solution()

    def test_with1And0(self):
        result = self.solution.letterCombinations("23")
        print result

    def test_none(self):
        result = self.solution.letterCombinations("")
        self.assertEqual(result , [])

    def test_20(self):
        result = self.solution.letterCombinations("20")
        print "20", result


if __name__ == "__main__":
    unittest.main()
