public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    private String link;
    private String pathFile = "image.jpg";
    public FileDownloaderProxy(String link){
        this.link = link;
    }
    @Override
    public void download(String link, String pathFile) {
        fileDownloader = new FileDownloader();
        fileDownloader.download(this.link, this.pathFile);
    }
    public void download(){
        fileDownloader = new FileDownloader();
        fileDownloader.download(this.link, this.pathFile);
    }
}
