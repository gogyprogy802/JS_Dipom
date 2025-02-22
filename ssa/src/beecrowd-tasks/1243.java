import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String statement = scanner.nextLine().trim();
            if (statement.isEmpty()) {
                continue;
            }
            int difficulty = classifyDifficulty(statement);
            System.out.println(difficulty);
        }

        scanner.close();
    }

    private static int classifyDifficulty(String statement) {
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\.?\\b");
        Matcher matcher = pattern.matcher(statement);

        int totalLength = 0;
        int wordCount = 0;

        while (matcher.find()) {
            String word = matcher.group();
            totalLength += word.replace(".", "").length();
            wordCount++;
        }

        int averageLength = (wordCount == 0) ? 0 : totalLength / wordCount;

        if (averageLength <= 3) {
            return 250;
        } else if (averageLength <= 5) {
            return 500;
        } else {
            return 1000;
        }
    }
}