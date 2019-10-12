import java.io.File;
import java.io.IOException;


public class test {
    public static void main(String[] args) throws IOException {
        File fread=new File("d:/加密/原文件.txt");
        File fwrite=new File("d:/加密/加密文件.txt");
        File feciWrite=new File("d:/加密/解密文件.txt");

        encryption ep=new encryption();
        ep.encodeFile(fread,fwrite);
        deciphering dp=new deciphering();
        dp.decodeFile(fwrite,feciWrite);

    }
}
