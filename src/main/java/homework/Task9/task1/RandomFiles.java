package homework.Task9.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Random;

public class RandomFiles {
    public static void main(String ... args) throws IOException {
        Random rd = new Random();
        int levelsNumber = rd.nextInt(3)+1;
        String pathName = "SE2020_LESSON9";
        for (int i = 0; i < levelsNumber+1; i++) {
            Files.createDirectory(Paths.get(pathName));
            int filesNumber = rd.nextInt(3)+1;
            for (int i1 = 0; i1 < filesNumber; i1++) {
                String fileName = pathName+ "\\File_"+(i1+1);
                int symbolCount = rd.nextInt(191);
                FileWriter fileWriter = new FileWriter(fileName);
                for (int i2 = 0; i2 < symbolCount+10; i2++) {
                    fileWriter.write(48+rd.nextInt(10));
                }
                fileWriter.close();
            }
            pathName += "\\Directory_" + (i+1);
        }

        FileVisitor viewFileNames = new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                System.out.println(file.toAbsolutePath());
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
        Files.walkFileTree(Paths.get("SE2020_LESSON9"), new HashSet<>(), 4, viewFileNames);

    }
}
