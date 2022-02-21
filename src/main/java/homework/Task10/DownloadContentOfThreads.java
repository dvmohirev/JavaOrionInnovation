package homework.Task10;

public class DownloadContentOfThreads extends Thread{
    private static final DownloadContent downloadContent = new DownloadContent();

    private String link;

    public DownloadContentOfThreads(String link) {
        this.link = link;
    }

    @Override
    public void run() {
        downloadContent.downloadInformation(link);
    }

    public long getDownloadTime() {
        return downloadContent.getDownloadTime();
    }

    public int getInformationSize() {
        return downloadContent.getInformationSize();
    }
}
