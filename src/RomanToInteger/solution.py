
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
                    ret += self.value(roman)
                    index += 1;
                    continue;
                else:
                    nextValue = self.value(s[index + 1])
                    curValue = self.value(s[index])
                    if nextValue > curValue:
                        ret += nextValue - curValue
                        index += 2
                    else:
                        ret += curValue
                        index += 1
            else:
                ret += self.value(roman)
                index += 1
        return ret

if __name__ == "__main__":
    s = Solution()
    print s.romanToInt("MCMLXXX")
