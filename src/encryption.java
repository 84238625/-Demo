import java.io.*;
/**加密*/
public class encryption {
    /**加密方法：encodeFile
     * encodingFile是原文件
     * encodedFile是加密后的文件
     * 如果为数字则+1,如果是9则变为0；
     * 如果是字母，则变为后一个字母，若为z或Z，变为a或A
     * 例如：089aCz  则变为  190bDa*/
    public  void encodeFile(File encodingFile, File encodedFile) {
      try(FileReader fr=new FileReader(encodingFile);FileWriter fw=new FileWriter(encodedFile)) {
          char[] a=new char[(int)encodingFile.length()];
          fr.read(a);
          for (char b:a
               ) {
              if(b=='9'){
                  b='0';
              }
             else if('0'<=b&&b<'9'){
                  b=(char)(b+1);
              }
             else if(b=='Z'){
                 b='A';
              }
             else if(b=='z'){
                 b='a';
              }
             else if('a'<=b&&b<='z'){
                 b=(char)(b+1);
              }
             else if('A'<=b&&b<='Z'){
                 b=(char)(b+1);
              }
             else {
                 b=b;
              }
              fw.write(b);

          }





      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
    }

}
