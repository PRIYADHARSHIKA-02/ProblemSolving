import re
class Solution:
    def hasMatch(self,s: str,p:str) -> bool:
        parts = p.split('*')
        pattern = '.*'.join(re.escape(part)for part in parts)
        return re.search(pattern,s) is not None
    