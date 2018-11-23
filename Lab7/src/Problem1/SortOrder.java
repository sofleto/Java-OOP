package Problem1;

public class SortOrder {

    private class Upward implements Sortable {
        @Override
        public boolean greater(int a, int b) {
            return a < b;
        }
    }

    private class Downward implements Sortable {
        @Override
        public boolean greater(int a, int b) {
            return a > b;
        }
    }

    public Sortable up() {
        return new Upward();
    }


    public Sortable down() {
        return new Downward();
    }
}
