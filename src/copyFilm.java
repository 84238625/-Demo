import java.io.*;
/**字节缓冲流实现视频的读写*/
public class copyFilm {
    public static void main(String[] args){
            File f1=new File("D:\\Huawei Share\\OneHop\\1.mp4");
            File f2=new File("D:\\Huawei Share\\OneHop\\2.mp4");
            try(
                    FileInputStream fis=new FileInputStream(f1);
                    BufferedInputStream bis=new BufferedInputStream(fis);
                    FileOutputStream fos=new FileOutputStream(f2);
                    BufferedOutputStream bos=new BufferedOutputStream(fos);
                    ) {
                byte[] a=new byte[1024];
                int len=-1;
                while((len=bis.read(a))!=-1){
                    bos.write(a,0,len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
