package practiceArrayLists;

import java.util.ArrayList;

// This class is used to return both halves of the original list separately.
public class TwoArrayLists {
	private ArrayList firstHalf;
	private ArrayList secondHalf;
	
	public TwoArrayLists(ArrayList first, ArrayList second) {
		firstHalf = first;
		secondHalf = second;
	}
	
	public ArrayList getFirstHalf() {
		return firstHalf;
	}
	
	public ArrayList getSecondHalf() {
		return secondHalf;
	}
	
}
