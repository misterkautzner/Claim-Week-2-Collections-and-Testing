package practiceArrayLists;
import java.awt.List;
import java.util.ArrayList;

public class PracticeArrayLists {
	
	/*
	 * 1. Write a function that takes an input list and an interval n and returns a new list with 
	 * 		all the elements of the original list, in order, except that every nth item has been removed. 
	 * 		For instance, given the input list (1 2 3 4 5 6 7 8 9 10) and n = 4, the function should return 
	 * 		the list (1 2 3 5 6 7 9 10).
	 */
	
	public static ArrayList removeEveryNth(ArrayList list, int n) {
		
		for (int i = list.size()-1; i > 0; i--) {
			
			if ((i+1) % n == 0) {
				list.remove(i);
			}
		}
		return list;
	}
	
	
	/*
	 * 2. Write a function that takes an input list and returns a new list with 
	 * 		all the elements of the original list, in order, except that in the case 
	 * 		of duplicate elements all of the duplicates except the first has been removed. 
	 * 		For instance, all of the following lists should be transformed into the list 
	 * 		(1 2 3 4 5): (1 2 3 4 5), (1 1 2 3 4 5), (1 2 1 3 1 4 1 5 1), and (1 2 2 3 3 3 4 4 4 4 5 5 5 5 5).
	 */
	public static ArrayList removeDuplicates(ArrayList list) {
		ArrayList solution = new ArrayList();
		
		for (int i = 0; i < list.size(); i++) {
			Object currentItem = list.get(i);
			
			if (!solution.contains(currentItem)) {
				solution.add(currentItem);
			}
		}
		return solution;
	}
	
	
	/*
	 * 3. Write a function that takes an input list and splits the list in half; 
	 * 		for instance, given the input list (1 2 3 4 5) the two outputs are the 
	 * 		lists (1 2) and (3 4 5). If the list has odd length the middle element can 
	 * 		be placed in either half, at your option, so the lists (1 2 3) and (4 5) are 
	 * 		an alternate acceptable solution for the example problem.
	 */
	public static TwoArrayLists splitList(ArrayList list) {
		ArrayList firstHalf = new ArrayList();
		ArrayList secondHalf = new ArrayList();
		
		for (int i = 0; i < list.size()/2; i++) {
			Object item = list.get(i);
			firstHalf.add(item);
		}
		for (int i = list.size()/2; i < list.size(); i++) {
			Object item = list.get(i);
			secondHalf.add(item);
		}

		TwoArrayLists solution = new TwoArrayLists(firstHalf, secondHalf);
		//solution.getFirstHalf();
		//solution.getSecondHalf();
		
		return solution;
		
	}

}
