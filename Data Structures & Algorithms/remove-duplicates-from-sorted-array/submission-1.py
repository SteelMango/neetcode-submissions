class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        uni = sorted(set(nums))
        nums[:len(uni)] = uni
        return len(uni)


        