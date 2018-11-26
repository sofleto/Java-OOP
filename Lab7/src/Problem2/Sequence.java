package Problem2;

import java.util.Arrays;
import java.util.Objects;

public class Sequence {
    private Object[] obs;
    private int next = 0;

    public Sequence(int size) {
        obs = new Object[size];
    }

    public void add(Object x) {
        if (next < obs.length) {
            obs[next] = x;
            next++;
        }
    }

    private class Sselector implements Selector {
        //iterate from first to last
        int i = 0;

        @Override
        public boolean end() {
            return i == obs.length;
        }

        @Override
        public Object current() {
            return obs[i];
        }

        @Override
        public void next() {
            if (i < obs.length)
                i++;
        }
    }

    private class Eselector implements Selector {
        //iterate from last to first
        int i = obs.length - 1;

        @Override
        public boolean end() {
            return i == -1;
        }

        @Override
        public Object current() {
            return obs[i];
        }

        @Override
        public void next() {
            if (i >= 0)
                i--;
        }
    }

    public Selector getSselector() {
        return new Sselector();
    }

    public Selector getEselector() {
        return new Eselector();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sequence sequence = (Sequence) o;
        return next == sequence.next &&
                Arrays.equals(obs, sequence.obs);
    }

}

