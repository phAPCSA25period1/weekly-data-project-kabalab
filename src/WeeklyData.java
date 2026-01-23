public class WeeklyData {

    private double[] data;

    public WeeklyData(double[] input) {
        if (input == null) {
            data = new double[0];
        } else {
            data = new double[input.length];
            for (int i = 0; i < input.length; i++) {
                data[i] = input[i];
            }
        }
    }

    public double getTotal() {
        double total = 0.0;
        for (double value : data) {
            total += value;
        }
        return total;
    }

    public double getAverage() {
        if (data.length == 0) {
            return 0.0;
        }
        return getTotal() / data.length;
    }

    public double getMax() {
        if (data.length == 0) {
            return 0.0;
        }

        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public double getMin() {
        if (data.length == 0) {
            return 0.0;
        }

        double min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            output.append("Day ")
                  .append(i + 1)
                  .append(": ")
                  .append(data[i])
                  .append("\n");//prefer over +
        }

        return output.toString();
    }
}
