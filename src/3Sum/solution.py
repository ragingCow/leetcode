class Solution(object):

    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        
        nums = sorted(nums)
        result = []
        
        for i in xrange(len(nums)):
            if nums[i] > 0 :
                break
            for j in xrange(i + 1, len(nums)):
                ret = self.binarySearch(nums, j + 1, len(nums), 0 - nums[i] - nums[j])
                if ret >= 0:
                    result.append((nums[i], nums[j], 0 - nums[i] - nums[j]))
        
        return list(set(result))
    
    
    def binarySearch(self, nums, start, end,value):
        left = start
        right = end - 1
        while left <= right:
            middle = (left + right) / 2
            if nums[middle] == value:
                return middle
            elif nums[middle] > value:
                right = middle - 1
            else:
                left = middle + 1

        return -1
            
