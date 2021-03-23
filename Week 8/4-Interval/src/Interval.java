public class Interval {
    double intervalleft;
    double intervalright;

    public Interval(double left, double right) {
        intervalleft = left;
        intervalright = right;
    }

    public boolean doesContain(double x) {
        if (intervalleft < intervalright && intervalleft <= x && intervalright >= x) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (intervalleft > intervalright) {
            return true;
        }
        return false;
    }

    public boolean intersects(Interval b) {
        if (doesContain(b.intervalleft) || doesContain(b.intervalright)) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (intervalleft >= intervalright) {
            return "Interval: (EMPTY)";
        }
        return "Interval: ["+intervalleft+", "+intervalright+"]";

    }
}
