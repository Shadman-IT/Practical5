class Practical5 {
    public static void main(String[] args) {
        System.out.println(getfactorial1(5));
        System.out.println(getfactorial2(5));
        System.out.println(getfactorial3(5));
        System.out.println(getsum(3));
        System.out.println(getsum1(2));
        System.out.println(getsum2(2));

    }

    static int getfactorial1(int num) {
        int result = 1;
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    static int getfactorial2(int num) {
        int i = 1, result = 1;
        if (num == 0) {
            return 1;
        }
        while (i <= num) {
            result = result * i;
            i++;
        }
        return result;
    }

    static int getfactorial3(int num) {
        if (num == 0) {
            return 1;
        }

        return num * getfactorial3(num - 1);
    }

    static int getsum(int num) {
        int[] sum = { 2, 7, 5 };
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += sum[i];

        }
        return result;

    }

    static int getsum1(int num) {
        int[] sum = { 2, 8, 55 };
        int i = 0, result = 0;
        while (i < num) {
            result += sum[i];
            i++;
        }
        return result;
    }

    static int getsum2(int num) {
        int[] sum = { 2, 4, 5 };

        if (num == 0) {
            return sum[num];
        }
        return sum[num] + getsum2(num - 1);
    }
}