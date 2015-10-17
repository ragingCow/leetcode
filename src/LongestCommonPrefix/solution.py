class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        length = len(strs)
        if length == 0:
            return ""

        for index ,ch in enumerate(strs[0]):
            innerIndex = 0
            while innerIndex < length:
                if index == len(strs[innerIndex]) or strs[0][index] != strs[innerIndex][index]:
                    return strs[0][0:index]
                innerIndex += 1;

        return strs[0];


