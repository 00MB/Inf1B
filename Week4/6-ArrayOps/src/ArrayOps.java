public class ArrayOps {
    public static double findMax(double[] data) {
        double max = 0.0;
        for (double i : data) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double[] normalise(double data[]) {
        double sum = 0;
        for (double i : data) {
            sum += i;
        }
        double[] newData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i] / sum;
        }
        return newData;
    }

    public static void normaliseInPlace(double data[]) {
        double sum = 0;
        for (double i : data) {
            sum += i;
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] / sum;
        }
    }

    public static double[] reverse(double[] data) {
        double[] newData = new double[data.length];
        for (int i = data.length; i < 0; i--) {
            newData[data.length - i] = data[i];
        }
        return newData;
    }

    public static void reverseInPlace(double[] data) {
        for(int i = 0; i < data.length / 2; i++)
        {
            double temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }
    }

    public static void swap(double[] data1, double[] data2) {
        double[] temp = new double[data1.length];
        for (int i = 0; i < data1.length; i++) {
            temp[i] = data1[i];
            data1[i] = data2[i];
            data2[i] = temp[i];
        }
    }
}
