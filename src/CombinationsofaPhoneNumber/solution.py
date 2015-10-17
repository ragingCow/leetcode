class Solution(object):
    def __init__(self):
        self.letterDict = self.buildDict()
        self.combinations = []
        self.curStack = [] 

     
    def getLetter(self, digit):
        return self.letterDict.get(digit)
             
    def buildDict(self):
        letterDict = {
                '1':"",
                '2':"abc",
                '3':"def",
                '4':"ghi",
                '5':"jkl",
                '6':"mno",
                '7':"pqrs",
                '8':"tuv",
                '9':"wxyz",
                '0':"",
                }
        return letterDict

        

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if len(digits) == 0:
            return []
        self.calPossibleCombinations(digits,0)
        return self.combinations

    def calPossibleCombinations(self,digits, index):
        if index == len(digits):
            self.combinations.append("".join(self.curStack))
            return 

        letters = self.getLetter(digits[index])
        if len(letters) == 0:
            self.calPossibleCombinations(digits, index + 1)

        for letter in letters:
            self.curStack.append(letter)
            self.calPossibleCombinations(digits,index + 1)
            self.curStack.pop()
