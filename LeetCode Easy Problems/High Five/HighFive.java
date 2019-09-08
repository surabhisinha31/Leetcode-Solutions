package leetcodeEasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] items = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		int[][] result = highFive(items);
		for(int i = 0 ; i < result.length ; i++) {
			for(int j = 0 ; j < result.length ; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
    public static int[][] highFive(int[][] items) {
    	Map<Integer, ArrayList<Integer>> map = new HashMap<>();					//to track each unique student id and list of their score as a list
    	for(int i = 0 ; i < items.length ; i++) {
    		if(!map.containsKey(items[i][0])) {
    				map.put(items[i][0], new ArrayList<>());	
    			}
    		map.get(items[i][0]).add(items[i][1]);
    	}
    	
    	int[][] result= new int[map.size()][2];
    	int j = 0 ;
    	for (Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
    		List<Integer> list = entry.getValue();
    		Collections.sort(list, Collections.reverseOrder());					//sort each students score in descending order to get top 5 marks
    		int sum = 0;
    		for(int i = 0 ; i < 5 ; i++) {
    			sum += list.get(i) != 0 ? list.get(i) : 0;
    		}
    		result[j][0] = entry.getKey();
    		result[j][1] = sum/5;												//to find average of 5 top marks
    		j++;
    	}
    	return result;
    }
}
