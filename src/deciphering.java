import java.io.*;
public class deciphering {
    public void decodeFile(File decodingFile, File decodedFile) throws IOException {
        try(FileReader fr=new FileReader(decodingFile);FileWriter fw=new FileWriter(decodedFile)){
            char[] a=new char[(int)decodingFile.length()];
            fr.read(a);
            for (char b:a
                 ) {
                if(b=='0'){
                    b='9';
                }
                else if('1'<=b&&b<='9'){
                    b=(char)(b-1);
                }
                else if(b=='a'){
                    b='z';
                    }
                else if(b=='A'){
                    b='Z';
                }
                else if('b'<=b&&b<='z'){
                    b=(char)(b-1);

                }
                else if('B'<=b&&b<='Z'){
                    b=(char)(b-1);
                }
                else {
                    b=b;
                }
                fw.write(b);
            }
            }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }

