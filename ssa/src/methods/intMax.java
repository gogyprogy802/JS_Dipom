public static int findMax(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int num : array) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}
