
class Solution(object):

    def value(self, num):
        x = {
            'I':1,
            'X':10,
            'C':100,
            'M':1000,
            'V':5,
            'L':50,
            'D':500,
            }
        return x.get(num) 

    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        ret = 0
        length = len(s)
        index = 0
        while index < length:
            roman = s[index]
            if roman == 'I' or roman == 'C' or roman == 'X':
                if index + 1 == length:
                    ret += value(roman)
                else:
                    tValue = s[index + 1]
                    if(value(tValue) > value(roman))
