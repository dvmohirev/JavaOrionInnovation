package homework.Task9.task2;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Задание 2. Фильтрованные атрибуты
 * Используйте структуру файлов и папок из Задания 1.
 *
 * - Выведите полное  название и содержимое самого маленького файла. Если таких файлов несколько - выведите их все
 * - Выведите полное название и первые 10 символов самого большого файла.
 * - Удалите папку SE2020_LESSON9 и все вложенные файлы и папки.
 */
public class AttributesFiltering {
    public static void main(String ... args) throws IOException {

        ArrayList<Path> filesArray = new ArrayList<>();

        FileVisitor fillFilesArray = new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                filesArray.add(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(Paths.get("SE2020_LESSON9"), new HashSet<>(), 4, fillFilesArray);

        ArrayList<Path> smallestFiles = new ArrayList<>();
        ArrayList<Path> biggestFiles = new ArrayList<>();
        long maxFileSize = Long.MIN_VALUE;
        long minFileSize = Long.MAX_VALUE;

        for (Path path : filesArray) {
            long tmpFileSize = Files.size(path);
            if (tmpFileSize > maxFileSize) {
                maxFileSize = tmpFileSize;
                biggestFiles.clear();
            }
            if (tmpFileSize == maxFileSize) {
                biggestFiles.add(path);
            }
            if (tmpFileSize < minFileSize) {
                minFileSize = tmpFileSize;
                smallestFiles.clear();
            }
            if (tmpFileSize == minFileSize) {
                smallestFiles.add(path);
            }
        }
        for (Path path : smallestFiles) {
            System.out.println("Smallest file (" + minFileSize + " symbols):");
            System.out.println(path);
            try (FileReader fr = new FileReader(String.valueOf(path))) {
                int digit = fr.read();
                while (digit != -1) {
                    System.out.print(digit - 48);
                    digit = fr.read();
                }
            }
            System.out.println();

        }

        for (Path path : biggestFiles) {
            System.out.println("Biggest file (" + maxFileSize + " symbols):");
            System.out.println(path);
            System.out.println("Starts with:");
            try (FileReader fr = new FileReader(String.valueOf(path))) {
                int digit = fr.read();
                int count = 10;
                while ((digit != -1) && (count-->0)) {
                    System.out.print(digit - 48);
                    digit = fr.read();
                }
            }
            System.out.println();

        }

        /*FileVisitor deleteRecursively = new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(Paths.get("SE2020_LESSON9"), new HashSet<>(), 4, deleteRecursively);*/

    }
}
