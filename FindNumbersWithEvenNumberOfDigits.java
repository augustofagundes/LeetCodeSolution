class FindNumbersWithEvenNumberOfDigits {
    //https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
    public int findNumbers(int[] nums) 
    {
        int count = 0;
        for( int num : nums)
        {
            String dig = String.valueOf(num);
            
            if(dig.length() % 2 == 0)
                count++;
        }
        return count;
        
    }
}
