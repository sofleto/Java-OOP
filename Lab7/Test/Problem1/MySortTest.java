package Problem1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySortTest {
    @Test
    public void testSort() {
        int[] arr={3,2,9,1,22};
        SortOrder test=new SortOrder();
        Sortable method=test.down();
        MySort arrSort=new MySort(method);
        arrSort.sort(arr);
        int[] other={22,9,3,2,1};
        assertArrayEquals(arr,other);
    }


}