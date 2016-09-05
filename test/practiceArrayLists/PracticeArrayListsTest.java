package practiceArrayLists;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PracticeArrayListsTest {
	
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private PracticeArrayLists practiceArrayLists;

    @Before
    public final void before() {
        practiceArrayLists = new PracticeArrayLists();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  TESTING removeEveryNth()
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void testRemoveNth1() {
    	ArrayList inList = new ArrayList();
    	for (int i = 0; i < 6; i++) {
    		inList.add(i);
    	}
    	
        ArrayList actualOutput = practiceArrayLists.removeEveryNth(inList, 3);
        ArrayList expectedOutput = new ArrayList();
        expectedOutput.add(0); expectedOutput.add(1); expectedOutput.add(3); expectedOutput.add(4);
        
        assertEquals(actualOutput, expectedOutput);
    }
    
    @Test
    public void testRemoveNth2() {
    	ArrayList inList = new ArrayList();
    	for (int i = 0; i < 7; i++) {
    		inList.add(i);
    	}
    	
        ArrayList actualOutput = practiceArrayLists.removeEveryNth(inList, 2);
        ArrayList expectedOutput = new ArrayList();
        expectedOutput.add(0); expectedOutput.add(2); expectedOutput.add(4); expectedOutput.add(6);
        
        assertEquals(actualOutput, expectedOutput);
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  TESTING removeDuplicates()
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Test
    public void testRemDups1() {
    	ArrayList inList = new ArrayList();
    	inList.addAll(Arrays.asList(1, 2, 3, 4, 5));
    	
    	ArrayList actualOutput = practiceArrayLists.removeDuplicates(inList);
    	ArrayList expectedOutput = new ArrayList();
    	expectedOutput.addAll(Arrays.asList(1, 2, 3, 4, 5));
    	
    	assertEquals(actualOutput, expectedOutput);
    }
        
    @Test
    public void testRemDups2() {
    	ArrayList inList = new ArrayList();
    	inList.addAll(Arrays.asList(1, 1, 2, 3, 4, 5));
    	
    	ArrayList actualOutput = practiceArrayLists.removeDuplicates(inList);
    	ArrayList expectedOutput = new ArrayList();
    	expectedOutput.addAll(Arrays.asList(1, 2, 3, 4, 5));
    	
    	assertEquals(actualOutput, expectedOutput);
    }
    
    @Test
    public void testRemDups3() {
    	ArrayList inList = new ArrayList();
    	inList.addAll(Arrays.asList(1, 2, 1, 3, 1, 4, 1, 5, 1));

    	ArrayList actualOutput = practiceArrayLists.removeDuplicates(inList);
    	ArrayList expectedOutput = new ArrayList();
    	expectedOutput.addAll(Arrays.asList(1, 2, 3, 4, 5));

    	assertEquals(actualOutput, expectedOutput);
    }
    
    @Test
    public void testRemDups4() {
    	ArrayList inList = new ArrayList();
    	inList.addAll(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5));

    	ArrayList actualOutput = practiceArrayLists.removeDuplicates(inList);
    	ArrayList expectedOutput = new ArrayList();
    	expectedOutput.addAll(Arrays.asList(1, 2, 3, 4, 5));

    	assertEquals(actualOutput, expectedOutput);
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  TESTING splitList()
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Test
    public void testSplitTest1() {
    	ArrayList inList = new ArrayList();
    	inList.addAll(Arrays.asList(1, 2, 3, 4, 5));
    	
    	TwoArrayLists actualOutput = practiceArrayLists.splitList(inList);
    	ArrayList firstHalf = actualOutput.getFirstHalf();
    	ArrayList secondHalf = actualOutput.getSecondHalf();
    	
    	ArrayList expectedOutputFirst = new ArrayList();
    	ArrayList expectedOutputSecond = new ArrayList();
    	expectedOutputFirst.addAll(Arrays.asList(1, 2));
    	expectedOutputSecond.addAll(Arrays.asList(3, 4, 5));
    	
    	assertEquals(firstHalf, expectedOutputFirst);
    	assertEquals(secondHalf, expectedOutputSecond);
    }
    
    @Test
    public void testSplitTest2() {
    	ArrayList inList = new ArrayList();
    	inList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
    	
    	TwoArrayLists actualOutput = practiceArrayLists.splitList(inList);
    	ArrayList firstHalf = actualOutput.getFirstHalf();
    	ArrayList secondHalf = actualOutput.getSecondHalf();
    	
    	ArrayList expectedOutputFirst = new ArrayList();
    	ArrayList expectedOutputSecond = new ArrayList();
    	expectedOutputFirst.addAll(Arrays.asList(1, 2, 3));
    	expectedOutputSecond.addAll(Arrays.asList(4, 5, 6));
    	
    	assertEquals(firstHalf, expectedOutputFirst);
    	assertEquals(secondHalf, expectedOutputSecond);
    }

    
}
