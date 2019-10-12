import java.io.*;

/**缓冲流实现文件读写*/
public class BufferReader {
    public static void main(String[] args){
        File f=new File("d:/字符流/原文件.txt");
        try(FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr)){
            while(true){
                String line=br.readLine();
                if(null==line)
                break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
