public static String repeatString(String input, int count) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < count; i++) {
        result.append(input);
    }
    return result.toString();
}
