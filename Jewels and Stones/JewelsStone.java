package unsolvedpackage;

public class JewelsStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numJewelsInStones("z", "ZZZZ"));
	}
    public static int numJewelsInStones(String J, String S) {
        int count = 0;						//to keep track value of jewels in stones
        int[] jewels = new int[128];		//to keep track of counts of each stone
        for(char c : S.toCharArray())
        	jewels[c]++;
        for(char c : J.toCharArray())
        	count += jewels[c];				//to get count of jewels from stones
        return count;
    }
}
