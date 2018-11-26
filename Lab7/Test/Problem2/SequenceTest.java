package Problem2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SequenceTest {

    @Test
    public void testSelectorFirstLast() {
        Sequence test = new Sequence(8);
        Sequence test1 = new Sequence(8);
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            test.add(10 + random.nextInt(100));
        }

        System.out.println("from first to last");
        Selector iter = test.getSselector();
        while (!iter.end()) {
            System.out.println(iter.current());
            iter.next();
        }

        System.out.println("from last to first");
        Selector iter1 = test.getEselector();
        while (!iter1.end()) {
            System.out.println(iter1.current());
            iter1.next();
        }


    }

    @Test
    public void testSelectorLastToFirst() {
        Sequence test1 = new Sequence(8);
        Sequence test2 = new Sequence(8);
        Random random = new Random();
        while (test1.getEselector().end()) {
            test1.add(10 + random.nextInt(101));
            test2.add(test1.getEselector().current());
            test1.getEselector().next();
            test2.getSselector().next();
        }

        Assert.assertTrue(test1.equals(test2));
    }


}


