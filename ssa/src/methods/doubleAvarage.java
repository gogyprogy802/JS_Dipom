public static double calculateAverage(int[] array) {
    double sum = 0;
    for (int num : array) {
        sum += num;
    }
    return sum / array.length;
}
