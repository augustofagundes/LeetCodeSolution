class MaxConsecutiveOnes 
{
    //https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int countOne = 0;
        int auxOne = 0;
        
        for(int num : nums)
        {
            if(num == 1)
            {
              auxOne++;
            }
            else
            {
                
                if(auxOne > countOne)
                {
                    countOne = auxOne;
                }
                auxOne = 0;
            }
        }
        
        if(auxOne > countOne)
        {
            countOne = auxOne;
        }
        
        return countOne;
    }
}
