package homework.Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DownloadContent {

    private long totalDownloadTime;
    private int totalInformationSize;

    public void downloadInformation(String link) {
        long beginTime = System.nanoTime();

        try {
            URL url = new URL(link);
            InputStreamReader inputStreamReader = new InputStreamReader(url.openConnection().getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String content;

            while ((content = bufferedReader.readLine()) != null) {
                totalInformationSize += content.length();
            }

            bufferedReader.close();
            inputStreamReader.close();
        }
        catch (IOException ex) {
            System.out.println("Some I/O operation has been interrupted or failed.");
        }

        totalDownloadTime += System.nanoTime() - beginTime;
    }

    public long getDownloadTime() {
        return totalDownloadTime;
    }

    public int getInformationSize() {
        return totalInformationSize;
    }
}
