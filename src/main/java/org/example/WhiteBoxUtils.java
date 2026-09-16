package org.example;

public class WhiteBoxUtils {

    // 1. Chu vi hình chữ nhật
    public static double rectanglePerimeter(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be >= 0");
        }
        return 2 * (length + width);
    }

    // 2. Diện tích hình chữ nhật
    public static double rectangleArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be >= 0");
        }
        return length * width;
    }

    // 3. Giải phương trình bậc 2
    public static double[] solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a must be different from 0");
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};

        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x};

        } else {
            return new double[]{};
        }
    }

    // 4. Số ngày của tháng
    public static int daysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;

            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);
    }

    // 5. Kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 6. S = 1 - 2 + 3 - 4 + ... +/- n
    public static int alternatingSum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1");
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }

        return sum;
    }

    // 7. UCLN
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("a and b cannot both be 0");
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Hàm giai thừa
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // 8. S = 1! + 2! + ... + n!
    public static long factorialSum(int n) {
        if (n < 1 || n > 20) {
            throw new IllegalArgumentException("n must be from 1 to 20");
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }

        return sum;
    }
}