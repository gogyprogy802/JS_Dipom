public static int countVowels(String input) {
    int count = 0;
    String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
    for (char ch : input.toCharArray()) {
        if (vowels.indexOf(ch) != -1) {
            count++;
        }
    }
    return count;
}
