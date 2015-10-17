import unittest
import solution

class Test(unittest.TestCase):

    def setUp(self):
        self.solution = solution.Solution()

    def test_multiStr(self):
        result = self.solution.longestCommonPrefix(["Hello","HelloWorld"]) 
        self.assertEqual(result, "Hello")

    def test_oneStr(self):
        result = self.solution.longestCommonPrefix(["Hello"]) 
        self.assertEqual(result, "Hello")

    def test_nonStr(self):
        result = self.solution.longestCommonPrefix([]) 
        self.assertEqual(result, "")
        

if __name__ == "__main__":
    unittest.main()
