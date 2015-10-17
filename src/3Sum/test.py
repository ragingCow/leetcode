import unittest
import solution

class Test(unittest.TestCase):

    def setUp(self):
        self.solution = solution.Solution()

    def test_nonExist(self):
        result = self.solution.threeSum([-1,0,2,3,4,5])
        self.assertEqual(result, [])

    def test_leetcodeExample(self):
        result = self.solution.threeSum([-1, 0, 1, 2 ,-1, -4])
        self.assertEqual(result, [(-1, 0, 1),( -1, -1, 2)])
        

if __name__ == "__main__":
    unittest.main()
