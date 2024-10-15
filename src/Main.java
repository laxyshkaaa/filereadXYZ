import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // счётчики
        int Count = 0;
        int maximalCount = 0;

        try {
            // Читаем содержимое файла d строку
            String content = Files.readString(Paths.get("xyz.txt"), StandardCharsets.UTF_8);

            // Проходим по всем символам строки
            for (char c : content.toCharArray()) {
                if (c == 'X') {
                    Count++;
                    if (Count > maximalCount) {
                        maximalCount = Count;
                    }
                } else {
                    // Сбрасываем счётчик, если встречаем не 'X'
                    Count = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(maximalCount);
    }
}
