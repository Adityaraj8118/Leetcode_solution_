class Solution:
    
    def romanToInt(self, s: str) -> int:
        
        roman_to_int = {'I': 1,'V': 5,'X': 10,'L': 50,'C': 100,'D': 500,'M': 1000}
        exception_dict = {'IV':2,'IX':2,'XL':20,'XC':20,'CD':200,'CM':200}
        
        string_list = [char for char in s]
        running_sum = 0
        
        for val in string_list:
            running_sum += roman_to_int.get(val)
            
        for substring in exception_dict:
            if substring in s:
                running_sum -= exception_dict.get(substring)
        return running_sum
        
