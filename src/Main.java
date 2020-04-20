public class Main {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy("https://drive.google.com/drive/u/0/my-drive");
        fileDownloaderProxy.download();
    }
}
