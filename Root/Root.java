public class Root {
    static double EPSILON = 0.000001;

    public static double absolute(double x) {
        return (x < 0) ? -x : x;
    }

    public static double pow2(double x) {
        return x * x;
    }

    public static double pow3(double x) {
        return x * x * x;
    }

    public static double square_root(double x) {
        double result = 1.0;
        // while (absolute(pow2(result) - x) >= EPSILON) {
        // result = result - (pow2(result) - x) / (2 * x);
        // }
        while (absolute(pow2(result) - x) >= EPSILON) {
            result = (x / result - result) / 2 + result;
            // System.out.println("sqrt " + String.valueOf(result));
        }
        return result;
    }

    public static double cube_root(double x) {
        double result = 1.0;
        // while (absolute(pow3(result) - x) >= EPSILON) {
        // result = result - (pow2(result) - x) / (3 * x);
        // }
        System.out.println("cube" + String.valueOf(x));
        while (absolute(pow3(result) - x) >= EPSILON) {
            result = (x / pow2(result) + 2 * result) / 3;
            // System.out.println("cube " + String.valueOf(result));
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(square_root(x));
        System.out.println(cube_root(x));
    }
}
