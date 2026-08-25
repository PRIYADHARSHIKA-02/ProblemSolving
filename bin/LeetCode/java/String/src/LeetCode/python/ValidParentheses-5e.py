class solution:
    def isValid(self, s : str) -> bool:
        stack =[]
        closetoOpen = {')': '(', ']': '[', '}': '{'} 

        for c in s:
            if c in closetoOpen():    # If it's a closing bracket
                if stack and stack[-1] == closetoOpen(c):
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)       # It's an opening bracket
        return not stack              # If stack is empty, all brackets matched
    


"""
Time complexity : O ( n )  because we simply traverse the given string one character at a time and push and pop operations on a stack take O(1) time.
Space complexity : O ( n ) as we push all opening brackets onto the stack and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((.
w5e"""
