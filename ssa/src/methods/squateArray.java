public static int[] squareArray(int[] array) {
    int[] squaredArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        squaredArray[i] = array[i] * array[i];
    }
    return squaredArray;
}
